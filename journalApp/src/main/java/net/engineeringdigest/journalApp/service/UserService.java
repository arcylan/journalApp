package net.engineeringdigest.journalApp.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
import net.engineeringdigest.journalApp.entity.Users;
import net.engineeringdigest.journalApp.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;

    private static final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public List<Users> getAll(){
        return userRepository.findAll();
    }

    public boolean saveNewUser(Users user){
        try{
            // Check if user with same username already exists
            Users existingUser = userRepository.findByUsername(user.getUsername());
            if (existingUser != null) {
                log.warn("Attempt to create user with duplicate username: {}", user.getUsername());
                return false;
            }
            
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            user.setRole(Arrays.asList("USER"));
            userRepository.save(user);
            log.info("Successfully created new user: {}", user.getUsername());
            return true;
        } catch (Exception e) {
            log.error("Error creating user with username: {}. Error: {}", user.getUsername(), e.getMessage(), e);
            return false;
        }
    }
    public void saveAdmin(Users user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole(Arrays.asList("USER","ADMIN"));
        userRepository.save(user);
    }
    public void saveUser(Users user){

        userRepository.save(user);
    }

    public Optional<Users> findById(ObjectId id){
        return userRepository.findById(id);
    }
    public void deleteById(ObjectId id){
        userRepository.deleteById(id);
    }
    public Users findByUsername(String username){
        return userRepository.findByUsername(username);
    }
}

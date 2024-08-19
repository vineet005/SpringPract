package com.example.demoCRUD.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> filterUsers(Integer age, String city){
        if (age != null && city != null)
            return userRepository.findByAgeAndCity(age, city);
        else if(age != null)
            return userRepository.findByAge(age);
        else if(city != null)
            return userRepository.findByCity(city);
        else
            return userRepository.findAll();
    }
}

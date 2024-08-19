package com.example.demoCRUD.model;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class UserRepository  {
    private List<User> users=new ArrayList<>();
    public UserRepository(){
        users.add(new User(1L, "Vineet", 23, "Gurugram"));
        users.add(new User(2L, "Thakran", 32, "Pataudi"));
        users.add(new User(3L, "John", 17, "New York"));
    }

    public List<User> findAll(){
        return users;
    }
    public List<User> findByAgeAndCity(Integer age, String city){
        return users.stream()
                .filter(user -> (user.getAge()==age)&&(user.getCity().equalsIgnoreCase(city)))
                .collect(Collectors.toList());
    }


    public List<User> findByAge(Integer age) {
        return users.stream()
                .filter(user -> (user.getAge() == age))
                .collect(Collectors.toList());
    }

    public List<User> findByCity(String city) {
        return users.stream()
                .filter(user -> (user.getCity()).equalsIgnoreCase(city))
                .collect(Collectors.toList());
    }
}

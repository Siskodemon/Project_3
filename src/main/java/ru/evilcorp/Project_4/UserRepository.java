package ru.evilcorp.Project_4;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Component
public class UserRepository {
    private Map<Long,User> users = new HashMap<>();
    private AtomicLong counter = new AtomicLong();


    public List<User> getAllUsers(){
        return new ArrayList<>(users.values());
    }

    public User findById(Long id){
     return users.get(id);
    }

    public User saveUser(Long id, User user){
        if (id == null){
            user.setId(counter.incrementAndGet()) ;
        }
        users.put(user.getId(), user);
        return user;
    }
}

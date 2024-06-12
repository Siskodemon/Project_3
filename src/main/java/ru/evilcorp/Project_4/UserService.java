package ru.evilcorp.Project_4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers(){
        userRepository.saveUser(new User(null, "Evgeniy","fbwsdjh@mail.ru"));
        userRepository.saveUser(new User(null, "Dmitriy","rwr@mail.ru"));
        userRepository.saveUser(new User(null, "Alexander","fwetewrt@mail.ru"));
        return userRepository.getAllUsers();
    }

    public User getUserById(Long id){
        return userRepository.findById(id);
    }
}

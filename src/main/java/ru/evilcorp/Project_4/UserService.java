package ru.evilcorp.Project_4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers(){
        userRepository.saveUser(null, new User("Evgeniy","fbwsdjh@mail.ru"));
        userRepository.saveUser(null, new User("Dmitriy","rwr@mail.ru"));
        userRepository.saveUser(null, new User("Alexander","fwetewrt@mail.ru"));
        return userRepository.getAllUsers();
    }

    public User getUserById(Long id){
        return userRepository.findById(id);
    }
}

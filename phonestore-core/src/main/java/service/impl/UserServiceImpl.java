package service.impl;

import domain.User;
import repository.UserRepository;
import service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService{
    private UserRepository userRepository;
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository=userRepository;
    }
    public void create(User user) {
        this.userRepository.createUser(user);
    }

    public User findUser(Long userId) {
        return this.userRepository.findUser(userId);
    }

    public List<User> findUsers() {
        return this.userRepository.findUsers();
    }
}

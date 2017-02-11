package service;

import domain.User;

import java.util.List;

public interface UserService {
    void create(User user);
    User findUser(Long userId);
    List<User> findUsers();
}

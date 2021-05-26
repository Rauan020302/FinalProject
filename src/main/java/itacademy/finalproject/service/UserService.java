package itacademy.finalproject.service;

import itacademy.finalproject.entity.User;
import itacademy.finalproject.model.AuthModel;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User saveUsers(User user);
    User getUserById(Long id);
    User deleteUserById(Long id);
    User findByUsername(String login);
    String getTokenByAuthModel(AuthModel authModel);
    List<User> findAllByStatus(Long status);
    User updateUser(User user, Long id);
}

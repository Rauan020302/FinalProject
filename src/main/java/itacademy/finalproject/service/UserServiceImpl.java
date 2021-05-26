package itacademy.finalproject.service;

import itacademy.finalproject.entity.User;
import itacademy.finalproject.entity.UserRole;
import itacademy.finalproject.model.AuthModel;
import itacademy.finalproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Base64;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserRoleService userRoleService;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User saveUsers(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user = userRepository.save(user);
        UserRole userRole = new UserRole();
        userRole.setRoleName("ROLE_USER");
        userRole.setUser(user);
        userRoleService.save(userRole);
        return user;
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User deleteUserById(Long id) {
        User user = getUserById(id);
        if (user != null){
            userRepository.delete(user);
            return user;
        }
        return null;
    }

    @Override
    public User findByUsername(String login) {
        return userRepository.findByUsername(login).orElse(null);
    }

    @Override
    public String getTokenByAuthModel(AuthModel authModel) {
        String result = "";
        User user = findByUsername(authModel.getUsername());
        if (user == null) result = "Неверный логин/пароль";
        else {
            if (passwordEncoder.matches(authModel.getPassword(), user.getPassword())) {
                String loginPassPair = user.getUsername() + ":" + authModel.getPassword();
                result = "Basic " + Base64.getEncoder()
                        .encodeToString(loginPassPair.getBytes());

            } else result = "Неверный логин/пароль";
        }
        return result;
    }

    @Override
    public List<User> findAllByStatus(Long status) {
        return userRepository.findAllByStatus(status);
    }

    @Override
    public User updateUser(User user, Long id) {
        User user1 = getUserById(id);
        user1.setStatus(user.getStatus());
        return saveUsers(user1);
    }
}

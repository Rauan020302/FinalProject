package itacademy.finalproject.controller;

import itacademy.finalproject.entity.User;
import itacademy.finalproject.model.AuthModel;
import itacademy.finalproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/sign-up")
    public User save(@RequestBody User user){
        return userService.saveUsers(user);
    }

    @PostMapping("/sign-in")
    public String getToken(@RequestBody AuthModel authModel){
        return userService.getTokenByAuthModel(authModel);
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id){
        return userService.getUserById(id);
    }

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @DeleteMapping("/{id}")
    public User deleteUserById(@PathVariable Long id){
        return userService.deleteUserById(id);
    }

    @GetMapping("/get_name")
    public String getName(Principal principal){
        return principal.getName();
    }

    @GetMapping("/get_status/{status}")
    public List<User> findAllByStatus(@PathVariable Long status){
        return userService.findAllByStatus(status);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id,@RequestBody User user){
        return userService.updateUser(user,id);
    }
}

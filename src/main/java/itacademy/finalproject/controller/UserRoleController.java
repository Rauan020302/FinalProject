package itacademy.finalproject.controller;

import itacademy.finalproject.entity.UserRole;
import itacademy.finalproject.model.UserRoleModel;
import itacademy.finalproject.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user_role")
public class UserRoleController {
    @Autowired
    private UserRoleService userRoleService;

    @PostMapping
    public UserRole save (@RequestBody UserRoleModel userRoleModel) throws IllegalAccessException {
        return userRoleService.save(userRoleModel);
    }

    @GetMapping("/{id}")
    public UserRole getUserRoleById(@PathVariable Long id){
        return userRoleService.getUserRoleById(id);
    }

    @PutMapping("/{id}")
    public UserRole updateUserRole(@PathVariable Long id,@RequestBody UserRoleModel userRoleModel){
        return userRoleService.updateUserRole(userRoleModel,id);
    }

    @DeleteMapping("/{id}")
    public UserRole deleteUserRole(@PathVariable Long id) {
        return userRoleService.deleteUserRole(id);
    }

}

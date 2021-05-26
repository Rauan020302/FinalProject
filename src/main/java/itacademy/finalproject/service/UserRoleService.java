package itacademy.finalproject.service;

import itacademy.finalproject.entity.UserRole;
import itacademy.finalproject.model.UserRoleModel;

public interface UserRoleService {
    UserRole save(UserRole userRole);
    UserRole save(UserRoleModel userRoleModel) throws IllegalAccessException;
    UserRole getUserRoleById(Long id);
    UserRole deleteUserRole(Long id);
    UserRole updateUserRole(UserRoleModel userRoleModel,Long id);
}

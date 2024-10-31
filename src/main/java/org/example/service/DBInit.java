package org.example.service;

import org.example.entity.Role;
import org.example.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

@Component
public class DBInit {

    private final UserServiceImpl userServiceImpl;
    private final RoleServiceImpl roleServiceImpl;

    @Autowired
    public DBInit(UserServiceImpl userServiceImpl, RoleServiceImpl roleServiceImpl) {
        this.userServiceImpl = userServiceImpl;
        this.roleServiceImpl = roleServiceImpl;

    }

    @PostConstruct
    private void postConstruct() {
        Role role1 = new Role("ROLE_ADMIN");
        Role role2 = new Role("ROLE_USER");
        roleServiceImpl.addRole(role1);
        roleServiceImpl.addRole(role2);
        Set<Role> roles_admin = new HashSet<>();
        roles_admin.add(roleServiceImpl.getRoleByName("ROLE_ADMIN"));
        User admin = new User("admin", "admin", "admin@admin.ru", "1234", roles_admin);
        userServiceImpl.addUser(admin);
        Set<Role> roles_user = new HashSet<>();
        roles_user.add(roleServiceImpl.getRoleByName("ROLE_USER"));
        User user = new User("user", "user",
                "user@user.ru", "1234", roles_user);
        userServiceImpl.addUser(user);
    }
}

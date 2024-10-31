package org.example.service;


import org.example.entity.Role;

import java.util.List;

public interface RoleService {

    void addRole(Role role);

    List<Role> getAllRoles();

    Role getRoleByName(String name);


}

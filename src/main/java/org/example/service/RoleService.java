package org.example.service;



import org.example.entity.Role;

import java.util.List;

public interface RoleService {

        public void addRole(Role role);

        public void updateRole(Role role);

        public void removeRoleById(long id);

        public List<Role> getAllRoles();

        public Role getRoleByName(String name);


}

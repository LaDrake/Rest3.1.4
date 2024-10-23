package org.example.service;


import org.example.dao.RoleRepository;
import org.example.entity.Role;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RoleServiceImpl implements RoleService {
    private final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }


    public void addRole(Role role) {
        roleRepository.save(role);
    }

    public void updateRole(Role role) {
        roleRepository.saveAndFlush(role);
    }

    public void removeRoleById(long id) {
        roleRepository.deleteById(id);
    }

    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    public Role getRoleByName(String name) {
        return roleRepository.findByname(name);
    }
}

package springboot.huydinh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springboot.huydinh.entity.Role;
import springboot.huydinh.entity.RoleName;
import springboot.huydinh.repository.IRoleRepository;
import springboot.huydinh.service.IRoleService;

import java.util.Optional;

@Service
public class RoleServiceImpl implements IRoleService {

	@Autowired
	IRoleRepository roleRepository;

	@Override
	public Optional<Role> findByName(RoleName name) {
		// TODO Auto-generated method stub
		return roleRepository.findByName(name);
	}
	
}

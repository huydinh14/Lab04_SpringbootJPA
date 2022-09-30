package springboot.huydinh.service;

import springboot.huydinh.entity.Role;
import springboot.huydinh.entity.RoleName;

import java.util.Optional;

public interface IRoleService {
	Optional<Role> findByName(RoleName name);
}

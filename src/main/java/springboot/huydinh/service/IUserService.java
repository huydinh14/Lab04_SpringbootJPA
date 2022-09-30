package springboot.huydinh.service;
import springboot.huydinh.entity.User;

import java.util.Optional;

public interface IUserService {
	Optional<User> findByUsername(String username);
	Boolean existsByUsername(String username);
	Boolean existsByEmail(String email); 
	User save(User user);	
}

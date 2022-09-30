package springboot.huydinh.security.userpincal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import springboot.huydinh.entity.User;
import springboot.huydinh.repository.IUserRepository;

@Service
public class UserDetailService implements UserDetailsService{
	@Autowired
	IUserRepository userRepository;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user = userRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("User not found -> user name or password" + username));
		return UserPrinciple.build(user);
	}

}

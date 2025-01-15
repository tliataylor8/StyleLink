package com.StyleLink.StyleLink.Service;

import com.StyleLink.StyleLink.Repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	private final UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
    //GetAll User
	public List<User> getAlluser(){
		return_userRepository.findAll();
	}
	
	//createUser
	public_User CreateUser(User user) {
		return userRepository.save(user);
	}
	
	//GetUserById
	public Optional<User> getUserbyId(Long id){
		return_userRepository.findbyId(id);
	}
	
	//deleteUser
	public void deleteUser(Long id) {
		userRepository.deletebyId(id);
	}
	
}

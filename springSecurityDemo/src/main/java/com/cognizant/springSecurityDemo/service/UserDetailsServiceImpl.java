package com.cognizant.springSecurityDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.cognizant.springSecurityDemo.entity.User;
import com.cognizant.springSecurityDemo.repositories.UserRepository;
import com.cognizant.springSecurityDemo.security.CustomSecurityUser;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	private UserRepository userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepo.findByUsername(username);
		
		if(user==null) {
			throw new UsernameNotFoundException("Username or password is incorrect.");
		}
		
		return new CustomSecurityUser(user);
	}
}

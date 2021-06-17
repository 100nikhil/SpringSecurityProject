package com.cognizant.springSecurityDemo.security;

import org.springframework.security.core.userdetails.UserDetails;

import com.cognizant.springSecurityDemo.entity.User;

public class CustomSecurityUser extends User implements UserDetails{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7142222273294752171L;

//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		return null;
//	}

	public CustomSecurityUser() {}
	
	public CustomSecurityUser(User user) {
		this.setAuthorities(user.getAuthorities());
		this.setId(user.getId());
		this.setPassword(user.getPassword());
		this.setUsername(user.getUsername());
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}

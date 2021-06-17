package com.cognizant.springSecurityDemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cognizant.springSecurityDemo.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	@Query("select u from User u"
		      + " left join fetch u.authorities"
		      + " where u.username = :username")
	User findByUsername(String username);

}

package com.deepesh.application.service.impl;

import com.deepesh.application.entity.UserDetails;
import com.deepesh.application.repository.UserDetailsRepository;
import com.deepesh.application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDetailsRepository detailsRepository;

	@Override
	public UserDetails saveUserDetails(UserDetails userDetails) {

		return detailsRepository.save(userDetails);
	}

}

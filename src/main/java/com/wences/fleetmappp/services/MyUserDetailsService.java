//package com.wences.fleetmappp.services;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import com.wences.fleetmappp.models.User;
//import com.wences.fleetmappp.models.UserPrincipal;
//import com.wences.fleetmappp.repositories.UserRepository;
//
//@Service
//public class MyUserDetailsService implements UserDetailsService {
//	
//	@Autowired
//	private UserRepository  userRepository;
//
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//
//		User user = userRepository.findByUsername(username);
//		if(user==null) {
//			throw new UsernameNotFoundException("User not found!");
//		}
// 
//		return new UserPrincipal(user);
//	}
//
//}

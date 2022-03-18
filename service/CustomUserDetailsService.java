package com.siddhantbhardwaj.jwtspringbootmysql.service;

import com.siddhantbhardwaj.jwtspringbootmysql.entity.CustomUser;
import com.siddhantbhardwaj.jwtspringbootmysql.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        CustomUser user = userRepository.findByUsername(username);
        return new User(
                user.getUsername(),
                user.getPassword(),
                new ArrayList<>()
        );
    }
}

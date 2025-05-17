package com.product_app.product_app.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.product_app.product_app.model.User;
import com.product_app.product_app.repository.UserRepository;



@Service
public class UserDetailsServiceVouch implements UserDetailsService{

    @Autowired
    UserRepository user_repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user=user_repo.findByEmail(username);

        if(user==null){
            throw new UsernameNotFoundException("User not found!"+username);
        }
        
        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), user.getRoles());
    }
    
}

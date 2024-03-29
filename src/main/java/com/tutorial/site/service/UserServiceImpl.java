package com.tutorial.site.service;

import com.tutorial.site.domain.User;
import com.tutorial.site.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    @Cacheable("users")
    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }
}

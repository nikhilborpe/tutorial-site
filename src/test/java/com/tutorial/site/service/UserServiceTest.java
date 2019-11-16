package com.tutorial.site.service;

import com.tutorial.site.TutorialSiteApplication;
import com.tutorial.site.domain.User;
import com.tutorial.site.repository.UserRepository;
import org.h2.engine.UserBuilder;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {TutorialSiteApplication.class})
public class UserServiceTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    UserService userService;

    @Before
    public void setUp() {
        for (int i = 0; i < 3; i++) {
            User user=new User();
            user.setUserName("nborpe"+i);
            user.setFirstName("Nikhil"+i);
            user.setMiddleName("BhagawanRao"+i);
            user.setLastName("Borpe"+i);
            userRepository.save(user);
        }
    }

    @Test
    public void testUserService() {
        Iterable<User> list = userService.getAllUsers();
        List<User> users=new ArrayList<>();
        list.forEach(item->users.add(item));
        assertEquals(users.size(),3);
    }

}

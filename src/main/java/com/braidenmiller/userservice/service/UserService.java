package com.braidenmiller.userservice.service;

import com.braidenmiller.userservice.dao.UserEntity;
import com.braidenmiller.userservice.dao.UserRepo;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserService {
    private final UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public List<UserEntity> getAllUsers() {
        return userRepo.findAll();
    }
}

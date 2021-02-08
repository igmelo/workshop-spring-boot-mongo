package com.igormelo.workshopmongo.services;

import com.igormelo.workshopmongo.domain.User;
import com.igormelo.workshopmongo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findALl(){
        return repo.findAll();
    }
}

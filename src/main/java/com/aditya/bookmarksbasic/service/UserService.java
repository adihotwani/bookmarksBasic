package com.aditya.bookmarksbasic.service;

import com.aditya.bookmarksbasic.model.Users;
import com.aditya.bookmarksbasic.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class UserService {

    @Autowired
    public UserRepository repo;

    public Response createUser(Users user){
        List<Users> usersList = repo.findAll();

        for(Users user1: usersList){
            if(user1.equals(user)){
                return Response.USER_EXISTS;
            }
        }
        repo.save(user);
        return Response.SUCCESS;
    }

    public Response login(Users user){
        List<Users> list = repo.findAll();
        for(Users CUser: list){
            if(CUser.equals(user)){
                user.setStatus(true);
                repo.save(user);
                return Response.SUCCESS;
            }
        }
        return Response.Failure;
    }

}

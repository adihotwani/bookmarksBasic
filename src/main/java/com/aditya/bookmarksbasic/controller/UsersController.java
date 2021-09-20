package com.aditya.bookmarksbasic.controller;

import com.aditya.bookmarksbasic.model.Users;
import com.aditya.bookmarksbasic.service.Response;
import com.aditya.bookmarksbasic.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {

    @Autowired
    public UserService service;

    @PostMapping("/user/register")
    public Response userRegister(@RequestBody Users user){
        if(service.createUser(user) == Response.SUCCESS){
            return Response.SUCCESS;
        }
        return Response.USER_EXISTS;
    }

    @PostMapping("user/login")
    public Response loginUser(@RequestBody Users user){
        if(service.login(user)== Response.SUCCESS){
            return Response.SUCCESS;
        }
        return Response.Failure;
    }
}

package com.chenyang.recommendation_system.controller;

import com.chenyang.recommendation_system.service.ITopUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TopUsersController {
    @Autowired
    private ITopUserService iTopUserService;
}

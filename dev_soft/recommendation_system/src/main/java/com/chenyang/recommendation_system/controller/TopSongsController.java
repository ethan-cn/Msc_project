package com.chenyang.recommendation_system.controller;

import com.chenyang.recommendation_system.service.ITopSongsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TopSongsController {
    @Autowired
    private ITopSongsService iTopSongsService;
}

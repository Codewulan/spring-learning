package com.paige.api.controller;

import com.paige.api.bean.Response;
import com.paige.api.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author paige
 * @create 2020-09-20 20:01
 */
@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    private StudentService stuService;

    @GetMapping("/basicInfo/query")
    public Response queryBasicInfo(@RequestParam String id) {
        return new Response().success(stuService.queryBasicInfoById());
    }
}
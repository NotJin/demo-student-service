package com.fai.demostudentservice.rets;

import org.apache.coyote.Request;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class StudentController {
    @GetMapping("/student")
    public String restStudent(){
        return "Hello world";
    }
}

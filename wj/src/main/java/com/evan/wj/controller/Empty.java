package com.evan.wj.controller;

import com.evan.wj.result.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Empty {
    @GetMapping("api/test")
    public String test(){
        return "test";
    }
}

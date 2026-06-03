package com.octaver.octnocode.controller;

import com.octaver.octnocode.common.BaseResponse;
import com.octaver.octnocode.common.ResultUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class TestController {
    @GetMapping("/")
    public BaseResponse<String> index() {
        return ResultUtils.success("Hello World");
    }
}
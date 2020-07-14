package com.example.demo.controller;

import com.example.demo.common.QueryTest;
import com.example.demo.common.RestResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "test",tags = "test API")
@RestController
@RequestMapping(value = "my/markdown")
public class TestController {

    @ApiOperation(value = "get 请求" ,tags = "1212")
    @GetMapping(value = "mufeng")
    public RestResultVO<String> getMy(QueryTest queryTest){
        return new RestResultVO<String>(200,"成功","哈哈");
    }
}

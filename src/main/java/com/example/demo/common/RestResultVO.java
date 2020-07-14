package com.example.demo.common;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("返回结果")
public class RestResultVO<R> {

    @ApiModelProperty(value = "状态码")
    private int statusCode;

    @ApiModelProperty(value = "信息")
    private String message;

    @ApiModelProperty(value = "返回值")
    private R result;

    public RestResultVO(int statusCode, String message, R result) {
        this.statusCode = statusCode;
        this.message = message;
        this.result = result;
    }

    public RestResultVO(int statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }
}



package com.ctrip.framework.longpoll.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/app")
public class AsyncController {
    /**
     * 长轮询接口
     * <p>
     * http://localhost:8080/app/asyncGet?requestName=123
     *
     * @param requestName
     * @param request
     * @param response
     */
    @GetMapping("/asyncGet")
    public void getDemo(@RequestParam(value = "requestName") String requestName, HttpServletRequest request, HttpServletResponse response) {
    }
}

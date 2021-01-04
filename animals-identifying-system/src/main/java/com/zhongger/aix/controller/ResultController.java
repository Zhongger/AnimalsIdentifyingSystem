package com.zhongger.aix.controller;

import com.zhongger.aix.domain.Result;
import com.zhongger.aix.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/result")
public class ResultController {

    @Autowired
    private ResultService resultService;

    @ResponseBody
    @RequestMapping("/list")
    public Map<String,Object> list(){
        Map<String, Object> map = new HashMap<>();
        List<Result> list = resultService.list();
        map.put("msg","结论");
        map.put("data",list);
        return map;
    }
}

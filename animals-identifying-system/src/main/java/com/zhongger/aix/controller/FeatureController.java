package com.zhongger.aix.controller;

import com.zhongger.aix.domain.Feature;
import com.zhongger.aix.service.FeatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/feature")
public class FeatureController {

    @Autowired
    private FeatureService featureService;

    @RequestMapping("/list")
    @ResponseBody
    public Map<String,Object> list(){
        List<Feature> list = featureService.list();
        Map<String, Object> map = new HashMap<>();
        map.put("msg","特征");
        map.put("data",list);
        return map;
    }


}

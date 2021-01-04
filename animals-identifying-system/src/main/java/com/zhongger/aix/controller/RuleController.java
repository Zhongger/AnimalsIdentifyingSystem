package com.zhongger.aix.controller;

import com.zhongger.aix.domain.*;
import com.zhongger.aix.service.RuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/rule")
public class RuleController {

    @Autowired
    private RuleService ruleService;

    @RequestMapping("/list")
    public List<Rule> list() {
        List<Rule> list = ruleService.list();
        return list;
    }

    @RequestMapping("/add")
    public Map<String, Object> add(@RequestBody AddRule addRule) {
        Rule rule = new Rule();
        StringBuffer stringBuffer = new StringBuffer();
        List<Feature> featureList = addRule.getFeatureList();
        Result result = addRule.getResult();
        featureList.forEach(feature -> stringBuffer.append(feature.getDescription() + ","));
        String features = stringBuffer.toString();
        rule.setFeatures(features);
        rule.setResult(result.getDescription());
        ruleService.add(rule);
        HashMap<String, Object> map = new HashMap<>();
        map.put("msg", "新增规则成功");
        return map;
    }
}

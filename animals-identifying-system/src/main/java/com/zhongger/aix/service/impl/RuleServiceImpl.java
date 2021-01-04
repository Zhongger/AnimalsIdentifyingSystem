package com.zhongger.aix.service.impl;

import com.zhongger.aix.domain.Rule;
import com.zhongger.aix.domain.RuleVO;
import com.zhongger.aix.mapper.RuleMapper;
import com.zhongger.aix.service.RuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RuleServiceImpl implements RuleService {
    @Autowired
    private RuleMapper ruleMapper;
    @Override
    public void add(Rule rule) {
        ruleMapper.insert(rule);
    }

    @Override
    public List<Rule> list() {
        return ruleMapper.selectList(null);
    }

    @Override
    public List<RuleVO> listRuleVO(List<Rule> ruleList) {
        List<RuleVO> list = new ArrayList<>();
        for (Rule rule : ruleList) {
            RuleVO ruleVO = new RuleVO();
            ruleVO.setId(rule.getId());
            ruleVO.setResult("then "+rule.getResult());
            String[] features = rule.getFeatures().split(",");
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("IF ");
            for (int i = 0; i < features.length - 1; i++) {
                stringBuffer.append(features[i]+" ");
            }
            ruleVO.setDescription(stringBuffer.toString());
            list.add(ruleVO);
        }
        return list;
    }
}

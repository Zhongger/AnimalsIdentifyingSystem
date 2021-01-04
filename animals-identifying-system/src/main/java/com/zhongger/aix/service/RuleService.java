package com.zhongger.aix.service;

import com.zhongger.aix.domain.Rule;
import com.zhongger.aix.domain.RuleVO;

import java.util.List;

public interface RuleService {
    void add(Rule rule);

    List<Rule> list();

    List<RuleVO> listRuleVO(List<Rule> ruleList);
}

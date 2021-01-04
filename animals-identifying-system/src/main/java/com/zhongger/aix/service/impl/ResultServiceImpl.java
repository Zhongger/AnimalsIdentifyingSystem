package com.zhongger.aix.service.impl;

import com.zhongger.aix.domain.Result;
import com.zhongger.aix.mapper.ResultMapper;
import com.zhongger.aix.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ResultServiceImpl implements ResultService {

    @Autowired
    private ResultMapper resultMapper;

    @Override
    public List<Result> list() {
        return resultMapper.selectList(null);
    }
}

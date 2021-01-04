package com.zhongger.aix.service.impl;

import com.zhongger.aix.domain.Feature;
import com.zhongger.aix.mapper.FeatureMapper;
import com.zhongger.aix.service.FeatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FeatureServiceImpl implements FeatureService {

    @Autowired
    private FeatureMapper featureMapper;

    @Override
    public List<Feature> list() {
        return featureMapper.selectList(null);
    }
}

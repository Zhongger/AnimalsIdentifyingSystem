package com.zhongger.aix.domain;

import java.util.List;

public class AddRule {
    private List<Feature> featureList;
    private Result result;

    public List<Feature> getFeatureList() {
        return featureList;
    }

    public void setFeatureList(List<Feature> featureList) {
        this.featureList = featureList;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }
}

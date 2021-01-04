package com.zhongger.aix.domain;

/**
 * 特征，例如会飞、有毛、吃肉等特征
 */
public class Feature {
    private Integer id;
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

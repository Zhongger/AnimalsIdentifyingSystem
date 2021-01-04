package com.zhongger.aix.domain;

/**
 * 结论，例如：哺乳动物、爬行动物、鸟类等
 */
public class Result {
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

package com.data.manager.enums;

/**
 * @author wqkenqing
 * @emai wqkenqingto@163.com
 * @time 2020/2/19
 * @desc
 */
public enum ManagerTag {
    /**
     * 分割tag
     */
    SPILTE_TAG(",");


    ManagerTag(String tag) {
        this.tag = tag;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    private String tag;
}

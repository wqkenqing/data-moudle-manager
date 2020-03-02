package com.data.manager.enums;

/**
 * @author wqkenqing
 * @emai wqkenqingto@163.com
 * @time 2020/2/18
 * @desc topic监听信息落地地址
 */
public enum MonitorOutFileEnum {
    /**
     * 本地输出地址
     */
    LOCAL_OUT_PATH("/Users/wqkenqing/Desktop/deploy_code/data_monitor/src/main/resources/out/local/topic_info.txt"),
    /**
     * 京东环境输出地址
     */
    JD_OUT_PATH("/Users/wqkenqing/Desktop/deploy_code/data_monitor/src/main/resources/out/jd/topic_info.txt");
    private String path;

    MonitorOutFileEnum(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

}

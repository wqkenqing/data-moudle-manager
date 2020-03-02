package com.data.manager.enums;

/**
 * @author wqkenqing
 * @emai wqkenqingto@163.com
 * @time 2020/2/18
 * @desc
 */

public enum ConfigEnum {
    /*本地kafka配置*/
    LOCAL_CONFIG_PATH("test/monitor_config/local/local_kafka.props"),
    /*京东kafka配置*/
    JD_CONFIG_PATH("test/monitor_config/jd/jd_kafka.props"),
    ;

    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    ConfigEnum(String path) {
        this.path = path;
    }

}

package com.data.manager.enums;

/**
 * @author wqkenqing
 * @emai wqkenqingto@163.com
 * @time 2020/2/18
 * @desc
 */
public enum TopicEnum {
    /*本地topic配置文件*/
    LOCAL_TOPIC_PATH("test/monitor_config/local/topics"),
    /*京东云topic配置文件*/
    JD_TOPIC_PATH("test/monitor_config/jd/topics");

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    private String topic;

    TopicEnum(String topic) {
        this.topic = topic;
    }

}

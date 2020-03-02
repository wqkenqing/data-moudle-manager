package com.data.manager.model;

import lombok.Data;

/**
 * @author wqkenqing
 * @emai wqkenqingto@163.com
 * @time 2020/2/20
 * @desc
 */
@Data
public class KafkaTopic {
    /**
     * topic name
     */
    private String name;
    /**
     * the partition number of topic
     */
    private int parition;
    /**
     * the replica number of topic
     */
    private int replica;
    /**
     * the  offset of topic
     */
    private long offset;
    /**
     * the timestamp of message
     */
    private long timestamp;
    /**
     * the message of toipc
     */
    private String message;
}

package com.data.manager.model;

import lombok.Data;

/**
 * @author wqkenqing
 * @emai wqkenqingto@163.com
 * @time 2020/2/18
 * @desc topic对应info
 */
@Data
public class TopicInfo {
    /**
     * 该toipc对应的最新offset
     */
    private Long offset;
    /**
     * 改topic对应的更新时间戳
     */
    private String timstamp;
    /**
     * 该toipc对应的未更新次数
     */
    private int count;
}

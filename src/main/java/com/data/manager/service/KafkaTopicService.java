package com.data.manager.service;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/**
 * @author wqkenqing
 * @emai wqkenqingto@163.com
 * @time 2020/2/20
 * @desc
 */
public interface KafkaTopicService {
    /**
     * @desc: create topic of kafka
     * @date: 2020/2/20
     **/
    void createTopic(Set<NewTopic> newTopics) throws InterruptedException;

    /**
     * @desc: get information of topic
     * @date: 2020/2/20
     **/
    void getTopicInfo();

    /**
     * @desc: delete some topics of kafka
     * @date: 2020/2/20
     **/
    void deleteTopic(Set<String> topicSet);

    /**
     * @desc: show  the most of  topics of kafka
     * @date: 2020/2/20
     **/
    Set<String> showTopics() throws ExecutionException, InterruptedException;
}

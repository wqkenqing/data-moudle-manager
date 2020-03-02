package com.data.manager.service.impl;

import com.data.manager.service.KafkaManager;
import com.data.manager.service.KafkaTopicService;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.admin.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * @author wqkenqing
 * @emai wqkenqingto@163.com
 * @time 2020/2/20
 * @desc some operations of  kakfa topic
 */
@Service
@Slf4j
public class KafkaTopicServiceImpl implements KafkaTopicService {
    @Autowired
    private KafkaManager manager;

    AdminClient client;

    @Bean
    public AdminClient getClient() {
        client = manager.createClient();
        return client;
    }

    //TODO 1.获得kafka操作类
    @Override
    public void createTopic(Set<NewTopic> newTopics) throws InterruptedException {
        AdminClient client = manager.createClient();
        CreateTopicsResult result = client.createTopics(newTopics);
    }

    @Override
    public void getTopicInfo() {
        //TODO
    }

    @Override
    public void deleteTopic(Set<String> topicSet) {
        client.deleteTopics(topicSet);
    }

    @Override
    public Set<String> showTopics() throws ExecutionException, InterruptedException {
        AdminClient client = manager.createClient();
        ListTopicsResult topicsResult = client.listTopics();
        Set<String> topicSet = topicsResult.names().get();
        return topicSet;
    }


}

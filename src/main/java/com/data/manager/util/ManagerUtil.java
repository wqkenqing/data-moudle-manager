package com.data.manager.util;

import org.apache.kafka.clients.admin.CreateTopicsResult;
import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.common.KafkaFuture;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import util.CommonUtil;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author wqkenqing
 * @emai wqkenqingto@163.com
 * @time 2020/2/20
 * @desc
 */
public class ManagerUtil extends CommonUtil {


    /**
     * @desc:
     * @date: 2020/2/23
     **/
    public void createTopicsResultChange(CreateTopicsResult result) {
        Map<String, KafkaFuture<Void>> kafkaMap = result.values();
    }

    /**
     * @desc: 通过切割字符串获得Set
     * @date: 2020/2/23
     * @parm: topics
     * @parm: tag
     * @return: Set<String>topicSet
     **/
    public static Set<String> StringToSet(String topics, String tag) {
        Set<String> topicSet = new HashSet<>();
        Arrays.asList(topics.split(tag)).forEach(topic -> {
            topicSet.add(topic);
        });
        return topicSet;
    }

    public static Set<NewTopic> StringToSetNewTopic(String topics, String tag) {
        Set<NewTopic> topicSet = new HashSet<>();

        Arrays.asList(topics.split(tag)).forEach(topic -> {
            NewTopic newTopic = new NewTopic(topic, 1, (short) 1);
            topicSet.add(newTopic);
        });
        return topicSet;
    }
}

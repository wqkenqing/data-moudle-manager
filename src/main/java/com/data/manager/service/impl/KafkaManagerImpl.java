package com.data.manager.service.impl;

import com.data.manager.service.KafkaManager;
import org.apache.kafka.clients.KafkaClient;
import org.apache.kafka.clients.admin.AdminClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaAdmin;
import org.springframework.stereotype.Component;

/**
 * @author wqkenqing
 * @emai wqkenqingto@163.com
 * @time 2020/2/20
 * @desc
 */
@Component
public class KafkaManagerImpl implements KafkaManager {

    @Autowired
    KafkaAdmin admin;

    @Override
    public AdminClient createClient() {
        AdminClient client = AdminClient.create(admin.getConfig());
        return client;
    }
}

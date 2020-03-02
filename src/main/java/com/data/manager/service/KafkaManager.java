package com.data.manager.service;

import org.apache.kafka.clients.admin.AdminClient;

/**
 * @author wqkenqing
 * @emai wqkenqingto@163.com
 * @time 2020/2/20
 * @desc
 */
public interface KafkaManager {
    /**
     * @desc:
     * @date: 2020/2/20
     **/
    AdminClient createClient();
}

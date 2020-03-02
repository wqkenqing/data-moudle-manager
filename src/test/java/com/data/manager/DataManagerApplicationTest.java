package com.data.manager;

import com.data.manager.service.ElastciSearchService;
import lombok.extern.slf4j.Slf4j;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.InetAddress;


/**
 * @author wqkenqing
 * @emai wqkenqingto@163.com
 * @time 2020/2/26
 * @desc
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class DataManagerApplicationTest {
    @Autowired
    private ElastciSearchService searchService;


    @Test
    public void test() {
        searchService.query();
    }


}
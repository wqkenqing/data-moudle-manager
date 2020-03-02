package com.data.manager.controller.kafka;

import com.alibaba.fastjson.JSONObject;
import com.data.manager.enums.ManagerTag;
import com.data.manager.service.KafkaTopicService;
import com.data.manager.util.ManagerUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
import java.util.concurrent.ExecutionException;

/**
 * @author wqkenqing
 * @emai wqkenqingto@163.com
 * @time 2020/2/23
 * @desc
 */
@RestController
@RequestMapping("/kafka")
@CrossOrigin(origins = "*")
@Slf4j
public class KafkaManagerController {
    @Autowired
    KafkaTopicService service;


    @RequestMapping("/hello")
    public String sayHell() {
        return "hello";
    }

    @PostMapping("/create/topic")
    public void createTopic(@RequestParam(value = "topics", required = true) String topics, @RequestParam(value = "partition") String partition, @RequestParam(value = "replica") String replica) throws InterruptedException {
        String tag = ManagerTag.SPILTE_TAG.getTag();
        Set<NewTopic> tset = ManagerUtil.StringToSetNewTopic(topics, tag);
        service.createTopic(tset);
        log.info("these topics [{}] had created successed!",topics);
    }

    @PostMapping("/delete/topic")
    public void deleteTopic(@RequestParam(value = "topics", required = true) String topics) {
        String tag = ManagerTag.SPILTE_TAG.getTag();
        Set<String> tset = ManagerUtil.StringToSet(topics, tag);
        service.deleteTopic(tset);
        log.info("these topics[{}] had deleted successed!");
    }

    @GetMapping("/showtopic")
    public String showTopics() throws ExecutionException, InterruptedException {
        Set<String> tset = service.showTopics();
        return JSONObject.toJSONString(tset);
    }
}

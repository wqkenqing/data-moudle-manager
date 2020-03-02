package com.data.manager.service.impl;

import com.data.manager.model.es.People;
import com.data.manager.service.ElastciSearchService;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.TermQueryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author wqkenqing
 * @emai wqkenqingto@163.com
 * @time 2020/2/26
 * @desc some operations
 */
@Component
public class ElastciSearchServiceImpl implements ElastciSearchService {

    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;

    public void query() {
//        MatchQueryBuilder query = QueryBuilders.matchQuery("name", "叶良辰");
        TermQueryBuilder query = QueryBuilders.termQuery("name", "傲天");
//        RangeQueryBuilder query = QueryBuilders.rangeQuery("age").from(25).to(27);
        NativeSearchQuery nquery = new NativeSearchQueryBuilder().withIndices("people").withTypes("man").withQuery(query).build();
        List<People> plist = elasticsearchTemplate.queryForList(nquery, People.class);
        plist.forEach(p -> {
            System.out.println(p.toString());
        });

    }


}

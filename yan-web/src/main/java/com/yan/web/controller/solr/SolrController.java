package com.yan.web.controller.solr;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 * 名称：SolrController<br>
 * <p>
 * 描述：Solr所搜引擎服务<br>
 *
 * @author Yanzheng 严正<br>
 * 时间：<br>
 * 2018-01-06 22:32:59<br>
 * 版权：<br>
 * Copyright 2017 <a href="https://github.com/micyo202" target="_blank">https://github.com/micyo202</a>. All rights reserved.
 */
@Controller
@RequestMapping("/solr")
public class SolrController {

    @Autowired
    private HttpSolrClient httpSolrClient;

    @RequestMapping("/test")
    @ResponseBody
    public String test() throws Exception {
        List list = new ArrayList();
        SolrQuery query = new SolrQuery();
        query.setQuery("* : *");
        // 设置分页信息
        query.setStart(0);
        query.setRows(10);
        // 设置排序
        query.setSort("date", SolrQuery.ORDER.desc);
        // 显示Field的集合域
        query.setFields("id,name");
        // 默认域
        query.set("df", "name");
        // 设置高亮
        query.setHighlight(true);
        query.addHighlightField("name");
        query.setHighlightSimplePre("<em>");
        query.setHighlightSimplePost("</em>");
        // 执行查询
        QueryResponse queryResponse = httpSolrClient.query(query);
        // 获取docs文档
        SolrDocumentList docs = queryResponse.getResults();
        System.out.println("共查询到" + docs.getNumFound() + "条记录");
        // 循环输出查询到的结果数据
        //docs.forEach(doc -> System.out.println(doc));

        // 获取高亮显示
        Map<String, Map<String, List<String>>> highlighting = queryResponse.getHighlighting();
        for (SolrDocument doc : docs) {
            List<String> hightDocs = highlighting.get(doc.get("id")).get("name");
            if (null != hightDocs) {
                System.out.println("高亮显示的内容为：" + hightDocs.get(0));
            } else {
                System.out.println(doc.get("name"));
            }
        }

        return "SUCCESS";
    }

}

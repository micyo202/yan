package com.yan.web.controller.solr;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocumentList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


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
    public List test() {
        List list = new ArrayList();
        SolrQuery query = new SolrQuery();
        query.setQuery("* : *");
        try {
            QueryResponse queryResponse = httpSolrClient.query(query);
            SolrDocumentList docs = queryResponse.getResults();
            Iterator it = docs.iterator();
            while (it.hasNext()) {
                list.add(it.next());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println(list.toString());
        return list;
    }

}

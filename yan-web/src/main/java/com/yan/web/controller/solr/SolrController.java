package com.yan.web.controller.solr;

import com.yan.core.controller.BaseController;
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
import java.util.Iterator;
import java.util.List;

@Controller
@RequestMapping("/solr")
public class SolrController extends BaseController {

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
            while(it.hasNext()){
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

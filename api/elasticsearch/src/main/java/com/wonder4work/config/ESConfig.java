package com.wonder4work.config;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xiezengcheng
 * @date 2020-08-19
 */
@Configuration
public class ESConfig {

//    @Bean
//    public RestHighLevelClient restHighLevelClient() {
//        RestHighLevelClient client = new RestHighLevelClient(
//                RestClient.builder(new HttpHost("192.168.7.119", 9200, "http")
//                //这里如果要用client去访问其他节点，就添加进去
//                ));
//        return client;
//    }


}

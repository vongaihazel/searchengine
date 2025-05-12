package com.example.searchengine.config;

import org.opensearch.client.RestHighLevelClient;
import org.opensearch.client.RestClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.apache.http.HttpHost;

@Configuration
public class OpenSearchConfig {

    @Bean
    public RestHighLevelClient openSearchClient() {
        return new RestHighLevelClient(
                RestClient.builder(
                        new HttpHost("localhost", 9200, "http") // OpenSearch Docker port
                )
        );
    }
}

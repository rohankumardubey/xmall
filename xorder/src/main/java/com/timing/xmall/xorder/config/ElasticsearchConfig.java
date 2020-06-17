package com.timing.xmall.xorder.config;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "es")
public class ElasticsearchConfig {

    private String host;
    private int port;
    private String schema;

    public RestHighLevelClient getClient() {

        RestHighLevelClient client = new RestHighLevelClient(
                RestClient.builder(new HttpHost(host, port, schema))
        );
        return client;
    }


    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }
}

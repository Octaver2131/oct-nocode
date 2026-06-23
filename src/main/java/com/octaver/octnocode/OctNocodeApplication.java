package com.octaver.octnocode;

import dev.langchain4j.community.store.embedding.redis.spring.RedisEmbeddingStoreAutoConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {RedisEmbeddingStoreAutoConfiguration.class})
@MapperScan("com.octaver.octnocode.mapper")
public class OctNocodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(OctNocodeApplication.class, args);
    }

}

package com.hwua.springboot05.config;

import com.alibaba.fastjson.support.spring.GenericFastJsonRedisSerializer;
import org.springframework.cache.CacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class RedisConfig {

@Bean
public RedisTemplate<String,Object> myRedisTemplate(RedisConnectionFactory redisConnectionFactory){
    RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
    redisTemplate.setConnectionFactory(redisConnectionFactory);
    redisTemplate.setKeySerializer(new StringRedisSerializer());
    redisTemplate.setValueSerializer(new GenericFastJsonRedisSerializer());
    return redisTemplate;
}

@Bean
public CacheManager cacheManager(RedisTemplate<String,Object> myRedisTemplate){
    return new RedisCacheManager(myRedisTemplate);
}

}

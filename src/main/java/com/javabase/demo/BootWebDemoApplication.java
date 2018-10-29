package com.javabase.demo;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;

//com.javabase.*.dao 必须要这样的写法;如果写成:com.*.dao 的话,是不能被加载的; 或者:com.javabase.*
@MapperScan(basePackages = "com.javabase.*.dao")
@SpringBootApplication
@EnableAutoConfiguration
public class BootWebDemoApplication{
	
	/**
	 * 程序启动的入口.
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(BootWebDemoApplication.class, args);
	}
	
	/**
	 * 采用 fastjson 格式化数据.
	 * @return
	 */


	@Bean
	public HttpMessageConverters fastJsonHttpMessageConverters() {
		FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
		FastJsonConfig fastJsonConfig = new FastJsonConfig();
		fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
		fastConverter.setFastJsonConfig(fastJsonConfig);
		HttpMessageConverter<?> converter = fastConverter;
		return new HttpMessageConverters(converter);
	}
	
}


package com.example.cloudclient.config;

import com.example.cloudclient.convert.WxMessageConverter;
import feign.codec.Decoder;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.cloud.openfeign.support.SpringDecoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.beans.factory.ObjectFactory;

/**
 * @ClassName: ConvertConfiguration
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2020-01-09 18:12
 * @Version 1.0
 **/
@Configuration
public class ConvertConfiguration {

    @Bean
    public Decoder feignDecoder(){
        WxMessageConverter wxConverter = new WxMessageConverter();
        ObjectFactory<HttpMessageConverters> objectFactory = () -> new HttpMessageConverters(wxConverter);
        return new SpringDecoder(objectFactory);
    }
}

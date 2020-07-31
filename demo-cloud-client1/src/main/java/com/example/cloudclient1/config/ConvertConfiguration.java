package com.example.cloudclient1.config;

import com.example.cloudclient1.convert.WxMessageConverter;
import feign.codec.Decoder;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.cloud.openfeign.support.SpringDecoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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

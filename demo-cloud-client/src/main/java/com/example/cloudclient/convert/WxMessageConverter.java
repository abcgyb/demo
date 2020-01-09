package com.example.cloudclient.convert;

import com.example.cloudclient.model.Student;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: WxMessageConverter
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2020-01-09 18:08
 * @Version 1.0
 **/
public class WxMessageConverter extends MappingJackson2HttpMessageConverter {

    /**
     * @Author GaoYueBin
     * @Description student对象转换
     * @Date 2020/1/9 18:09
     * @Param []
     * @return
     **/
    public WxMessageConverter(){
        List<MediaType> mediaTypes = new ArrayList<>();
        mediaTypes.add(MediaType.TEXT_PLAIN);
        setSupportedMediaTypes(mediaTypes);
    }
}

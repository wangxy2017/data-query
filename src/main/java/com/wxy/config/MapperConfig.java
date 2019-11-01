package com.wxy.config;

import com.wxy.mapper.QueryMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author wxy
 * @Date 19-9-25 下午2:40
 * @Description TODO 配置包扫描路径
 **/
@Configuration
@MapperScan(basePackageClasses = QueryMapper.class)
public class MapperConfig {
}

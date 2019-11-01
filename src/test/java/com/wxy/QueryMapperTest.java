package com.wxy;

import com.wxy.mapper.QueryMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

/**
 * @Author wxy
 * @Date 19-9-25 下午2:37
 * @Description TODO 通用mapper接口测试
 **/
@SpringBootTest
@Slf4j
public class QueryMapperTest {

    @Autowired
    private QueryMapper queryMapper;

    @Test
    public void TestQueryList() {
        List<Map<String, Object>> list = queryMapper.queryList();
        log.info("查询记录：{}", list);
    }
}

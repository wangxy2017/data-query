package com.wxy;

import com.wxy.mapper.BaseMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

/**
 * @Author wxy
 * @Date 19-9-25 下午2:37
 * @Description TODO 通用mapper接口测试
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class BaseMapperTest {

    @Autowired
    private BaseMapper baseMapper;

    @Test
    public void TestQueryList() {
        List<Map<String, Object>> list = baseMapper.queryList();
        log.info("查询记录：{}", list);
    }
}

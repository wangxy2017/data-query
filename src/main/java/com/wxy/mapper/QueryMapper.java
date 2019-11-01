package com.wxy.mapper;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Author wxy
 * @Date 19-9-25 下午2:35
 * @Description TODO mapper接口
 **/
@Repository
public interface QueryMapper {

    @Select("SELECT * FROM t_user;")
    List<Map<String, Object>> queryList();
}

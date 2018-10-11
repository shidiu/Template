package com.wcc.bootjdbc.mapper;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

/**
 * @Author：wcc
 * @Description：
 * @Date：Create in: 2018/10/11--9:53
 */
@Repository
@MapperScan
public interface UserMapper {
    String getname(HashMap<String,String> map);
}

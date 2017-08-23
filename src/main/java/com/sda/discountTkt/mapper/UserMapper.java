package com.sda.discountTkt.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Allen on 2017/8/23.
 */
@Mapper
public interface UserMapper {

    @Insert("insert into t_author(real_name,nick_name) values(#{real_name})")
    int add(@Param("realName") String realName);


}

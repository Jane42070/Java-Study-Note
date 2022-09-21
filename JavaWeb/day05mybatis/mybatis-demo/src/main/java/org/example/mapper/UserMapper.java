package org.example.mapper;

import org.apache.ibatis.annotations.Select;
import org.example.pojo.User;

import java.util.List;

/**
 * @author qilin
 */
public interface UserMapper {
    public List<User> selectAll();

    @Select("select * from tb_user where id = #{id}")
    public User getById(String id);
}

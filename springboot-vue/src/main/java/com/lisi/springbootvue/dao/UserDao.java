package com.lisi.springbootvue.dao;

import com.lisi.springbootvue.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserDao {
    @Select("select * from user")
    public List<User> findAll();
    @Select("select * from user where id=#{id}")
    public User findById(Integer id);
    @Update("update user set username=#{username},password=#{password},age=#{age},sex=#{sex},email=#{email} where id=#{id}")
    public void update(User user);
}

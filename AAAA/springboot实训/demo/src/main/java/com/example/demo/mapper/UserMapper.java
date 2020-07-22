package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.User;

@Repository
public interface UserMapper {
	//添加用户
    @Insert("insert into user (name) values(#{name})")
	public boolean insert(User user);
	@Select("select * from user")
	public List<User>findAlluser();
	@Delete("delete from user where id = #{id}")
	public boolean deleteById(int id);
	@Select("select * from user where id =#{id}")
	public User findById(int id);
	@Update("update user set name = #{name} where id = #{id}")
	public boolean updateByid(User user);
}

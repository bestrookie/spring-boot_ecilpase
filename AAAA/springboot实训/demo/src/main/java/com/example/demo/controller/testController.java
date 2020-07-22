package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;

@RestController
public class testController {
	
	@Autowired
	UserMapper mapper;
	
	@RequestMapping("aaaa")
	
	public boolean addUser(User user) {
		return mapper.insert(user);
	}
	@RequestMapping("bbbb")
	public List<User>findAll(){
		return mapper.findAlluser();
	}
	@RequestMapping("cccc")
	public boolean deleteUser(int id) {
		return mapper.deleteById(id);
	}
	@RequestMapping("dddd")
	public User findById(int id) {
		return mapper.findById(id);
	}
	@RequestMapping("eeee")
	public boolean updateById(User user) {
		return mapper.updateByid(user);
	}

}

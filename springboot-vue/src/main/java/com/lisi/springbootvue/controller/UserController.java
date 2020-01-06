package com.lisi.springbootvue.controller;

import com.lisi.springbootvue.dao.UserDao;
import com.lisi.springbootvue.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("/user")
@Controller
@ResponseBody
public class UserController {
    @Autowired
    UserDao dao;
    @RequestMapping(value="/findAll.do",method = RequestMethod.GET)
    public List<User> findAll() {
        return dao.findAll();
    }

     @RequestMapping(value="/findById.do",method = RequestMethod.GET)
        public User findById(Integer id) {
         System.out.println("findById");
        return dao.findById(id);
    }
    @RequestMapping(value="/update.do",method = RequestMethod.POST)
    public int update(@RequestBody User user) {
        System.out.println("修改成功");
        System.out.println(user);
        dao.update(user);
        return 1;
    }
}

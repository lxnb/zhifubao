package com.alipay.restFul;

import com.alipay.entity.User;
import com.alipay.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("restful")
@RestController
public class RestFulController {

    @Autowired
    private UserMapper userMapper;

    @PostMapping("addUser")
    public void addUser(User user){
        user.setId(null);
        userMapper.insert(user);
        System.out.println(user);
    }

    @DeleteMapping("deleteUser/{id}/{uid}")
    public void deleteUser(@PathVariable("id") Integer id,@PathVariable("uid") Integer uid){
        userMapper.deleteByPrimaryKey(id);
        System.out.println(id);
        System.out.println(uid);

    }

    @PutMapping("udateUser")
    public void updateUser(User user){
        userMapper.updateByPrimaryKey(user);
        System.out.println(user);
    }

    @GetMapping("getUser/{id}")
    public void getUser(@PathVariable Integer id){
        User user = userMapper.selectByPrimaryKey(id);
        System.out.println(user);
    }
}

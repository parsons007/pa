package com.zz.serverhi2.controller;

import com.zz.serverhi2.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping(value = "/getUser/{id}")
    public User getUser(@PathVariable int id){
        User user=new User();
        user.setId(id);
        user.setName("李四");
        user.setAge(18);
        return user;
    }
    @RequestMapping(value = "/getName",method = RequestMethod.GET)
    public String getName(){
        return "李四";
    }
}

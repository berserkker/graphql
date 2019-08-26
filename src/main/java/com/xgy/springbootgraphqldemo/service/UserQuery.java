package com.xgy.springbootgraphqldemo.service;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.xgy.springbootgraphqldemo.entity.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Component
public class UserQuery implements GraphQLQueryResolver {
    public static HashMap<Integer, User> userHashMap = new HashMap<>();
    static {
        userHashMap.put(1,new User(1,"admin","pass1",11));
        userHashMap.put(2,new User(3,"admin2","pass2",22));
        userHashMap.put(3,new User(3,"admin3","pass3",33));
    }

    public User getUserById(Integer id){
        return userHashMap.get(id);
    }

    public List<User> listUser(){
        return new ArrayList<>(userHashMap.values());
    }
}

package com.xgy.springbootgraphqldemo.service;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.xgy.springbootgraphqldemo.entity.User;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class UserMutation implements GraphQLMutationResolver {
    public static HashMap<Integer, User> userHashMap = UserQuery.userHashMap;

    public boolean saveUser(User user) {
        System.out.println("save");
        userHashMap.put(user.getId(), user);
        printMap();
        return true;
    }

    public boolean deleteUser(Integer id) {
        System.out.println("delete");
        userHashMap.remove(id);
        printMap();
        return true;
    }

    public boolean updateUser(User user) {
        System.out.println("update");
        User localUser = userHashMap.get(user.getId());
        if (user.getAge() > 0) {
            localUser.setAge(user.getAge());
        }

        if (StringUtils.isNotEmpty(user.getUsername())) {
            localUser.setUsername(user.getUsername());
        }

        if (StringUtils.isNotEmpty(user.getPassword())) {
            localUser.setPassword(user.getPassword());
        }

        userHashMap.put(user.getId(), localUser);
        printMap();
        return true;
    }

    private void printMap() {
        userHashMap.forEach((id, user) -> {
            System.out.println(id + "---" + user.getUsername() + "--" + user.getAge());
        });
    }
}

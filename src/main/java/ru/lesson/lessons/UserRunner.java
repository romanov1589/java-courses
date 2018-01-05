package ru.lesson.lessons;

import java.util.*;

public class UserRunner {
    public static void main(String[] args) {
        Map<String,User> users = new HashMap<String, User>();
        users.put("1", new User(1, "first"));
        users.put("2", new User(2, "second"));
        users.put("1", new User(1, "first"));

        for(Map.Entry<String, User> user : users.entrySet()){
            System.out.println(user.getKey() + " " + user.getValue());
        }

    }
}

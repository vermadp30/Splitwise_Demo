package com.example.demo_Splitwise.Strategy;

import com.example.demo_Splitwise.Models.User;

import java.util.HashMap;
import java.util.List;

public interface SplitStrategy {

    HashMap<String, Integer> split(User user, int amount, List<User> users);
}

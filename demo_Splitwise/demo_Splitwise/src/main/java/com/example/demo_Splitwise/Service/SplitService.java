package com.example.demo_Splitwise.Service;

import com.example.demo_Splitwise.Models.User;
import com.example.demo_Splitwise.Strategy.SplitStrategy;
import com.example.demo_Splitwise.enums.SplitStrategyType;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class SplitService {

    public HashMap<String, Integer> splitService(User user, int amount, List<User> users, SplitStrategyType strategyType){
        SplitStrategy splitStrategy = strategyType.getSplitStrategy();
        return splitStrategy.split(user, amount, users);
    }
}

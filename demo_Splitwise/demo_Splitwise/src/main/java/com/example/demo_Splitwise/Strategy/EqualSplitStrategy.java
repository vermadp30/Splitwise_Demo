package com.example.demo_Splitwise.Strategy;

import com.example.demo_Splitwise.Models.User;

import java.util.HashMap;
import java.util.List;

public class EqualSplitStrategy implements SplitStrategy {

    @Override
    public HashMap<String, Integer> split(User user, int amount, List<User> users) {
        HashMap<String, Integer> splitResult = new HashMap<>();
        int finalAmount = splitAmountCalculation(amount, users.size()+1);
        for (User fellowUser: users) {
            splitResult.put(fellowUser.getName(), finalAmount);
        }
        splitResult.put(user.getName(), finalAmount);
        return splitResult;
    }

    private Integer splitAmountCalculation(int amount, int numberOfMembers){
        return (amount/numberOfMembers);
    }
}

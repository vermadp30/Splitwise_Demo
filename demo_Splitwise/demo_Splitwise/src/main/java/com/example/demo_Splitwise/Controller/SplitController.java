package com.example.demo_Splitwise.Controller;

import com.example.demo_Splitwise.Models.User;
import com.example.demo_Splitwise.Service.SplitService;
import com.example.demo_Splitwise.enums.SplitStrategyType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/split")
public class SplitController {

    @Autowired
    SplitService splitService;

    @GetMapping
    public HashMap<String, Integer> splitAmount(
            @RequestBody User user, @RequestBody int amount, @RequestBody List<User> users, @RequestBody SplitStrategyType splitStrategy){
        return splitService.splitService(user, amount, users, splitStrategy);
    }
}

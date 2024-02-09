package com.example.demo_Splitwise.enums;

import com.example.demo_Splitwise.Strategy.EqualSplitStrategy;
import com.example.demo_Splitwise.Strategy.SplitStrategy;
import lombok.Getter;

@Getter
public enum SplitStrategyType {
    EQUAL_SPLIT("Equal Split", new EqualSplitStrategy());
    String description;
    SplitStrategy splitStrategy;

    SplitStrategyType(String description, SplitStrategy splitStrategy) {
        this.description = description;
    }
}

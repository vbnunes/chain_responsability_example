package com.example.demo.handler;

import com.example.demo.contexts.ChainContext;
import com.example.demo.core.Executor;
import org.springframework.stereotype.Component;

@Component
public class AggregateExecutor implements Executor<ChainContext, String> {

    @Override
    public String execute(ChainContext input) {

        return input.getResult();
    }
}

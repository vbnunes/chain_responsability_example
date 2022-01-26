package com.example.demo.handler;

import com.example.demo.contexts.ChainContext;
import com.example.demo.core.Executor;
import org.springframework.stereotype.Component;

@Component
public class GetCellphoneLogExecutor implements Executor<ChainContext, ChainContext> {
    @Override
    public ChainContext execute(ChainContext input) {
        var context = ChainContext.builder().result("Primeira parte da frase").build();

        return context;
    }
}

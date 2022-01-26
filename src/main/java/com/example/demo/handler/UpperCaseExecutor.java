package com.example.demo.handler;

import com.example.demo.contexts.ChainContext;
import com.example.demo.core.Executor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class UpperCaseExecutor implements Executor<String, ChainContext> {

    @Override
    public ChainContext execute(String input) {
        log.info("[UpperCaseExecutor] Passando pelo Executor");

        return ChainContext.builder().result(input.toUpperCase()).build();
    }
}

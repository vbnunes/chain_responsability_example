package com.example.demo.handler;

import com.example.demo.core.Executor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Slf4j
public class UUIDToStringExecutor implements Executor<UUID, String> {

    @Override
    public String execute(UUID input) {
        log.info("[UUIDToStringExecutor] Passando pelo Executor para transformar em string");

        return input.toString();
    }
}

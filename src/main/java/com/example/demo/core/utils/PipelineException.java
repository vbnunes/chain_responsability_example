package com.example.demo.core.utils;

import com.example.demo.core.Executor;
import lombok.Getter;

public class PipelineException extends Exception {
    @Getter
    private final transient Executor<?,?> executor;

    public PipelineException(Executor<?, ?> executor, Throwable cause) {
        super(cause);
        this.executor = executor;
    }
}

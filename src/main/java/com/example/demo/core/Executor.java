package com.example.demo.core;

public interface Executor<I, O> {
    O execute(I input) throws Exception;
}

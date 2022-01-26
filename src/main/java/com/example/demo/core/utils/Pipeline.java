package com.example.demo.core.utils;

import com.example.demo.core.Executor;
import lombok.Getter;

public class Pipeline<T> {

    @Getter
    private final T output;

    private Pipeline(T output) {
        this.output = output;
    }

    public static Pipeline<Void> startEmpty() {return new Pipeline<>( null);}

    public static <T2> Pipeline<T2> given(T2 input) {return new Pipeline<>(input);}

    public <T2> Pipeline<T2> process(Executor<T, T2> executor) throws PipelineException {
        try {
            final T2 newOutput = executor.execute(output);
            return new Pipeline<>(newOutput);
        } catch (Exception ex) {
            throw new PipelineException(executor, ex);
        }
    }
}

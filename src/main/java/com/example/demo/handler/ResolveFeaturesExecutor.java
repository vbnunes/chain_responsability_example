package com.example.demo.handler;

import com.example.demo.contexts.ChainContext;
import com.example.demo.core.Executor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;


@Component
public class ResolveFeaturesExecutor implements Executor<ChainContext, String> {
    @Override
    public String execute(ChainContext input) throws Exception {

        return "bla";
    }

    public <T> CompletableFuture<List<T>> allOf(List<CompletableFuture<T>> futuresList) {
        CompletableFuture<Void> allFuturesResult =
                CompletableFuture.allOf(futuresList.toArray(new CompletableFuture[futuresList.size()]));
        return allFuturesResult.thenApply(v ->
                futuresList.stream().
                        map(future -> future.join()).
                        collect(Collectors.<T>toList())
        );
    }
}

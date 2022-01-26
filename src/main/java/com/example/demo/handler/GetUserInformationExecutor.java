package com.example.demo.handler;

import com.example.demo.contexts.ChainContext;
import com.example.demo.core.Executor;
import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;

@Component
public class GetUserInformationExecutor implements Executor<ChainContext, String> {
    @Override
    public String execute(ChainContext input) throws Exception {
        CompletableFuture<String> asyncGetConsentLog = CompletableFuture.supplyAsync(
                () -> {
                    try {
                        Thread.sleep(10000);

                        input.setResult(input.getResult() + "Segunda parte do texto");

                        return input.getResult();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return null;
                });

        input.getFeatures().add(asyncGetConsentLog);

        return input.getResult();
    }
}

package com.example.demo.contexts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

@Getter
@Setter
@Builder
public class ChainContext implements Serializable {
    private String result;

    private List<Future> features;

}

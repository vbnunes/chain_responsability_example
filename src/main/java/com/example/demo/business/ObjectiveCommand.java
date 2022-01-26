package com.example.demo.business;


import com.example.demo.contexts.ChainContext;

public interface ObjectiveCommand {
    ChainContext execute(ChainContext context);
}

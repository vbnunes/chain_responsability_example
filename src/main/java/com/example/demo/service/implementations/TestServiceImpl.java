package com.example.demo.service.implementations;

import com.example.demo.contexts.ChainContext;
import com.example.demo.core.utils.Pipeline;
import com.example.demo.core.utils.PipelineException;
import com.example.demo.handler.*;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Autowired private GetUserInformationExecutor getUserInformationExecutor;
    @Autowired private GetCellphoneLogExecutor getCellphoneLogExecutor;

    @Override
    public String getStringConverted() throws PipelineException {

        return Pipeline.given(ChainContext.builder().build())
                //precisa receber o tipo de objeto anterior
                .process(getCellphoneLogExecutor)
                //precisa receber o tipo de objeto anterior
                .process(getUserInformationExecutor)
                .getOutput();

    }
}

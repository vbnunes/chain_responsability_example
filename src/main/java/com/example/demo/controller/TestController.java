package com.example.demo.controller;

import com.example.demo.controller.response.TestResponse;
import com.example.demo.core.utils.PipelineException;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/test/chain")
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping
    public ResponseEntity<TestResponse> testChain() throws PipelineException {
        var result = testService.getStringConverted();

        return ResponseEntity.ok(TestResponse.builder().response("Texto Montado: " + result).build());
    }
}

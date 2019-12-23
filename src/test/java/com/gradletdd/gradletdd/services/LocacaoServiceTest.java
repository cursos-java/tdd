package com.gradletdd.gradletdd.services;


import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * LocacaoServiceTest
 */
@SpringBootTest
public class LocacaoServiceTest {

    LocacaoService service;

    @BeforeEach
    public void setup() {
        service = new LocacaoService();
    }

    
}
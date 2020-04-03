package com.challenges.codeWars;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static com.challenges.codeWars.CodeWarsApplication.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CodeWarsApplicationTests {


    @Test
    public void BasicTests() {
        System.out.println("****** Basic Tests ******");
//        assertEquals("2000 103 123 4444 99", orderWeight("103 123 4444 99 2000"));
        assertEquals("11 11 2000 10003 22 123 1234000 44444444 9999", orderWeight("2000 10003 1234000 44444444 9999 11 11 22 123"));
    }
}

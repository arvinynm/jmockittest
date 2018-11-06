//package com.zte;
//
//import mockit.Expectations;
//import mockit.Mocked;
//import mockit.Verifications;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//public class ProgramConstructureTest {
//    @Mocked
//    HelloJMockit helloJMockit;
//
//    @Test
//    public void test1() {
//        new Expectations() {
//            {
//                helloJMockit.sayHello();
//                result = "hello,david";
//            }
//        };
//        String msg = helloJMockit.sayHello();
//        Assertions.assertTrue(msg.equals("hello,david"));
//
//        new Verifications() {
//            {
//                helloJMockit.sayHello();
//                times = 1;
//            }
//        };
//    }
//
//}

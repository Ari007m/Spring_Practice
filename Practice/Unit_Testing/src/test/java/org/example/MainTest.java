package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void addTest1(){
        var m = new Main();
//        int d = ;
        assertEquals(4,m.add(2,2));
    }

    @Test
    void addTest() {
        var m = new Main();
//        int d = ;
        assertEquals(11, m.add(5, 6));
    }


}
package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradeTest {

    @Test
    void failTest1(){
        var f1 = new Grade();
        assertEquals('F',f1.determineGrade(59));
    }

    @Test
    void dTest1(){
        var d1 = new Grade();
        assertEquals('D',d1.determineGrade(69));
    }

    @Test
    void cTest1(){
        var c1 = new Grade();
        assertEquals('C',c1.determineGrade(79));
    }

    @Test
    void bTest1(){
        var b1 = new Grade();
        assertEquals('B',b1.determineGrade(89));
    }

    @Test
    void aTest1(){
        var a1 = new Grade();
        assertEquals('A',a1.determineGrade(99));
    }

    @Test
    void lessThenZeroTest1(){
        var z1 = new Grade();
        assertThrows(IllegalArgumentException.class,() ->{
           z1.determineGrade(-1);
        });
    }

}
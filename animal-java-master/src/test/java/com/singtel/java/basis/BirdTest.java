package com.singtel.java.basis;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BirdTest {
    Bird bird = new Bird();

    @Before
    public void setup() {
    }

    @Test
    public void singShouldBeImplemented() {
        assertTrue("Bird has sing method", bird.sing());
    }

    @Test
    public void swimShouldReturnFalse() {
        assertFalse("Not all the Bird's can swim", bird.swim());
    }
}

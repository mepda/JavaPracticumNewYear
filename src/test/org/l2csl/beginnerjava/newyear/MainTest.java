package org.l2csl.beginnerjava.newyear;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by hector on 1/7/17.
 */
public class MainTest {
    @Test
    public void add() throws Exception {
        assertEquals(4, Main.Add(2, 2));
        assertEquals(3, Main.Add(-4, 7));
    }

}
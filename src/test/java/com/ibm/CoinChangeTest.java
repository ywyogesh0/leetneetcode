package com.ibm;

import org.junit.Test;
import static org.junit.Assert.*;

public class CoinChangeTest {
    @Test
    public void exampleTest() {
        int[] coins = {1,5,6,9};
        assertEquals(2, CoinChange.coinChange(coins, 11));
    }
}

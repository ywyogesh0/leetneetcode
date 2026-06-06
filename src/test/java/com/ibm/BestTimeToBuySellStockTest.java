package com.ibm;

import org.junit.Test;
import static org.junit.Assert.*;

public class BestTimeToBuySellStockTest {
    @Test
    public void exampleTest() {
        int[] prices = {7,1,5,3,6,4};
        assertEquals(5, BestTimeToBuySellStock.maxProfit(prices));
    }
}

package com.ibm;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class GroupAnagramsTest {
    @Test
    public void exampleTest() {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> groups = GroupAnagrams.groupAnagrams(strs);
        assertEquals(3, groups.size());
    }
}

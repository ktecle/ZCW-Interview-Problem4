package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem4Test {

    @Test
    public void testPalindromePermutation(){
        Problem4 test = new Problem4();
        String input = "aaabbbb";
        boolean expected = true;
        boolean actual = test.isPalindromePermutation(input);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testPalindromePermutation2(){
        Problem4 test = new Problem4();
        String input = "cdefghmnopqrstuvw";
        boolean expected = false;
        boolean actual = test.isPalindromePermutation(input);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testPalindromePermutation3(){
        Problem4 test = new Problem4();
        String input = "cdcdcdcdeeeef";
        boolean expected = true;
        boolean actual = test.isPalindromePermutation(input);
        Assert.assertEquals(expected,actual);
    }
}

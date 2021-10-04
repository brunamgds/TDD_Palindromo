package com.impacta.testes.automatizados;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeTest {

    @Test
    public void isAPalindromeWord00(){

        String sentence = "Rotator";

        PalindromeWord pw = new PalindromeWord();

        Assert.assertEquals(true, pw.isPalindrome(sentence));

    }

    @Test
    public void isAPalindromeWord01(){

        String sentence = "bob";

        PalindromeWord pw = new PalindromeWord();

        Assert.assertEquals(true, pw.isPalindrome(sentence));

    }

    @Test
    public void isAPalindromeWord02(){

        String sentence = "madam";

        PalindromeWord pw = new PalindromeWord();

        Assert.assertEquals(true, pw.isPalindrome(sentence));

    }
    
    @Test
    public void isAPalindromeWord03(){

        String sentence = "mAlAyAlam";

        PalindromeWord pw = new PalindromeWord();

        Assert.assertEquals(true, pw.isPalindrome(sentence));

    }

    @Test
    public void isAPalindromeWord04(){

        String sentence = "1";

        PalindromeWord pw = new PalindromeWord();

        Assert.assertEquals(true, pw.isPalindrome(sentence));

    }

    @Test
    public void isAPalindromeSentence00(){

        String sentence = "Able was I, ere I saw Elba";

        PalindromeWord pw = new PalindromeWord();

        Assert.assertEquals(true, pw.isPalindrome(sentence));

    }

    @Test
    public void isAPalindromeSentence01(){

        String sentence = "Madam I’m Adam";

        PalindromeWord pw = new PalindromeWord();

        Assert.assertEquals(true, pw.isPalindrome(sentence));

    }

    @Test
    public void isAPalindromeSentence02(){

        String sentence = "Step on no pets.";

        PalindromeWord pw = new PalindromeWord();

        Assert.assertEquals(true, pw.isPalindrome(sentence));

    }

    @Test
    public void isAPalindromeSentence03(){

        String sentence = "Top spot!";

        PalindromeWord pw = new PalindromeWord();

        Assert.assertEquals(true, pw.isPalindrome(sentence));

    }

    @Test
    public void isAPalindromeSentence04(){

        String sentence = "02/02/2020";

        PalindromeWord pw = new PalindromeWord();

        Assert.assertEquals(true, pw.isPalindrome(sentence));

    }

    @Test
    public void isNotAPalindromeWord00(){

        String sentence = "xyz";

        PalindromeWord pw = new PalindromeWord();

        Assert.assertEquals(false, pw.isPalindrome(sentence));

    }

    @Test
    public void isNotAPalindromeWord01(){

        String sentence = "elephant";

        PalindromeWord pw = new PalindromeWord();

        Assert.assertEquals(false, pw.isPalindrome(sentence));

    }

    @Test
    public void isNotAPalindromeWord02(){

        String sentence = "Country";

        PalindromeWord pw = new PalindromeWord();

        Assert.assertEquals(false, pw.isPalindrome(sentence));

    }

    @Test
    public void isNotAPalindromeSentence00(){

        String sentence = "Top . post!";

        PalindromeWord pw = new PalindromeWord();

        Assert.assertEquals(false, pw.isPalindrome(sentence));

    }

    @Test
    public void isNotAPalindromeSentence01(){

        String sentence = "Wonderful-fool";

        PalindromeWord pw = new PalindromeWord();

        Assert.assertEquals(false, pw.isPalindrome(sentence));

    }

    @Test
    public void isNotAPalindromeSentence02(){

        String sentence = "Wild imagination!";

        PalindromeWord pw = new PalindromeWord();

        Assert.assertEquals(false, pw.isPalindrome(sentence));

    }

    @Test
    public void isRemovingNonAlphaNumericChars(){

        String sentence = "Able was I, ere I saw Elba";

        PalindromeWord pw = new PalindromeWord();

        Assert.assertEquals("AblewasIereIsawElba", pw.removeNonAlphaNumericChars(sentence));

    }
    
}

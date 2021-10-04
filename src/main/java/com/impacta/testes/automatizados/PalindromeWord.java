package com.impacta.testes.automatizados;

public class PalindromeWord {

    public boolean isPalindrome(String sentence){

        sentence = removeNonAlphaNumericChars(sentence);

        sentence = sentence.toLowerCase();

        int i = 0, j = sentence.length() - 1;
 
        while (i < j) {
 
            if (sentence.charAt(i) != sentence.charAt(j))
                return false;
 
            i++;
            j--;
        }
 
        return true;
    }

    public String removeNonAlphaNumericChars(String sentence) {
        StringBuffer newSentence = new StringBuffer();
        char[] chars = sentence.toCharArray();
        for(char ch : chars){
            if(Character.isLetterOrDigit(ch)){
                newSentence.append(ch);
            }
        }
        return newSentence.toString();
    }
    
}

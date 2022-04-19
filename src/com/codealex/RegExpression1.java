package com.codealex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpression1 {
    public static void main(String[] args) {
        //The first parameter indicates which pattern is being searched for
        // and the second parameter has a flag to indicates that
        // the search should be case-insensitive. The second parameter is optional.
        Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
        //The matcher() method is used to search for the pattern in a string.
        // It returns a Matcher object which contains information about the search that was performed.
        Matcher matcher = pattern.matcher("Visit W3Schools!");
        //The find() method returns true if the pattern was found in the string and false
        // if it was not found.
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    }
}
// Outputs Match found
//Pattern.CASE_INSENSITIVE - The case of letters will be ignored when performing a search

// Pattern.LITERAL - Special characters in the pattern will not have any special meaning
// and will be treated as ordinary characters when performing a search.

// Pattern.UNICODE_CASE - Use it together with the CASE_INSENSITIVE flag to also ignore
// the case of letters outside of the English alphabet

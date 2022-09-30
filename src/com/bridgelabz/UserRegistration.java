package com.bridgelabz;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration {
    /**
     * Create a method name as firstName, this method is boolean type than means its return op is true or false
     * type, also this is parameterized method
     *
     * @param firstName
     * @return firstname
     */
    public boolean firstName(String firstName) {
        /**
         * Regex to check valid firstname
         * 1) First name starts with Cap and has minimum 3 characters
         */
        String regex = "^[A-Z]{1}[a-z]{3,}";
        /**
         * First, the pattern is created using the Pattern.compile() method
         * The first parameter indicates which pattern is being searched for
         */
        Pattern pattern = Pattern.compile(regex);
        /**
         * The matcher() method is used to search for the pattern in a string.
         * It returns a Matcher object which contains information about the search that was performed.
         */
        Matcher match = pattern.matcher(firstName);
        /**
         * for return op is true or false
         */
        return match.matches();
    }

    public boolean lastName(String lastName) {
        /**
         *  Regex to check valid userlastname.
         *  1) Last name starts with Cap and has minimum 3 character
         */
        String regex = "^[A-Z]{1}[a-z]{3,}";
        /**
         *  Compile the Regex
         */
        Pattern pattern = Pattern.compile(regex);
        /**
         * Pattern class contains matcher() method to find matching between given userlastname
         * and regular expression.
         */
        Matcher matcher = pattern.matcher(lastName);
        /**
         * Return if the userlastname matched the Regex
         */
        return matcher.matches();
    }
    public boolean emailAddress(String email) {
        /**
         * regex pattern for email
         * 1)must contain character before @
         * 2)must contain @ symbol after char
         * 3)must contain char after @
         * 4)must contain "."  symbol before com or in
         */
        String regex = "^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?";
        /**
         * Compile the Regex
         */
        Pattern pattern = Pattern.compile(regex);
        /**
         * Pattern class contains matcher() method to find matching between given useremail
         * and regular expression.
         */
        Matcher matcher = pattern.matcher(email);
        /**
         * Return if the useremail matched the Regex
         */
        return matcher.matches();
    }

}




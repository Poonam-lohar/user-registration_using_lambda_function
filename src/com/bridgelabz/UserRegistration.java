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
    public boolean phoneNumber(String phoneNumber) {
        /**
         * regex pattern for email
         * 1) Country code follow by space and 10 digit number
         */
        String regex = "^[0-9]{2}\\s{1}[0-9]{10}$";
        /**
         * Compile the Regex
         */
        Pattern pattern = Pattern.compile(regex);
        /**
         * Pattern class contains matcher() method to find matching between given phoneNumber
         * and regular expression.
         */
        Matcher matcher = pattern.matcher(phoneNumber);
        /**
         * Return if the mobileNo matched the Regex
         */
        return matcher.matches();
    }
        public boolean passwordRule1 (String password){
            /**
             * regex pattern for password:must contain atleast 8 characters
             * 1) ^ represents starting character of the string.
             * 2) {8,} represents at least 8 characters and more than characters.
             * 3) $ represents the end of the string.
             */
            String regex = "^[a-zA-z1-9]{8,}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(password);
            return matcher.matches();
        }
    public boolean passwordRule2(String password) {
        /**
         * Regex to check valid password.
         * 1)must contain atleast 8 characters
         * 2)must contain one UpperCase
         * 3) ^ represents starting character of the string.
         * 4) {8,} represents at least 8 characters or more than that characters.
         * 5) [A-Z]{1,} represents an upper case alphabet that must occur at least once.
         * 6) $ represents the end of the string.
         */
        String regex = "^[A-Z]{1,}[a-zA-z1-9]{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();

    }
    public boolean passwordRule3(String password) {
        /**
         * a) ^ represents starting character of the string.
         * b) {8,} represents at least 8 characters or more than that characters.
         * c) [a-zA-z1-9] represents a lower case alphabet must occur at least 8 or more than that.
         * d) [A-Z]{1} represents an upper case alphabet that must occur at least once.
         * e) [1-9]{1}represents a digit must occur at least once.
         * f) $ represents the end of the string.
         */
        String regex = "^[A-Z]{1}+[a-zA-z1-9]{9,}[1-9]{1}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();

    }
    public boolean passwordRule4(String password) {
        /**
         * Regex to check valid password.
         * 1) ^ represents starting character of the string.
         * 2) {8,} represents at least 8 characters or more than that characters.
         * 3) [a-zA-z1-9] represents a lower case alphabet must occur at least 8 or more than that.
         * 4) [A-Z]{1} represents an upper case alphabet that must occur at least once.
         * 5) [1-9]{1}represents a digit must occur at least once.
         * 6) [@$^]{1} represents a at least once special character.
         * 6) $ represents the end of the string.
         */
        String regex = "^[A-Z]{1}+[a-zA-z1-9]{9,}[@$^]{1}[1-9]{1}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
    public boolean emailAddressSample(String emailId) {
        /**
         * regex pattern for email
         * 1)must contain character before @
         * 2)must contain @ symbol after char
         * 3)must contain char after @
         * 4)must contain "."  symbol before com or in
         */
        String regex = "^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(emailId);
        return matcher.matches();
    }
}







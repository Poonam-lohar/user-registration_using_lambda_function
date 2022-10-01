package com.bridgelabz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();


    @Test
    public void givenFirstName_WhenInFormat_ShouldReturnTrue() {
        boolean result = userRegistration.firstName("Poonam");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void givenFirstName_WhenOurOfFormat_ShouldReturnFlase() {
        boolean result = userRegistration.firstName("poonam");
        Assertions.assertEquals(false, result);
    }

    /**
     * test case for uc2
     */
    @Test
    public void givenLastName_WhenInFormat_ShouldReturnTrue() {
        boolean result = userRegistration.lastName("Desai");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void givenLastName_WhenOurOfFormat_ShouldReturnFalse() {
        boolean result = userRegistration.lastName("desai");
        Assertions.assertEquals(false, result);

    }

    /**
     * test case for uc3 email
     */
    @Test
    public void givenEmail_WhenInFormat_ShouldReturnTrue() {
        boolean result = userRegistration.emailAddress("loharpoonam98@gmail.com");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void givenEmail_WhenOurOfFormat_ShouldReturnFalse() {
        boolean result = userRegistration.emailAddress("LOharpoonam(8)@gmail.com");
        Assertions.assertEquals(false, result);
    }

    /**
     * test case for uc4 Mobile no.
     */
    @Test
    public void givenPhoneNumber_WhenInFormat_ShouldReturnTrue() {
        boolean result = userRegistration.phoneNumber("91 7058835985");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void givenPhoneNumber_WhenOurOfFormat_ShouldReturnFlase() {
        boolean result = userRegistration.phoneNumber("+91 9604315270");
        Assertions.assertEquals(false, result);
    }

    /**
     * test case for UC5 password rule 1(min 8 chara)
     */
    @Test
    public void givenPassword_WhenInFormat_ShouldReturnTrue() {
        boolean result = userRegistration.passwordRule1("Registration");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void givenPassword_WhenOurOfFormat_ShouldReturnFalse() {
        boolean result = userRegistration.passwordRule1("reg");
        Assertions.assertEquals(false, result);
    }
    /**
     * test case for uc6 password rule 2(one uppercase)
     */
    @Test
    public void givenPasswordRule2_WhenInFormat_ShouldReturnTrue() {
        boolean result = userRegistration.passwordRule2("Registration");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void givenPasswordRule2_WhenOurOfFormat_ShouldReturnFalse() {
        boolean result = userRegistration.passwordRule2("reg");
        Assertions.assertEquals(false, result);
    }
    /**
     * test case for uc7 password rule 3(one numeric)
     */
    @Test
    public void givenPasswordRule3_WhenInFormat_ShouldReturnTrue() {
        boolean result = userRegistration.passwordRule3("Registration5");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void givenPasswordRule3_WhenOurOfFormat_ShouldReturnFalse() {
        boolean result = userRegistration.passwordRule3("Registration");
        Assertions.assertEquals(false, result);
    }
    /**
     * test case for uc 8 password rule 4(1 special chara)
     */
    @Test
    public void givenPasswordRule4_WhenInFormat_ShouldReturnTrue() {
        boolean result = userRegistration.passwordRule4("Registration@5");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void givenPasswordRule4_WhenOurOfFormat_ShouldReturnFalse() {
        boolean result = userRegistration.passwordRule4("Registration@$#9");
        Assertions.assertEquals(false, result);
    }
    /**
     * test case for uc 9 emailAddressSample
     */
    @Test
    public void givenEmail4_WhenInFormat_ShouldReturnTrue() {
        boolean result = userRegistration.emailAddressSample("srushtideshmukh2909@gmail.com");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void givenEmail4_WhenOurOfFormat_ShouldReturnFalse() {
        boolean result = userRegistration.emailAddressSample("poonam.@gmail.com");
        Assertions.assertEquals(false, result);
    }
    /**
     * test case for uc 10 mood analyser
     */
    @Test
    public void givenMessage_WhenHappy_ShouldReturnEntrySuccessful() {
        String result = MoodAnalyser.analyseMood("I am in  Happy mood");
        Assertions.assertEquals("Entry Successful", result);
    }

    @Test
    public void givenEmail2_WhenNotProper_ShouldReturnEntryFailed() {
        String result = MoodAnalyser.analyseMood("I am in Sad mood");
        Assertions.assertEquals("Entry Failed", result);
    }
}


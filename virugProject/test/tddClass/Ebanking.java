package tddClass;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class Ebanking {
    @Test

    public void accountCanBeCreatedTest(){
        Account1 account = new Account1(2434,"George", "Kevin",1233);
        assertNotNull(account);
    }
    @Test
    public void accountCanBeCreatedWithAllDetailsTest(){
        Account1 account = new Account1(2222, "George", "Kevin",1234);
        assertEquals(2222, account.getAccountNumber);
    }
}

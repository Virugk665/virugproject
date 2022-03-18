package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void depositTest(){

        Account virugAccount = new Account();
        virugAccount.deposit(100);
        assertEquals(100, virugAccount.getBalance());
    }
}

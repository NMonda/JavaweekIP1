package ke.co.safaricom;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Account module testing class")
class AccountTest {

    @Test
    @DisplayName("First Name Test")
    public void firstTest(){
        assertTrue(true);
    }

    @Test
    @DisplayName("Test that withdrawal method affects the balance")
    public void testWithdrawMethod(){
        Account sampleAccount = new Account();
        sampleAccount.setAccountBalance(1000);

        assertEquals(1000, sampleAccount.getAccountBalance());

        sampleAccount.withdraw(1000);
        assertEquals(1000, sampleAccount.getAccountBalance());

        sampleAccount.withdraw(800);
        assertEquals(100, sampleAccount.getAccountBalance());
    }

}

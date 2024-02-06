package chapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AccountTest {


    @Test
    public void depositNegativeBalance_balanceRemainsUnchangedTest(){
        Account preciousAccount = new Account();
        assertEquals(0, preciousAccount.getBalance());

        preciousAccount.deposit(-50_000);
        assertEquals(  0, preciousAccount.getBalance());
    }
    @Test
    public void depositPositiveAmount_balanceIncreasesTest(){
        Account preciousAccount = new Account();
        assertEquals(0, preciousAccount.getBalance());

        preciousAccount.deposit(2_000);
        assertEquals(  2_000, preciousAccount.getBalance());
    }
    @Test
    public void depositPositiveAmountTwice_balanceIncreasesTest(){
        Account preciousAccount = new Account();
        assertEquals(0, preciousAccount.getBalance());

        preciousAccount.deposit(2_000);
        preciousAccount.deposit(4_000);
        assertEquals(  6_000, preciousAccount.getBalance());
    }
@Test
    public void withdrawalPositiveAmount_balanceDecreasesTest(){
        Account preciousAccount = new Account();
        assertEquals(0, preciousAccount.getBalance());

        preciousAccount.deposit(1_200);
        preciousAccount.withdrawal(1_000);
        assertEquals( 200, preciousAccount.getBalance());

}
@Test
    public void withdrawNegativeAmount_balanceRemainsUnchanged(){
        Account preciousAccount = new Account();
        assertEquals(0, preciousAccount.getBalance());

        preciousAccount.deposit(1_200);
        preciousAccount.withdrawal(-50_000);
        assertEquals(1_200, preciousAccount.getBalance());
    }
    @Test
    public void withdrawPositiveAmountGreaterThanBalance_balanceRemainsUnchanged(){
        Account preciousAccount = new Account();
        assertEquals(0, preciousAccount.getBalance());

        preciousAccount.deposit(200);
        preciousAccount.withdrawal(50_000);
        assertEquals(200, preciousAccount.getBalance());

    }
}


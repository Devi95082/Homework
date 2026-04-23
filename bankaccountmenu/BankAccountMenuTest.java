package com.mycompany.bankaccountmenu;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class BankAccountMenuTest 
{
    @Test
    void testDeposit() {
        BankAccountMenu acc = new BankAccountMenu(1000);
        acc.deposit(500);

        assertEquals(1500, acc.getBalance());
    }

    @Test
    void testDepositInvalid()
    {
        BankAccountMenu acc = new BankAccountMenu(1000);

        assertThrows(IllegalArgumentException.class, () -> {
            acc.deposit(-100);
        });
    }

    @Test
    void testWithdraw() {
        BankAccountMenu acc = new BankAccountMenu(1000);
        acc.withdraw(400);

        assertEquals(600, acc.getBalance());
    }

    @Test
    void testWithdrawInsufficientBalance() {
        BankAccountMenu acc = new BankAccountMenu(1000);

        assertThrows(IllegalArgumentException.class, () -> {
            acc.withdraw(1500);
        });
    }

    @Test
    void testWithdrawInvalid() {
        BankAccountMenu acc = new BankAccountMenu(1000);

        assertThrows(IllegalArgumentException.class, () -> {
            acc.withdraw(-200);
        });
    }

    @Test
    void testCheckBalance() {
        BankAccountMenu acc = new BankAccountMenu(2000);

        assertEquals(2000, acc.getBalance());
    }
}

package org.lbg.c4.bankacc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class BankAccountTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void onConstruction_verify_object_initialised_correctly() {
        // arrange
        double expectedResult = 34.75;
        BankAccount cut = new BankAccount(expectedResult);

        // act
        double actualResult = cut.getBalance();

        // assert
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void onCredit_update_amount_in_BankAccount() {
        // arrange
        double startAmount = 30;
        double expectedEndAmount = 40;
        double creditAmount = 10;
        BankAccount cut = new BankAccount(startAmount);

        // act
        cut.credit(creditAmount);
        double actualEndAmount = cut.getBalance();

        // assert
        assertEquals(expectedEndAmount, actualEndAmount);
    }

    @Test
    public void onDebit_update_amount_in_BankAccount() {
        // arrange
        double startAmount = 30;
        double expectedEndAmount = 20;
        double debitAmount = 10;
        BankAccount cut = new BankAccount(startAmount);

        // act
        cut.debit(debitAmount);
        double actualEndAmount = cut.getBalance();

        // assert
        assertEquals(expectedEndAmount, actualEndAmount);
    }

    @Test
    public void onCredit_credit_invalid() {
        // arrange
        double startAmount = 30;
        double expectedEndAmount = 30;
        double creditAmount = 0;
        BankAccount cut = new BankAccount(startAmount);

        // act
        cut.credit(creditAmount);
        double actualEndAmount = cut.getBalance();

        // assert
        assertEquals(expectedEndAmount, actualEndAmount);
    }


    @Test
    public void onDebit_invalid_zero_verify_balance() {
        // arrange
        double startAmount = 30;
        double expectedEndAmount = 30;
        double debitAmount = 0;
        BankAccount cut = new BankAccount(startAmount);

        // act
        cut.debit(debitAmount);
        double actualEndAmount = cut.getBalance();

        // assert
        assertEquals(expectedEndAmount, actualEndAmount);
    }

    @Test
    public void onDebit_invalid_more_than_balance() {
        // arrange
        double startAmount = 30;
        double expectedEndAmount = 30;
        double debitAmount = 40;
        BankAccount cut = new BankAccount(startAmount);

        // act
        cut.debit(debitAmount);
        double actualEndAmount = cut.getBalance();

        // assert
        assertEquals(expectedEndAmount, actualEndAmount);
    }

    @Test
    public void onConstruction_is_not_null() {
        // arrange
        double placeholderResult = 0;
        BankAccount cut = new BankAccount(placeholderResult);

        // act
        double actualResult = cut.getBalance();

        // assert
        assertNotEquals(actualResult, null);
    }

    @Test
    public void onDebit_invalid_initial_balance_negative() {
        // arrange
        double startAmount = -1000;
        double expectedEndAmount = -1000;
        double debitAmount = 100;
        BankAccount cut = new BankAccount(startAmount);

        // act
        cut.debit(debitAmount);
        double actualEndAmount = cut.getBalance();

        // assert
        assertEquals(expectedEndAmount, actualEndAmount);
    }

    @Test
    public void onCredit_invalid_credit_negative() {
        // arrange
        double startAmount = 1000;
        double expectedEndAmount = 1000;
        double creditAmount = -100;
        BankAccount cut = new BankAccount(startAmount);

        // act
        cut.credit(creditAmount);
        double actualEndAmount = cut.getBalance();

        // assert
        assertEquals(expectedEndAmount, actualEndAmount);
    }

    @Test
    public void onDebit_invalid_debit_negative() {
        // arrange
        double startAmount = 1000;
        double expectedEndAmount = 1100;
        double debitAmount = -100;
        BankAccount cut = new BankAccount(startAmount);

        // act
        cut.debit(debitAmount);
        double actualEndAmount = cut.getBalance();

        // assert
        assertEquals(expectedEndAmount, actualEndAmount);
    }

}
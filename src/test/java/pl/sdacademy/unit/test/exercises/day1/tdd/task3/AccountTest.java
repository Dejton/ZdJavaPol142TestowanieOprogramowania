package pl.sdacademy.unit.test.exercises.day1.tdd.task3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    /*
    Account credit, poprawny nr konta, kwota: 1000
    Account debit, poprawny nr konta, kwota 1500
     */

    @Test
   void shouldTransferMoney() {
//        given
        Account credit = new Account(2000, "11111111111111111111111111", new Customer("Jan", "Kowalski"));
        Account debit = new Account(1500, "22222222222222222222222222", new Customer("Ala", "Nowak"));
//        when
        debit.transferMoney(credit, 500);
//        then
        assertThat(credit.getBalance()).isEqualTo(2500);
        assertThat(debit.getBalance()).isEqualTo(1000);
    }

    /*
    Account credit, błędny nr konta, kwota: 1000
    Account debit, poprawny nr konta, kwota 1500
     */
    @Test
    void shouldNotTransferMoneyWhenCreditAccountIsWrong_LessDigits() {
//        given
        Account credit = new Account(2000, "1111111111111111111111111", new Customer("Jan", "Kowalski"));
        Account debit = new Account(1500, "22222222222222222222222222", new Customer("Ala", "Nowak"));
//        when
        debit.transferMoney(credit, 500);
//        then
        assertThat(credit.getBalance()).isEqualTo(2000);
        assertThat(debit.getBalance()).isEqualTo(1500);
    }

    @Test
    void shouldNotTransferMoneyWhenCreditAccountIsWrong_NotDigits() {
//        given
        Account credit = new Account(2000, "aaaaaaaaaaaaaaaaaaaaaaaaaa", new Customer("Jan", "Kowalski"));
        Account debit = new Account(1500, "22222222222222222222222222", new Customer("Ala", "Nowak"));
//        when
        debit.transferMoney(credit, 500);
//        then
        assertThat(credit.getBalance()).isEqualTo(2000);
        assertThat(debit.getBalance()).isEqualTo(1500);
    }

        /*
    Account credit, poprawny nr konta, kwota: 1000
    Account debit, błędny nr konta, kwota 1500
     */


    @Test
    void shouldNotTransferMoneyWhenDebitAccountIsWrong_LessDigits() {
//        given
        Account credit = new Account(2000, "11111111111111111111111111", new Customer("Jan", "Kowalski"));
        Account debit = new Account(1500, "2222222222222222222222222", new Customer("Ala", "Nowak"));
//        when
        debit.transferMoney(credit, 500);
//        then
        assertThat(credit.getBalance()).isEqualTo(2000);
        assertThat(debit.getBalance()).isEqualTo(1500);
    }

    @Test
    void shouldNotTransferMoneyWhenDebitAccountIsWrong_NotDigits() {
//        given
        Account credit = new Account(2000, "11111111111111111111111111", new Customer("Jan", "Kowalski"));
        Account debit = new Account(1500, "bbbbbbbbbbbbbbbbbbbbbbbbbb", new Customer("Ala", "Nowak"));
//        when
        debit.transferMoney(credit, 500);
//        then
        assertThat(credit.getBalance()).isEqualTo(2000);
        assertThat(debit.getBalance()).isEqualTo(1500);
    }
    @Test
    void shouldNotTransferMoneyIfAmountIsWrong() {
//        given
        Account credit = new Account(2000, "11111111111111111111111111", new Customer("Jan", "Kowalski"));
        Account debit = new Account(1500, "22222222222222222222222222", new Customer("Ala", "Nowak"));
//        when
        debit.transferMoney(credit, 2000);
//        then
        assertThat(credit.getBalance()).isEqualTo(2000);
        assertThat(debit.getBalance()).isEqualTo(1000);
    }

}
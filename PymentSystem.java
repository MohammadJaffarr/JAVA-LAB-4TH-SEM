/**Write a program to implement Polymorphism 
 * Create a Payment class which will have three functions
 * LogTransaction which will receive a double amount this will log process payment of Rs amount.
 * LogTransaction which will receive a double and currency this will log process payment of Rs amount in the Currency.
 * PaymentProcess which will receive amount and it will print executing generic payment.
 * then create another class UPIPayment that will overwrite paymentProcess will receive amount and it will print executing  UPI payment of Rs amount.
 * then create another class CreditCard that will overwrite paymentProcess will receive amount and it will print executing CreditCard Payment of Rs amount.
 * then create a public class PaymentSystem where we will create any subclass to call the function.
 */

class Payment{

    void LogTransection(double amount){
        System.out.println("Log Process  payment of Rs  : " + amount);
    }
    void LogTransection(double amount, String currency){
        System.out.println("Log process payment of Rs  " + amount + "Currency " + currency);
    }
    void PaymentProcess(double amount){
        System.out.println("Executing generic payment "  + amount);
    }
}
class UPIPayment extends Payment {
    @Override
    void PaymentProcess(double amount) {
        System.out.println("Payment process of Rs " + amount + " Through UPI Payment");
    }
}
class CreditCard extends Payment {
    @Override
    void PaymentProcess(double amount) {
        System.out.println("Payment process of Rs " + amount + " Through Credit Card");
    }  
} 
public class PymentSystem {
    public static void main(String[] args) {
        UPIPayment upi = new UPIPayment();
        upi.PaymentProcess(1000);
        upi.LogTransection(1000, "Rupees");
        CreditCard card = new CreditCard();  
        card.PaymentProcess(2000);
        card.LogTransection(2000, "Dollar");
    }
}

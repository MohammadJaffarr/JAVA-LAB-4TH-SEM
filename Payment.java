/*** Write a program to implement multiple inheritance make two interface 
 * PaymentProcess & Refund ( both will receive an amount in double )
 * Then make a class PaymentGateWay which implements both interfaces 
 * PaymentProcess & Refund
 * The PaymentGateWay class will have String ApiKey a constructer to setup the ApiKey
 * and also implement the two methods PaymentProcess and Refund
 */
//interface for payment
interface PaymentProcess{
    void paymentInteface(double amount);
}
// interface for refund
interface Refund{
    void RefundInteface(double amount);
}

// gateway 

class PaymentGateWay implements PaymentProcess,Refund{
    String ApiKey;
    double Balance =0;
    PaymentGateWay(String ApiKey){
        this.ApiKey = ApiKey;
    
    }
    
    // implement the payments process
    @Override
    public void paymentInteface(double amount) {
        System.out.println("Using API key  : "+ ApiKey);
        System.out.println("Processing payment of  " + amount + " via bank");
        Balance = Balance + amount;
        System.out.println(" The Balance is : " + Balance);
    }
    
    // implements the refunds process 
    @Override
    public void RefundInteface(double amount) {
        System.out.println("Using Api Key : " + ApiKey);
        System.out.println("Refund of " + amount + " has been done ");
        Balance = Balance -amount;
        System.out.println("The balance amount after refund is : " + Balance);

    }
}
// main class 
public class Payment {
    public static void main(String[] args){
        PaymentGateWay Payment = new PaymentGateWay("akj4765" );
        Payment.paymentInteface(1000);
        Payment.RefundInteface(500);

    }
}

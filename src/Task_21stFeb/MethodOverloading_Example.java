package Task_21stFeb;

//In an ATM system, a user can withdraw money in different ways:
  //      1️⃣ By entering the amount (withdraw cash).
    //    2️⃣ By selecting a predefined amount (e.g., ₹500, ₹1000).
      //  3️⃣ By scanning a QR code for online payment.
class ATM{
    void withdraw(double amount){
        System.out.println("Withdrawing ₹" + amount + " from ATM.");
    }
    //overload
    void withdraw(double amount, String payment_method){
        System.out.println("Withdrawing ₹" + amount + " using " + payment_method + " option.");
    }
    void withdraw(String qrCode){
        System.out.println("Processing withdrawal using QR Code: " + qrCode);
    }
}
public class MethodOverloading_Example {
    public static void main(String[] args){
        ATM atm=new ATM();
        atm.withdraw(1000);
        atm.withdraw(2000,"fast_cash");
        atm.withdraw("qwsdcvbghf");

    }
}
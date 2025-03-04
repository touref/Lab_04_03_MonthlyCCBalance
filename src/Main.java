public class Main {
    public static void main(String[] args) {

        int creditBalance = 5000;
        double interestRate = 0.17;
        double monthlyInterest = (creditBalance * interestRate);
        System.out.println("The interest rate after one month is $" + monthlyInterest);
        double monthlyInterest2 = (monthlyInterest * 2);
        System.out.println("The interest rate after two months is $" + monthlyInterest2);
    }
}
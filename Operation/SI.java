// Simple Interest Calculation
// Formula: SI = (P * R * T) / 100
public class SI {
    public static void main(String[] args) {
        double P = 100000.0; // Principal amount
        double R = 11.5;    // Rate of interest
        int T = 2;    // Time in years

        double SI = (P * R * T) / 100; // Simple Interest calculation

        System.out.println("Simple Interest is: " + SI);
        double repayment = P + SI; // Total amount to be repaid
        System.out.println("Total amount to be repaid: " + repayment);
        double monthlyPayment = repayment / (T * 12); // Monthly payment
        System.out.println("Monthly payment over " + (T * 12) + " months: " + monthlyPayment);
    }
}

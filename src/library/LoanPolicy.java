package library;

public class LoanPolicy {

    public int maxAllowed(boolean isFaculty) {
        if (isFaculty) {
            return 5;
        } else {
            return 3;
        }
    }

    public int loanDays() {
        return 14;
    }

    public int overdueFee(int daysLate) {
        return daysLate > 0 ? daysLate * 100 : 0;
    }
}
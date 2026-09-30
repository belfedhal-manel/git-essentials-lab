package library;

public class LoanPolicy {
// Exemple du résultat à obtenir dans votre méthode :
if (isFaculty) {
    return 5; // Limite Enseignant : 5 livres
} else {
    return 3; // Limite Étudiant : 3 livres
}
    public int loanDays() { return 14; }
    public int overdueFee(int daysLate) { return daysLate * 100; }
}

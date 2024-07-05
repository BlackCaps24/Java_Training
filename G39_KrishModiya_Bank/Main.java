package bankCaseStudy;

public class Main {
    public static void main(String[] args) {
        BankFact bankFactory = new MMBankFact();

        SavingA savingA = bankFactory.getNewSavingAcc(101, "Darshan", 2000, true);
        CurrentA currentA = bankFactory.getNewCurrentAcc(102, "Mehul", 5000, 10000);

        savingA.withdraw(1500);
        currentA.withdraw(12000);

        System.out.println(savingAcc);
        System.out.println(currentAcc);
    }
}


package bankCaseStudy;

abstract class BankFact {
    public abstract SavingA getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried);
    public abstract CurrentA getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit);
}


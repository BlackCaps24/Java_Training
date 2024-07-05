package bankCaseStudy;

class MMBankFact extends BankFact {
    @Override
    public SavingA getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
        return new MMSavingA(accNo, accNm, accBal, isSalaried);
    }

    @Override
    public CurrentA getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
        return new MMCurrentA(accNo, accNm, accBal, creditLimit);
    }
}


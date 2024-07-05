package bankCaseStudy;

class MMSavingA extends SavingA {
    public MMSavingA(int accNo, String accNm, float accBal, boolean isSalaried) {
        super(accNo, accNm, accBal, isSalaried);
    }

    @Override
    public void withdraw(float amount) {
        super.withdraw(amount);
    }

    @Override
    public String toString() {
        return "MMSavingAcc: " + super.toString();
    }
}


package bankCaseStudy;

abstract class SavingA extends BankA {
    private boolean isSalaried;
    private static final float MINIMAL = 1000.0f;

    public SavingA(int accNo, String accNm, float accBal, boolean isSalaried) {
        super(accNo, accNm, accBal);
        this.isSalaried = isSalaried;
    }

    public boolean isSalaried() {
        return isSalaried;
    }

    @Override
    public void withdraw(float amount) {
        if (getAccBal() - amount >= MINIMAL) {
            super.deposit(-amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Salaried: " + isSalaried;
    }
}


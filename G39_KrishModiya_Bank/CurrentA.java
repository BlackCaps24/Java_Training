package bankCaseStudy;

abstract class CurrentA extends BankA {
    private float creditLimit;

    public CurrentA(int accNo, String accNm, float accBal, float creditLimit) {
        super(accNo, accNm, accBal);
        this.creditLimit = creditLimit;
    }

    public float getCreditLimit() {
        return creditLimit;
    }

    @Override
    public void withdraw(float amount) {
        if (getAccBal() + creditLimit >= amount) {
            super.deposit(-amount);
        } else {
            System.out.println("Insufficient funds");
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Credit Limit: " + creditLimit;
    }
}


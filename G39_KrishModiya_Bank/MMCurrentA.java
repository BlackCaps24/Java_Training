package bankCaseStudy;

class MMCurrentA extends CurrentA {
    public MMCurrentA(int accNo, String accNm, float accBal, float creditLimit) {
        super(accNo, accNm, accBal, creditLimit);
    }

    @Override
    public void withdraw(float amount) {
        super.withdraw(amount);
    }

    @Override
    public String toString() {
        return "MMCurrentAcc: " + super.toString();
    }
}


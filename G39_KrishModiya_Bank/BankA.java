package bankCaseStudy;

abstract class BankA {
    private int accNo;
    private String accNm;
    private float accBal;

    public BankA(int accNo, String accNm, float accBal) {
        this.accNo = accNo;
        this.accNm = accNm;
        this.accBal = accBal;
    }

    public int getAccNo() {
        return accNo;
    }

    public String getAccNm() {
        return accNm;
    }

    public void setAccNm(String accNm) {
        this.accNm = accNm;
    }

    public float getAccBal() {
        return accBal;
    }

    public abstract void withdraw(float amount);

    public void deposit(float amount) {
        this.accBal += amount;
    }

    @Override
    public String toString() {
        return "Account Number: " + accNo + ", Account Name: " + accNm + ", Account Balance: " + accBal;
    }
}

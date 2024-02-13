import java.util.Date;

public class Account {
    private int accountId;
    private int pesel;
    private String name;
    private Date accountCreation;
    private boolean active;
    private float deposit;
    private String securityQuestion;
    private String serurityAnswer;
    private char accountType;
    private long interest;
    private float debt;
    private double loan;
    private boolean inDebt;

    public Account(int accountId, int pesel, String name, Date accountCreation, boolean active, float deposit, String securityQuestion, String serurityAnswer, char accountType, long interest, float debt, double loan, boolean inDebt) {
        this.accountId = accountId;
        this.pesel = pesel;
        this.name = name;
        this.accountCreation = accountCreation;
        this.active = active;
        this.deposit = deposit;
        this.securityQuestion = securityQuestion;
        this.serurityAnswer = serurityAnswer;
        this.accountType = accountType;
        this.interest = interest;
        this.debt = debt;
        this.loan = loan;
        this.inDebt = inDebt;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getPesel() {
        return pesel;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getAccountCreation() {
        return accountCreation;
    }

    public void setAccountCreation(Date accountCreation) {
        this.accountCreation = accountCreation;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public float getDeposit() {
        return deposit;
    }

    public void setDeposit(float deposit) {
        this.deposit = deposit;
    }

    public String getSecurityQuestion() {
        return securityQuestion;
    }

    public void setSecurityQuestion(String securityQuestion) {
        this.securityQuestion = securityQuestion;
    }

    public String getSerurityAnswer() {
        return serurityAnswer;
    }

    public void setSerurityAnswer(String serurityAnswer) {
        this.serurityAnswer = serurityAnswer;
    }

    public char getAccountType() {
        return accountType;
    }

    public void setAccountType(char accountType) {
        this.accountType = accountType;
    }

    public long getInterest() {
        return interest;
    }

    public void setInterest(long interest) {
        this.interest = interest;
    }

    public float getDebt() {
        return debt;
    }

    public void setDebt(float debt) {
        this.debt = debt;
    }

    public double getLoan() {
        return loan;
    }

    public void setLoan(double loan) {
        this.loan = loan;
    }

    public boolean isInDebt() {
        return inDebt;
    }

    public void setInDebt(boolean inDebt) {
        this.inDebt = inDebt;
    }
    //oneThousandLoan
    //addToDeposit
    //
    //void
    //Daniel Nowacki
    private void oneThousandLoan(){
        setLoan(getDebt()+1000);
        setDebt(getDebt()+1000);
        setInDebt(true);
    }
    //payOneThousandLoan
    //addToDeposit
    //
    //void
    //Daniel Nowacki
    private void payOneThousandLoan(){
        if(getDebt() >= 0){
            setDebt(getDebt()-1000);
        }
        if(getDebt() <= 0){
        setInDebt(false);
        }
    }
    //addToDeposit
    //
    //void
    //Daniel Nowacki
    private void addToDeposit(){
        setDeposit(deposit+1000);
    }
 }

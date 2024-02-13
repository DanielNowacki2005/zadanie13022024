import java.util.Date;

public class Bank {
    private String bankName;
    private Date bankDateCreation;
    private String bankManegerName;
    private int numberOfEmployess;
    private int accountsNumbers;
    private float moneyInDeposit;
    private long moneyLended;
    private boolean active;
    private char bankType;
    private double openTime;


    public Bank(String bankName, Date bankDateCreation,int numberOfEmployess, int accountsNumbers, float moneyInDeposit, long moneyLended, boolean active, char bankType, double openTime,String bankManegerName) {
        this.bankName = bankName;
        this.bankDateCreation = bankDateCreation;
        this.accountsNumbers = accountsNumbers;
        this.moneyInDeposit = moneyInDeposit;
        this.moneyLended = moneyLended;
        this.active = active;
        this.bankType = bankType;
        this.openTime = openTime;
        this.bankManegerName = bankManegerName;
        this.numberOfEmployess  = numberOfEmployess;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Date getBankDateCreation() {
        return bankDateCreation;
    }

    public void setBankDateCreation(Date bankDateCreation) {
        this.bankDateCreation = bankDateCreation;
    }

    public int getAccountsNumbers() {
        return accountsNumbers;
    }

    public void setAccountsNumbers(int accountsNumbers) {
        this.accountsNumbers = accountsNumbers;
    }

    public float getMoneyInDeposit() {
        return moneyInDeposit;
    }

    public void setMoneyInDeposit(float moneyInDeposit) {
        this.moneyInDeposit = moneyInDeposit;
    }

    public long getMoneyLended() {
        return moneyLended;
    }

    public void setMoneyLended(long moneyLended) {
        this.moneyLended = moneyLended;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public char getBankType() {
        return bankType;
    }

    public void setBankType(char bankType) {
        this.bankType = bankType;
    }

    public double getOpenTime() {
        return openTime;
    }

    public void setOpenTime(double openTime) {
        this.openTime = openTime;
    }

    public String getBankManegerName() {
        return bankManegerName;
    }

    public void setBankManegerName(String bankManegerName) {
        this.bankManegerName = bankManegerName;
    }

    public int getNumberOfEmployess() {
        return numberOfEmployess;
    }
    //setNumberOfEmployess
    //
    //void
    //Daniel Nowacki
    public void setNumberOfEmployess(int numberOfEmployess) {
        this.numberOfEmployess = numberOfEmployess;
    }

    //newBankManger
    //String managerName
    //void
    //Daniel Nowacki
    public void newBankManger(String managerName){
        setBankManegerName(managerName);
        System.out.println("new manger is asigned");
    }
    //addNewEmployee
    //
    //void
    //Daniel Nowacki
    public void addNewEmployee(){
        setNumberOfEmployess(getNumberOfEmployess()+1);
    }
    //removeEmployees
    //
    //void
    //Daniel Nowacki
    public void removeEmployee(){
        setNumberOfEmployess(getNumberOfEmployess()-1);
    }
}

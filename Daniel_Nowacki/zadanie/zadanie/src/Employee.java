import java.util.Date;


public class Employee {
    private int pesel;
    private String name;
    private char branch;
    private long lastYearSalary;
    private Date joinedDate;
    private Date concractTime;
    private int yearConcractTime;
    private float monthlySalary;
    private boolean bonus;
    private double yearlyBonus;

    public Employee(int pesel, String name, char branch, long lastYearSalary, Date joinedDate, Date concractTime, int yearConcractTime, float monthlySalary, boolean bonus, double yearlyBonus) {
        this.pesel = pesel;
        this.name = name;
        this.branch = branch;
        this.lastYearSalary = lastYearSalary;
        this.joinedDate = joinedDate;
        this.concractTime = concractTime;
        this.yearConcractTime = yearConcractTime;
        this.monthlySalary = monthlySalary;
        this.bonus = bonus;
        this.yearlyBonus = yearlyBonus;
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

    public char getBranch() {
        return branch;
    }

    public void setBranch(char branch) {
        this.branch = branch;
    }

    public long getLastYearSalary() {
        return lastYearSalary;
    }

    public void setLastYearSalary(long lastYearSalary) {
        this.lastYearSalary = lastYearSalary;
    }

    public Date getJoinedDate() {
        return joinedDate;
    }

    public void setJoinedDate(Date joinedDate) {
        this.joinedDate = joinedDate;
    }

    public Date getConcractTime() {
        return concractTime;
    }

    public void setConcractTime(Date concractTime) {
        this.concractTime = concractTime;
    }

    public int getYearConcractTime() {
        return yearConcractTime;
    }

    public void setYearConcractTime(int yearConcractTime) {
        this.yearConcractTime = yearConcractTime;
    }

    public float getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(float monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public boolean isBonus() {
        return bonus;
    }

    public void setBonus(boolean bonus) {
        this.bonus = bonus;
    }

    public double getYearlyBonus() {
        return yearlyBonus;
    }

    public void setYearlyBonus(double yearlyBonus) {
        this.yearlyBonus = yearlyBonus;
    }
    //extends Employee concract by 1 year
    public void addYearToConcract(){
        setYearConcractTime(getYearConcractTime()+1);
    }
    //activateBonus
    //
    //void
    //Daniel Nowacki
    public void activateBonus(){
        this.setBonus(true);
    }
    //removeBonus
    //
    //void
    //Daniel Nowacki
    public void removeBonus(){
        this.setBonus(false);
    }
    //seeEmplyeeData
    //
    //void
    //Daniel Nowacki
    public void seeEmplyeeData(){
        System.out.println(getName()+getBranch()+getConcractTime()+getJoinedDate()+getMonthlySalary()+getYearlyBonus()+isBonus());
    }

}

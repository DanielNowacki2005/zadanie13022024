# zadanie13022024
This is bank application that contains bank,employee and account data.
There are 3 classes Bank , Account, Employee.
Bank has Poles
 String bankName;
    private Date bankDateCreation;
    private String bankManegerName;
    private int numberOfEmployess;
    private int accountsNumbers;
    private float moneyInDeposit;
    private long moneyLended;
    private boolean active;
    private char bankType;
    private double openTime;
Methods
  get and setter for each pole
  addNewEmployee - makes other person manager
  remove Employee - deletes one epmloyee from NumberOfEmployess
  adds Employee - adds one epmloyee from addNewEmployee
Account has Poles
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

Methods
  get and setter for each pole
  oneThousandLoan
  payOneThousandLoan
  addToDeposit
Employee has Poles
 String bankName;
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
Methods
  get and setter for each pole
  activateBonus
  removeBonus
  seeEmplyeeData

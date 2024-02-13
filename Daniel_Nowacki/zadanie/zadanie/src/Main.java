import java.util.Date;

public class Main {
    public static void main(String[] args) {

    Date myDate = new Date();
    myDate.setTime(1900);

    Bank bank1 = new Bank("a",myDate ,321,20,220,200,true,'a',20.20,"ktos");
    Bank bank2 = new Bank("b",myDate ,20,20,500,521,true,'a',20.20,"2");
    Bank bank3 = new Bank("c",myDate ,2,277,399,200,true,'b',20.20,"3");
        System.out.println(bank1.getBankName());
        System.out.println(bank2.getBankName());
        System.out.println(bank3.getBankName());
    Employee em1 = new Employee(020020,"daniel",'a',200,myDate,myDate,2000,2040,true,1000000);
    Employee em2 = new Employee(302020,"kamil",'b',20002384,myDate,myDate,3000,1,false,0);
    Employee em3 = new Employee(590595,"Janek",'c',200,myDate,myDate,3000,1,false,0);
        em1.seeEmplyeeData();
        em2.seeEmplyeeData();
        em3.seeEmplyeeData();
    Account acc1 = new Account(0,03023,"Dawid",myDate,true,000,"yes","but no",'2',9999,9999,9999999,true);
    Account acc2 = new Account(0,03023,"Kamien",myDate,true,000,"yes","but no",'2',9999,9999,9999999,true);
    Account acc3 = new Account(0,03023,"ktos",myDate,true,000,"yes","but no",'2',9999,9999,9999999,true);
        System.out.println(acc1.getName());
        System.out.println(acc2.getName());
        System.out.println(acc3.getName());
    }
}
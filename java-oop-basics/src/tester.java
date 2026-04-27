import java.util.Scanner;

public class tester {

    public static void main (String[] args){
        Dog a = new Dog();
        a.age=19;
        a.name="dav";
        System.out.println(a);
        System.out.println("_______________________________________________________");
        circle c=new circle();
        c.radius=2;
        c.printDetails();
        System.out.println("_______________________________________________________");
        book b=new book();
        b.title="why";
        b.pages=247;
        b.printDetails();
        System.out.println("_______________________________________________________");
        bankaccount bank=new bankaccount();
        bank.owner="ali";
        bank.balance=1000;
        bank.deposit(900);
        System.out.println(bank);
        bank.withdraw(2000);
        System.out.println(bank);
        System.out.println("________________________________________________________");
        light l=new light();
        l.aaa();
        l.turnon();
        l.aaa();
        l.turnoff();
        l.aaa();
        System.out.println("________________________________________________________");
        classroom c1 = new classroom();
        c1.students = new String[]{"ali", "jad", "david", "laith"};
        c1.print();
        System.out.println("________________________________________________________");
        counter counter = new counter();
        counter.inc();
        counter.inc();
        counter.dec();
        counter.print();








    }

}

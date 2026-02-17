package f1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        Session session =
                factory.openSession();

        Transaction transcation
                = session.beginTransaction();


        System.out.println("Enter  ID, name,Salary,age,Roll");
        Scanner sc = new Scanner(System.in);
        febcode emp = new febcode(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextInt(), sc.next());

        session.persist(emp);

        transcation.commit();
        session.close();
        factory.close();


    }
}

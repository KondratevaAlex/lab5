package Classes;
import java.util.Scanner;

public class Teacher extends Student
{
    protected int mark;

public void estimate() {
    Scanner scan = new Scanner(System.in);
    System.out.print("\nОценка за работу: ");
    mark = scan.nextInt();
    System.out.print(name + " " + patronymic + " " + surname + " Оценка за работу: " + mark);
 }
}
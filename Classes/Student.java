package Classes;
import java.util.Scanner;

public class Student{
     private String name;
     private String patronymic;
     private String surname;
     private static int count = 0;

     public Student(){
       name = "None";
       patronymic = "None";
       surname = "None";
       count++;
     };

     public Student(String name){
      this.name = name;
      patronymic = "None";
      surname = "None";
      count++;
    };

     public Student(String name,String patronymic,String surname,int age){
       this.name = name;
       this.patronymic = patronymic;
       this.surname = surname;
       count++;
     };

     public void set(){
	     Scanner scan = new Scanner(System.in);
         System.out.print("Ââåäèòå èìÿ: ");
         name = scan.nextLine();
         System.out.print("Ââåäèòå îò÷åñòâî: ");
         patronymic = scan.nextLine();
         System.out.print("Ââåäèòå ôàìèëèþ: ");
         surname = scan.nextLine();
     };

     public void printInfo(){
         String info = name + " " + patronymic + " " + surname;
         System.out.println("Ñòóäåíò: " + info );
     };

     public void getFIO() {
	     char [] fio = new char[3];
         fio[0] = surname.charAt(0);
         fio[1] = patronymic.charAt(0);
         fio[2] = name.charAt(0);
         System.out.println("ÔÈÎ: " + fio[0] + fio[1] + fio[2]);
       };

     public static int getCount(){
       return count;
       };
}

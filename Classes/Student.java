package Classes;
import java.util.Scanner;

public class Student{
     protected String name;
     protected String patronymic;
     protected String surname;
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

     public Student(String name,String patronymic,String surname){
       this.name = name;
       this.patronymic = patronymic;
       this.surname = surname;
       count++;
     };

     public void set(){
	     Scanner scan = new Scanner(System.in);
         System.out.print("Введите имя: ");
         name = scan.nextLine();
         System.out.print("Введите отчество: ");
         patronymic = scan.nextLine();
         System.out.print("Введите фамилию: ");
         surname = scan.nextLine();
     };

     public String toString()
      {
         return name + " " + patronymic + " " + surname;
      }

     public void getFIO() {
	     char [] fio = new char[3];
         fio[0] = surname.charAt(0);
         fio[1] = patronymic.charAt(0);
         fio[2] = name.charAt(0);
         System.out.println("ФИО: " + fio[0] + fio[1] + fio[2]);
       };

     public static int getCount(){
       return count;
       };

     public void set(String name, String patronymic, String surname){
        this.name = name;
        this.patronymic = patronymic;
        this.surname = surname;
      };
}

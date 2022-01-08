package Classes;
import java.util.Scanner;

public class Teacher extends Student implements WReview
{
    protected int mark;
    protected int experience;
    protected String AcademicDegree;

public Teacher(String name, String patronymic, String surname, int experience)
    {
      super(name,patronymic,surname);
      this.experience = experience;
    };

public void estimate() {
    Scanner scan = new Scanner(System.in);
    System.out.print("\nОценка за работу: ");
    mark = scan.nextInt();
    System.out.print(name + " " + patronymic + " " + surname + " Оценка за работу: " + mark);
 };
 public void set(String name,String patronymic,String surname, int age, int experience)
   {
        super.set(name,patronymic,surname);
        this.experience = experience;
   }
  public String toString()
    {
       return name + " " + patronymic + " " + surname + " Ñòàæ â ãîäàõ: " + experience;
    }
    public void setAnotherInformation()
    {
      Scanner scan = new Scanner(System.in);
        System.out.print("Ученая степень преподавателя: ");
      AcademicDegree = scan.nextLine();
    }

  public void getAnotherInformation()
    {
      System.out.println("Ученая степень: " + AcademicDegree);
    }
    public String WriteReview()
    {
      Scanner scan = new Scanner(System.in);
      System.out.print("Оценка преподавателя: ");
      mark = scan.nextInt();
      String review;
      System.out.print("Отзыв преподавателя: ");
      review = scan.nextLine();
      return review;
    }
}
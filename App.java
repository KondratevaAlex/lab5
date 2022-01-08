import java.util.Scanner;
import Classes.*;

public class App {
    public static void main(String[] args){
        double[] ansper = new double[2];
		double[] anssur = new double[2];
		int[] age = new int[2];
		double difper, difsur;
        int choice;

		Teacher teacher = new Teacher("Victor", "Sergeevich", "Troitsky", 18);
		Student student = new Student("Victor", "Vladimirovich", "Babarykin");
        teacher.setAnotherInformation();
        student.setAnotherInformation();
		System.out.println(teacher.toString());
		teacher.getAnotherInformation();
		System.out.println(student.toString());
		student.getAnotherInformation();
		String studentReview, teacherReview;
		studentReview = student.WriteReview();
		teacherReview = teacher.WriteReview();
		System.out.println("Отзыв преподавателя: " + teacherReview);
		System.out.println("Отзыв студента: " + studentReview);

		//teacher.estimate();

		//Student Student1 = new Student();
		//System.out.printf("%s\n",Student1.toString());

		//Student Student2 = new Student("Ivanov");
		//System.out.printf("%s\n",Student2.toString());

		//Student Student3 = new Student("Ivan","Ivanovich","Popov");
		//System.out.printf("%s\n",Student3.toString());

		//int counter = Student.getCount();
		//System.out.println("Количество студентов: " + counter);

		//Triangle[] arrtri=new Triangle[3];
		//arrtri[0]=new Triangle(1);
		//arrtri[1]=new Triangle(2);
		//arrtri[2]=new Triangle(3);

		//for (int i = 0; i < 3; i++){
		//	arrtri[i].printtri(arrtri[i]);
		//}
		
		Rectangle[] Array = new Rectangle[3];
			System.out.println("\nВведите данные 3 прямоугольников: ");
			 for (int i = 0; i < 3; i++)
				{
					Array[i] = new Rectangle();
					Array[i].setrect(Array[i]);
				}
			System.out.print("Одномерный массив точек: ");
			 for (int i = 0; i < 3; i++)
			 {
				 Array[i].printrect(Array[i]);
			 }
		Rectangle[][] newArray = new Rectangle[2][2];
		System.out.println("\nВведите данные 4 прямоугольников: ");
		for (int i = 0; i < 2; i++)
		{
			for (int j = 0; j < 2; j++)
			  {
			   newArray[i][j] = new Rectangle();
			   newArray[i][j].setrect(newArray[i][j]);
			  }
			}
		System.out.println("Двумерный массив фигур:");
			for (int i = 0; i < 2; i++)
			{
			 for (int j = 0; j < 2; j++)
			 newArray[i][j].printrect(newArray[i][j]);
			 System.out.print("\n");
		  }

		do{ 
        System.out.println("\nВыберите вид фигур для сравнения:\n1 - Треугольники\n2 - Прямоугольники(квадраты)\n3 - Параллелограммы\n4 - Трапеции\n5 - Круги\n:::");
        Scanner in = new Scanner(System.in);
        choice=in.nextInt();
            switch (choice)
            {
		case 1: {
			Triangle [] arr = new Triangle[2];
			arr[0] = new Triangle();
			arr[1] = new Triangle();
			ObjectInfo [] obj = new ObjectInfo[2];
			obj[0] = new ObjectInfo();
			obj[1] = new ObjectInfo();
			for (int i = 0; i < 2; i++) {
				System.out.println("\nВведите данные  треугольника:\n");
				arr[i].settri(arr[i]);
				obj[i].setInfo(obj[i]);
				arr[i].printtri(arr[i]);
				obj[i].printInfo(obj[i]);
				age[i] = obj[i].ObjectAge();
				System.out.printf("\nВозраст шара в годах: ");
				System.out.print(age[i]);
				ansper[i]= arr[i].triperimeter(arr[i]);
				anssur[i] = arr[i].trisurf(arr[i]);
			}
			difper = ansper[0] / ansper[1];
			difsur = anssur[0] / anssur[1];
			System.out.printf("\n\nОтношение периметров треугольников друг к другу: %lf\n", difper);
			System.out.printf("Отношение площадей треугольников друг к другу: %lf\n", difsur);
			break;
		}
		case 2: {
			Rectangle [] arr = new Rectangle[2];
			arr[0] = new Rectangle();
			arr[1] = new Rectangle();
			ObjectInfo [] obj = new ObjectInfo[2];
			obj[0] = new ObjectInfo();
			obj[1] = new ObjectInfo();
			for (int i = 0; i < 2; i++) {
				System.out.printf("\nВведите данные прямоугольника:\n");
				arr[i].setrect(arr[i]);
				obj[i].setInfo(obj[i]);
				arr[i].printrect(arr[i]);
				obj[i].printInfo(obj[i]);
				age[i] = obj[i].ObjectAge();
				System.out.print("\nВозраст шара в годах: ");
				System.out.print(age[i]);
				ansper[i] = arr[i].rectperimeter(arr[i]);
				anssur[i] = arr[i].rectsurf(arr[i]);
			}
			difper = ansper[0] / ansper[1];
			difsur = anssur[0] / anssur[1];
			System.out.printf("\n\nОтношение периметров треугольников друг к другу: %lf\n", difper);
			System.out.printf("Отношение площадей треугольников друг к другу: %lf\n", difsur);
			break;
		}
		case 3: {
			Parallelogram [] arr = new Parallelogram[2];
			arr[0] = new Parallelogram();
			arr[1] = new Parallelogram();
			ObjectInfo [] obj = new ObjectInfo[2];
			obj[0] = new ObjectInfo();
			obj[1] = new ObjectInfo();
			for (int i = 0; i < 2; i++) {
				System.out.printf("\nВведите данные %d параллелограмма:\n");
				arr[i].setpar(arr[i]);
				obj[i].setInfo(obj[i]);
				arr[i].printpar(arr[i]);
				obj[i].printInfo(obj[i]);
				age[i] = obj[i].ObjectAge();
				System.out.print("\nВозраст шара в годах: ");
				System.out.println(age[i]);
				ansper[i] = arr[i].parperimeter(arr[i]);
				anssur[i] = arr[i].parsurf(arr[i]);
			}
			difper = ansper[0] / ansper[1];
			difsur = anssur[0] / anssur[1];
			System.out.printf("\n\nОтношение периметров треугольников друг к другу: %lf\n", difper);
			System.out.printf("Отношение площадей треугольников друг к другу: %lf\n", difsur);
			break;
		}
		case 4: {
			Trapezoid [] arr = new Trapezoid[2];
			arr[0] = new Trapezoid();
			arr[1] = new Trapezoid();
			ObjectInfo [] obj = new ObjectInfo[2];
			obj[0] = new ObjectInfo();
			obj[1] = new ObjectInfo();
			for (int i = 0; i < 2; i++) {
				System.out.printf("\nВведите данные трапеции:\n");
				arr[i].settrap(arr[i]);
				obj[i].setInfo(obj[i]);
				arr[i].printtrap(arr[i]);
				obj[i].printInfo(obj[i]);
				age[i] = obj[i].ObjectAge();
				System.out.print("\nВозраст шара в годах: ");
				System.out.println(age[i]);
				ansper[i] = arr[i].trapperimeter(arr[i]);
				anssur[i] = arr[i].trapsurf(arr[i]);
			}
			difper = ansper[0] / ansper[1];
			difsur = anssur[0] / anssur[1];
			System.out.printf("\n\nОтношение периметров треугольников друг к другу: %lf\n", difper);
			System.out.printf("Отношение площадей треугольников друг к другу: %lf\n", difsur);
			break;
		}
		case 5: {
			Circle [] arr = new Circle[2];
			arr[0] = new Circle();
			arr[1] = new Circle();
			ObjectInfo [] obj = new ObjectInfo[2];
			obj[0] = new ObjectInfo();
			obj[1] = new ObjectInfo();
			System.out.printf("\nВведите данные %d круга:\n");
			for (int i = 0; i < 2; i++) {
				arr[i].setcirc(arr[i]);
				obj[i].setInfo(obj[i]);
				arr[i].printcirc(arr[i]);
				obj[i].printInfo(obj[i]);
				age[i] = obj[i].ObjectAge();
				System.out.print("\nВозраст шара в годах: ");
				System.out.println(age[i]);
				ansper[i] = arr[i].circperimeter(arr[i]);
				anssur[i] = arr[i].circsurf(arr[i]);
			}
			difper = ansper[0] / ansper[1];
			difsur = anssur[0] / anssur[1];
			System.out.printf("\n\nОтношение периметров треугольников друг к другу: %lf\n", difper);
			System.out.printf("Отношение площадей треугольников друг к другу: %lf\n", difsur);
			break;
		}
		   }
		} while (choice != 0);
}
}
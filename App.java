import java.util.Scanner;
import Classes.*;

public class App {
    public static void main(String[] args){
        double[] ansper = new double[2];
		double[] anssur = new double[2];
		int[] age = new int[2];
		double difper, difsur;
        int choice;
		Student Student1 = new Student();//вызов конструктора без параметров
		Student1.printInfo();

		Student Student2 = new Student("Ivanov");//вызов конструктора с одним параметром
		Student2.printInfo();

		Student student3 = new Student("Ivan","Ivanovich","Popov",21);//вызов конструктора со всеми параметрами
		student3.printInfo();

		int counter = Student.getCount();
		System.out.println("Количество студентов: " + counter);

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
import java.util.Scanner;
import Classes.*;

public class App {
    public static void main(String[] args){
        double ansper, anssur, dif;
        int choice;
		do{ 
        System.out.println("\nВыберите вид фигур для сравнения:\n1 - Треугольники\n2 - Прямоугольники(квадраты)\n3 - Параллелограммы\n4 - Трапеции\n5 - Круги\n:::");
        Scanner in = new Scanner(System.in);
        choice=in.nextInt();
            switch (choice)
            {
		case 1: {
			Triangle arr = new Triangle();
			ObjectInfo obj = new ObjectInfo();
			
				System.out.println("\nВведите данные  треугольника:\n");
				arr.settri(arr);
				obj.setInfo(obj);
				arr.printtri(arr);
				obj.printInfo(obj);
				ansper= arr.triperimeter(arr);
				anssur = arr.trisurf(arr);
			
			dif=anssur/ansper;
			System.out.printf("\n\nОтношение объема треугольника к его периметру: ");
			System.out.print(dif);
			break;
		}
		case 2: {
			Rectangle arr = new Rectangle();
			ObjectInfo obj = new ObjectInfo();
				System.out.printf("\nВведите данные прямоугольника:\n");
				arr.setrect(arr);
				obj.setInfo(obj);
				arr.printrect(arr);
				obj.printInfo(obj);
				ansper = arr.rectperimeter(arr);
				anssur = arr.rectsurf(arr);
			dif=anssur/ansper;
			System.out.printf("\n\nОтношение объема прямоугольника к его периметру: ");
			System.out.print(dif);
			break;
		}
		case 3: {
			Parallelogram arr = new Parallelogram();
			ObjectInfo obj = new ObjectInfo();
				System.out.printf("\nВведите данные %d параллелограмма:\n");
				arr.setpar(arr);
				obj.setInfo(obj);
				arr.printpar(arr);
				obj.printInfo(obj);
				ansper = arr.parperimeter(arr);
				anssur = arr.parsurf(arr);
			dif=anssur/ansper;
			System.out.printf("\n\nОтношение объема параллелограмма к его периметру: ");
			System.out.print(dif);
			break;
		}
		case 4: {
			Trapezoid arr = new Trapezoid();
			ObjectInfo obj = new ObjectInfo();
				System.out.printf("\nВведите данные трапеции:\n");
				arr.settrap(arr);
				obj.setInfo(obj);
				arr.printtrap(arr);
				obj.printInfo(obj);
				ansper = arr.trapperimeter(arr);
				anssur = arr.trapsurf(arr);
			dif=anssur/ansper;
			System.out.printf("\n\nОтношение объема трапеции к его периметру: ");
			System.out.print(dif);
			break;
		}
		case 5: {
			Circle arr = new Circle();
			ObjectInfo obj = new ObjectInfo();
			System.out.printf("\nВведите данные %d круга:\n");
				arr.setcirc(arr);
				obj.setInfo(obj);
				arr.printcirc(arr);
				obj.printInfo(obj);
				ansper = arr.circperimeter(arr);
				anssur = arr.circsurf(arr);
			dif=anssur/ansper;
			System.out.printf("\n\nОтношение объема круга к его периметру: ");
			System.out.print(dif);
			break;
		}
		   }
		} while (choice != 0);
}
}
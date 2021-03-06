package Classes;
import java.util.Scanner;

public class ObjectInfo {
    private int colour;
    private int day;
    private int month;
    private int year;

    public ObjectInfo()
{
	colour = day = month = year = 0;
};

public ObjectInfo(int colour, int day, int month, int year)
{
	this.colour = colour;
	this.day = day;
	this.month = month;
	this.year = year;
};

public ObjectInfo(int noll){
	colour=day=month=year=noll;
};

public ObjectInfo setInfo(ObjectInfo obj)
{
	Scanner in = new Scanner(System.in);
    System.out.print("\nВведите цвет фигуры (1-красный, 2-синий, 3-зеленый, 4-желтый): ");
	colour=in.nextInt();
	System.out.print("\nВведите сегодняшний день: ");
	day=in.nextInt();
	System.out.print("\nВведите нынешний месяц: ");
	month=in.nextInt();
	System.out.print("\nВведите нынешний год: ");
	year=in.nextInt();
	return obj;
};

public void printInfo(ObjectInfo obj)
{
	Scanner in = new Scanner(System.in);
    System.out.printf("\nЦвет фигуры(1-красный, 2-синий, 3-зеленый, 4-желтый): %d\nДата работы: %d/%d/%d", colour, day, month, year);
};

public int ObjectAge(){
	int age = 2022-year;
	return age;
}
}

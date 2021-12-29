package Classes;
import java.util.Scanner;

public class Rectangle {
    private double dlinaarect;
    private double dlinabrect;
    private ObjectInfo another_info;

    public Rectangle setrect(Rectangle rect){
        Scanner in = new Scanner(System.in);
        System.out.print("Длина стороны а: ");
        dlinaarect=in.nextDouble();
        System.out.print("Длина стороны b: ");
        dlinabrect=in.nextDouble();
        return rect;
    };
    public void printrect(Rectangle rect){
        System.out.printf("Длины сторон а и b соответственно: %lf, %lf", dlinaarect, dlinabrect);
    };
	public double rectperimeter(Rectangle rect){
        double perimetrrect;
        perimetrrect=(dlinaarect+dlinabrect)*2;
        return perimetrrect;
    };
	public double rectsurf(Rectangle rect){
        double surfrect;
        surfrect=dlinaarect*dlinabrect;
        return surfrect;
    };
    public void addAnotherInfo(ObjectInfo someinfo){
		another_info = someinfo;
	};
}

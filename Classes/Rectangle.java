package Classes;
import java.util.Scanner;

public class Rectangle {
    private double dlinaarect;
    private double dlinabrect;
    private ObjectInfo another_info;

    public Rectangle(){
        dlinaarect=dlinabrect=0.0;
    };
    
    public Rectangle(double noll){
        dlinaarect=dlinabrect=noll;
    };

    public Rectangle(double dlinaarect, double dlinabrect){
        this.dlinaarect=dlinaarect;
        this.dlinabrect=dlinabrect;
    };

    public Rectangle setrect(Rectangle rect){
        Scanner in = new Scanner(System.in);
        System.out.print("Длина стороны а: ");
        try{
        dlinaarect=in.nextDouble();
        if(dlinaarect<0){
            throw new Exception("Некорректный ввод.");
        }
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        System.out.print("Длина стороны b: ");
        try{
        dlinabrect=in.nextDouble();
        if(dlinabrect<0){
            throw new Exception("Некорректный ввод.");
        }
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
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

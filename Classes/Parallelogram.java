package Classes;
import java.util.Scanner;

public class Parallelogram {
    private double dlinaapar;
    private double dlinabpar;
    private double ygolalppar;
    private ObjectInfo another_info;

    public Parallelogram(){
        dlinaapar=dlinabpar=ygolalppar=0.0;
    };

    public Parallelogram(Double noll){
        dlinaapar=dlinabpar=ygolalppar=noll;
    };

    public Parallelogram(double dlinaapar, double dlinabpar, double ygolalppar){
        this.dlinaapar=dlinaapar;
        this.dlinabpar=dlinabpar;
        this.ygolalppar=ygolalppar;
    };

    public Parallelogram setpar(Parallelogram paral){
        Scanner in = new Scanner(System.in);
        System.out.print("Длина стороны а: ");
        dlinaapar=in.nextDouble();
        System.out.print("Длина стороны b: ");
        dlinabpar=in.nextDouble();
        System.out.print("Угол между сторонами a и b (в градусах): ");
        ygolalppar=in.nextDouble();
        return paral;
    };
    public void printpar(Parallelogram par){
        System.out.printf("Длины сторон а, b и угол в градусах между ними соответственно: %lf, %lf, %lf", dlinaapar, dlinabpar, ygolalppar);
    };
	public double parperimeter(Parallelogram par){
        double perimetrpar;
        perimetrpar=(dlinaapar+dlinabpar)*2;
        return perimetrpar;
    };
	public double parsurf(Parallelogram par){
        double surfpar;
        surfpar=dlinaapar*dlinabpar*ygolalppar;
        return surfpar;
    };
    public void addAnotherInfo(ObjectInfo someinfo){
		another_info = someinfo;
	};
}

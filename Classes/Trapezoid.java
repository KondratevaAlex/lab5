package Classes;
import java.util.Scanner;

public class Trapezoid {
    private double dlinaatrap;
    private double dlinabtrap;
    private double dlinactrap;
    private double dlinadtrap;
    private double dlinahtrap;
    private ObjectInfo another_info;

    public Trapezoid(){
        dlinaatrap=dlinabtrap=dlinactrap=dlinadtrap=dlinahtrap=0.0;
    }
    
    public Trapezoid(double noll){
        dlinaatrap=dlinabtrap=dlinactrap=dlinadtrap=dlinahtrap=noll;
    };

    public Trapezoid(double dlinaatrap, double dlinabtrap, double dlinactrap, double dlinadtrap, double dlinahtrap){
        this.dlinaatrap=dlinaatrap;
        this.dlinabtrap=dlinabtrap;
        this.dlinactrap=dlinactrap;
        this.dlinadtrap=dlinadtrap;
        this.dlinahtrap=dlinahtrap;
    }

    public Trapezoid settrap(Trapezoid trap){
        Scanner in = new Scanner(System.in);
        System.out.print("Длина стороны а: ");
        dlinaatrap=in.nextDouble();
        System.out.print("Длина стороны b: ");
        dlinabtrap=in.nextDouble();
        System.out.print("Длина стороны c: ");
        dlinactrap=in.nextDouble();
        System.out.print("Длина стороны d: ");
        dlinadtrap=in.nextDouble();
        System.out.print("Длина высоты h: ");
        dlinahtrap=in.nextDouble();
        return trap;
    };
    public void printtrap(Trapezoid trap){
        System.out.printf("Длина оснований a и b, сторон c и d и высоты h соответственно: %lf, %lf, %lf, %lf, %lf", dlinaatrap, dlinabtrap, dlinactrap, dlinadtrap, dlinahtrap);
    };
	public double trapperimeter(Trapezoid trap){
        double perimetrtrap;
        perimetrtrap=dlinaatrap+dlinabtrap+dlinactrap+dlinadtrap;
        return perimetrtrap;
    };
	public double trapsurf(Trapezoid trap){
        double surftrap;
        surftrap=((dlinaatrap*dlinabtrap)/2)*dlinahtrap;
        return surftrap;
    };
    public void addAnotherInfo(ObjectInfo someinfo){
		another_info = someinfo;
	};
}

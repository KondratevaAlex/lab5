package Classes;
import java.util.Scanner;
import java.math.*;
import Classes.*;

public class Circle {
    private double dlinarcirc;
    private ObjectInfo another_info;

    public Circle(){
        dlinarcirc=0.0;
    };

    public Circle(double noll){
        dlinarcirc=noll;
    };

    public Circle setcirc(Circle circ){
        Scanner in = new Scanner(System.in);
        System.out.print("Длина радиуса r: ");
        dlinarcirc=in.nextDouble();
        return circ;
    };
    public void printcirc(Circle circ){
        System.out.printf("Длина радиуса r: %lf", dlinarcirc);
    };
    public double circperimeter(Circle circ){
        double perimetrcirc;
        perimetrcirc=2*Math.PI*dlinarcirc;
        return perimetrcirc;
    };
    public double circsurf(Circle circ){
        double surfcirc;
        surfcirc=Math.PI*Math.pow(dlinarcirc, 2);
        return surfcirc;
    };
    public void addAnotherInfo(ObjectInfo someinfo){
		another_info = someinfo;
	};
}

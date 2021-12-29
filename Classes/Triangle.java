package Classes;
import java.util.Scanner;
import java.math.*;

public class Triangle {
    private double dlinaatri;
    private double dlinabtri;
    private double dlinactri;
    private ObjectInfo anotherinfo;

    public Triangle settri(Triangle tri){
        Scanner in = new Scanner(System.in);
        System.out.print("Длина стороны а: ");
        dlinaatri=in.nextDouble();
        System.out.print("Длина стороны b: ");
        dlinabtri=in.nextDouble();
        System.out.print("Длина стороны c: ");
        dlinactri=in.nextDouble();
        return tri;
    };
    public void printtri(Triangle trian){
        System.out.printf("Длины сторон а, b и c соответственно: ");
        System.out.print(dlinaatri+","+dlinabtri+","+dlinactri);
    };
	public double triperimeter(Triangle trian){
        double perimetrtri;
        perimetrtri=dlinaatri+dlinabtri+dlinactri;
        return perimetrtri;
    };
	public double trisurf(Triangle trian){
        double surftri;
        double perim;
        perim=(dlinaatri+dlinabtri+dlinactri)/2;
        surftri=Math.sqrt(perim * (perim - dlinaatri) * (perim - dlinabtri) * (perim - dlinactri));
        return surftri;
    };
    
}

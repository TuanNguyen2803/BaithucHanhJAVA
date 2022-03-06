import java.util.Scanner;
public class App1{
    public static void main(String[] args) throws Exception {
        double hesoA, hesoB, hesoC, delta;
        double X1,X2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao he so A");
        hesoA = sc.nextDouble();
        System.out.print("Nhap vao he so B");
        hesoB = sc.nextDouble();
        System.out.print("Nhap vao he so C");
        hesoC = sc.nextDouble();
    delta = hesoB * hesoB - 4 * hesoA * hesoC;
    if (hesoA == 0) {
        if (hesoB == 0) {
            System.out.println("Phuong trinh vo so nghiem!");
        } else {
            System.out.println("Phuong trinh co mot nghiem la: "
                    + "X1 = " + (-hesoC / hesoB));   
        }
        return;
    }
    if (delta > 0){
       X1=((-hesoB+(Math.sqrt(delta)))/(2*hesoA));
       X2=((-hesoB-Math.sqrt(delta))/(2*hesoA));
       System.out.println("Phuong trinh co 2 nghiem la : "
                    + "X1 = "  + X1 + " và X2 = " + X2);
    }else if (delta == 0) {
       X1=X2=(-hesoB)/(2*hesoA);
       System.out.println("Phuong trinh co nghiem kep: "
                    + "X1 = X2 = " + X1);
    }else 
       System.out.println("Phuong trinh vo nghiem!");
    }
}
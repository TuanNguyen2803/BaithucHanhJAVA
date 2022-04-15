package shapes;
import java.util.Scanner;

public class Hinhtron extends Hinhhoc {
    public Hinhtron(){
         ten="Hinhtron";
         super();
        
    }

    public float bankinh;

    public void nhapbankinh(){
        System.out.println("Bán kính=");
        Scanner scanner=new Scanner(System.in);
        bankinh =scanner.nextFloat(); 
    }
    public void tinhchuvi(){
        chuvi=2*PI*bankinh;
    }
    public void tinhdientich(){
        dientich=PI*bankinh*bankinh;
    }  
     public void xuatthongtin(){
         System.out.println("Day la hinh tron");
     }
}

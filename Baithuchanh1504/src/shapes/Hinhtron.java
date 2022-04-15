package shapes;
import java.util.Scanner;

public class Hinhtron extends Hinhhoc {
    public float bankinh;
    public Hinhtron(){
        ten="Hinhtron";
    }
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
}

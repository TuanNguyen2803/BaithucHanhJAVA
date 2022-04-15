package shapes;
import java.util.Scanner;
public class Hinhchunhat extends Hinhhoc{
    public Hinhchunhat(){
        super();

    }
    public float chieudai;
    public float chieurong;

    public Hinhchunhat(){
        ten="Hinhchunhat";
    }
    public void nhapchieudai(){
        System.out.println("Chieu dai=");
        Scanner scanner=new Scanner(System.in);
        chieudai =scanner.nextFloat(); 
    }
    public void nhapchieurong(){
        System.out.println("Chieu rong=");
        Scanner scanner=new Scanner(System.in);
        chieurong =scanner.nextFloat(); 
    }
    public void tinhchuvi(){
        chuvi=2*(chieudai+chieurong);
    }
    public void tinhdientich(){
        dientich=chieudai*chieurong ;
    }
}

package shapes;
import java.util.Scanner;

public class Hinhtru extends Hinhtron {
    public float chieucao;

    public Hinhtru(){
        ten="Hinhtru";
    }
 public void nhapchieucao(){
     nhapbankinh();
     System.out.println("Chieu cao=");
     Scanner scanner=new Scanner(System.in);
     chieucao =scanner.nextFloat(); 
 }
 public void tinhthetich(){
     tinhdientich();
     thetich=dientich*chieucao;
 }
 public void xuatthongtin(){
    System.out.println("Day la hinh tru");
}
}

package shapes;
import java.util.Scanner;
public class Hinhvuong extends Hinhchunhat {
    public Hinhvuong(){
        ten="Hinhvuong";
    }
    public void nhapcanh(){
        System.out.println("Canh=");
        Scanner scanner=new Scanner(System.in);
        chieudai=chieurong =scanner.nextFloat();
    }
    
}

package shapes;

import java.util.Scanner;
public class Hinhvuong extends Hinhchunhat {
    public Hinhvuong()
    {
        super();//Static
        ten = "Hình Vuông";
    }

    public void nhapCanh()
    {
        System.out.println("Cạnh = ");
        Scanner sc = new Scanner(System.in);
        cDai = cRong = sc.nextFloat();
    }
}
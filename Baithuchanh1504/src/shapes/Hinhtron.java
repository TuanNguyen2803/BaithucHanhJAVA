package shapes;

import java.util.Scanner;
public class Hinhtron extends Hinhhoc {
    public float banKinh;

    public Hinhtron()
    {
        super();//Static
        ten = "Hình Tròn";
    }

    public void nhapBanKinh()
    {
        System.out.println("Bán kính = ");
        Scanner sc = new Scanner(System.in);
        banKinh = sc.nextFloat();
    }

    public void tinhChuVi()
    {
        chuVi = 2 * PI * banKinh;
    }

    public void tinhDienTich()
    {
        dienTich = PI * banKinh * banKinh;
    }

    public void xuatThongTin()
    {
        System.out.println("Đây là hình tròn");
    }
}
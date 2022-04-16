package shapes;

import java.util.Scanner;
public class Hinhtru extends Hinhtron {
    public float chieuCao;

    public Hinhtru()
    {
        super();//Static
        ten = "Hình Trụ";
    }

    public void nhapChieuCao()
    {
        nhapBanKinh();

        System.out.println("Chiều cao = ");
        Scanner sc = new Scanner(System.in);
        chieuCao = sc.nextFloat();
    }

    public void tinhTheTich()
    {
        tinhDienTich();
        theTich = dienTich * chieuCao;
    }

    @Override
    public void xuatThongTin()
    {
        System.out.println("Đây là hình trụ.");
    }
}

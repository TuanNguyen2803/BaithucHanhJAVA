package shapes;
import java.util.Scanner;
public class Hinhchunhat {
    float cd;
    float cr;
    float cv;
    float dt;
    Scanner sc = new Scanner(System.in);
public void nhapchieudai(){
    System.out.print("Nhap chieu dai cua HCN: ");
    cd = sc.nextFloat(); 
}
public void nhapchieurong()
{
    System.out.print("Nhap chieu rong cua HCN: ");
    cr = sc.nextFloat();
}
public void tinhChuVi()
{
    cv = (cd + cr) * 2;
}
public void tinhDienTinh()
{
    dt = cd * cr;
}
public void inChuVi()
{
    System.out.print("Chu vi HCN la: " + cv);
}
public void inDienTich()
{
    System.out.print("\nDien tich HCN la: " + dt);
}
}
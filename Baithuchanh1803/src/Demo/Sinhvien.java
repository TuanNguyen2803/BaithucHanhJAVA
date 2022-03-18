package Demo;
import java.util.Scanner;
import javax.print.attribute.standard.DateTimeAtCompleted;
public class Sinhvien {
    String MSV;
    String HoTen;
    String DiaChi;
    Boolean GioiTinh;
    DateTime NgaySinh;
    Scanner sc = new Scanner(System.in);
    public void nhapMaSinhVien(){
        System.out.print("Nhap ma sinh vien: ");
        MSV = sc.nextLine();
    }
    public void nhapHoTen(){
        System.out.print("Nhap ho ten sinh vien: ");
        HoTen = sc.nextLine();
    }
    public void nhapDiaChi(){
        System.out.print("Nhap dia chi cua sinh vien: ");
        DiaChi = sc.nextLine();
    }
    public void nhapGioiTinh(){
        System.out.print("Nhap dia chi cua sinh vien: ");
       GioiTinh = sc.nextBoolean();
    }
    public void nhapNgaySinh(){
        System.out.print("Nhap ngay sinh cua sinh vien: ");
       NgaySinh= sc.nextLine();
    }
    public void hienThiTT() {
        System.out.printf("%-5d %-20s %-15s %-15s n", MSV, HoTen, DiaChi, GioiTinh);
    }
}
        

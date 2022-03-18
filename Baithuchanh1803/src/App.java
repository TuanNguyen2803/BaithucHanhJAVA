import shapes.Hinhtron;
import shapes.Hinhchunhat;
import Demo.Person;
import Demo.Phuongtrinhbachai;
import Demo.Sinhvien;
public class App {
    public static void main(String[] args) throws Exception {
        Hinhtron ht = new Hinhtron();
        Hinhchunhat hcn = new Hinhchunhat();
        Phuongtrinhbachai ptbh = new Phuongtrinhbachai();
        Sinhvien sv =new Sinhvien();
        Person ps = new Person();
          //Hinh tròn
         ht.NhapBanKinh();
         ht.tinhChuVi();
         ht.inChuVi();
         ht.tinhDienTinh();
         ht.inDienTich();
 
         System.out.print("\n\n");
         //Hình chữ nhật
         hcn.nhapchieudai();
         hcn.nhapchieurong();
         hcn.tinhChuVi();
         hcn.tinhDienTinh();
         hcn.inChuVi();
         hcn.inDienTich();
        
         System.out.print("\n\n");
         // Giải phương trình bậc 2
         ptbh. nhaphesobac2();
         ptbh.nhaphesobac1();
         ptbh.nhaphesotudo();
         ptbh.giaiPTBac2();

         System.out.print("\n\n");
         //Quản lý sinh viên
         sv.nhapMaSinhVien();
         sv.nhapHoTen();
         sv.nhapDiaChi();
         sv.nhapGioiTinh();
         sv.nhapNgaySinh();

         System.out.print("\n\n");
         //Thông tin đối tượng person
         ps.nhapthongtin();
         ps.inthongtin();
    
         System.out.print("\n\n");
    }
}

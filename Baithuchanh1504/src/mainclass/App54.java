package mainclass;
import shapes.Hinhchunhat;
import shapes.Hinhtron;
import shapes.Hinhtru;
import shapes.Hinhvuong;

public class App54 {
    public static void main(String[] args) throws Exception {
    
        //Hình tròn
        Hinhtron hinhtron = new Hinhtron();
        hinhtron.xuatTen();
        hinhtron.nhapBanKinh();
        hinhtron.tinhChuVi();
        hinhtron.tinhDienTich();
        hinhtron.inchuVi();
        hinhtron.indienTich();
        
        //Hinh trụ
        Hinhtru hinhtru = new Hinhtru();
        hinhtru.xuatTen();
        hinhtru.nhapChieuCao();
        hinhtru.tinhTheTich();
        hinhtru.intheTich();
        
        //Hình Chữ Nhật
        Hinhchunhat hinhchunhat = new Hinhchunhat();
        hinhchunhat.xuatTen();
        hinhchunhat.nhapChieuDai();
        hinhchunhat.nhapChieuRong();
        hinhchunhat.tinhChuVi();
        hinhchunhat.tinhDienTich();
        hinhchunhat.inchuVi();
        hinhchunhat.indienTich();
    
        //Hình Vuông
        Hinhvuong hinhvuong = new Hinhvuong();
        hinhvuong.xuatTen();
        hinhvuong.nhapCanh();
        hinhvuong.tinhChuVi();
        hinhvuong.tinhDienTich();
        hinhvuong.inchuVi();
        hinhvuong.indienTich();
    }
}
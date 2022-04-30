package shapes;
public class App2604 {
    public static void main (String[] args){
        Point p=new Point();
        p.getHoanhDo();
        p.getTungDo();
        p.nhap();
        p.hienthi();
        

        Tugiac b = new Tugiac();
        b.nhapTuGiac();
        b.kiemTraTuGiac();
        b.kiemTraLoaiTuGiac();


        Tamgiac tg = new Tamgiac();
        tg.nhaptamgiac();
        tg.kiemTraLoaiTamGiac();
    }
    
}

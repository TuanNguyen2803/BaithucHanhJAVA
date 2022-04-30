package shapes;
public class Tamgiac extends Point{
    private float canhA;
    private float canhB;
    private float canhC;
    public Tamgiac(float canhA , float canhB , float canhC) {
        this.canhA = canhA;
        this.canhB = canhB;
        this.canhC = canhC;
    }

    public void nhaptamgiac(){
        Point p1 = new Point();
        Point p2 = new Point();
        Point p3 = new Point();
        System.out.println("Nhap diem thu nhat: ");
        p1.nhap();
        System.out.println("Nhap diem thu hai: ");
        p2.nhap();
        System.out.println("Nhap diem thu ba: ");
        p3.nhap();
        
        canhA = (float)Math.sqrt(Math.pow(p1.HoanhDo-p2.HoanhDo, 2)+Math.pow(p1.TungDo-p2.TungDo, 2));
        System.out.println("Nhap canh A: " + canhA);
        canhB = (float)Math.sqrt(Math.pow(p2.HoanhDo-p3.HoanhDo, 2)+Math.pow(p2.TungDo-p3.TungDo, 2));
        System.out.println("Nhap canh B: " + canhB);
        canhC = (float)Math.sqrt(Math.pow(p1.HoanhDo-p3.HoanhDo, 2)+Math.pow(p1.TungDo-p3.TungDo, 2));
        System.out.println("Nhap canh C: " + canhC);
    }
    
    

    public void kiemTraLoaiTamGiac(){

            if(canhA+canhB>canhC && canhB+canhC>canhA && canhC+canhA>canhB)
            {
            
            System.out.println("Day la tam giac nhon !!! ");
            
                if( canhA == canhB && canhB == canhC )
            
                        System.out.println("Day la tam giac deu !!!");
            
                if( canhA==canhB || canhB == canhC || canhC == canhA)
            
                        System.out.println("Day la tam giac can !!!");
            }
            
            else
                {
                    System.out.println("Khong la 3 canh cua tam giac !!! ");
                }
            
            if(canhA*canhA==canhB*canhB+canhC*canhC || canhB*canhB==canhA*canhA+canhC*canhC || canhC*canhC==canhA*canhA+canhB*canhB)
            
                    System.out.println("La tam giac vuong !!!"); 
            
                }
        
        
    }


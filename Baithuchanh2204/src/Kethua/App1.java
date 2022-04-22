package Kethua;

public class App1 {
    public static void main(String[] args) throws Exception {
    
     Student std=new Student();
    
       std.nhapthongtinsinhvien();
       std.inMSV();
        
    OfflineStudent ostd=new OfflineStudent();
    ostd.nhapdiemdanh();  
    ostd.xuatdiemdanh();
      
      
    OnlineStudent onstd=new OnlineStudent(); 
      onstd.nhapHientrang();
      onstd.inTrangThai();

    ParttimeEmpoyee pt=new ParttimeEmpoyee();
      pt.nhapsogio();
      pt.insogiolam();

    FulltimeEmpoyee ft=new FulltimeEmpoyee();
      ft.nhapsongaylam();
      ft.insongaylam();

    Employee emp=new Employee();
    
      emp.nhapSDT();
      emp.inSDT();

    Custemer ct=new Custemer();
    ct.nhapdiachi();
    ct.xuatdiachi();

    Vipcustemer vct=new Vipcustemer();
    vct.nhapsolanden();
    vct.xuatsolanden();
  
      
    }

}

package Loptruutuong;

public class TaxiCar implements Car {
     public void move(){
         System.out.println("Oto di chuyen len Ha Noi");
     }
     public void stop(){
         System.out.println("Oto dung o ben xe");
        }
     public void turnRight(){
        System.out.println("Re phai 500m");
     }
     public void turnleft(){
        System.out.println("Re trai 300m");
     }
     public void reverse(){
        System.out.println("Oto quay dau");
     }

}

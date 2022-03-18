package shapes;
import java.util.Scanner;
public class Phuongtrinhbachai {
    float a,b,c;
    Scanner sc = new Scanner(System.in);
    public void nhaphesobac2(){
        System.out.print("Nhập hệ số bac 2, a = ");
        a = sc.nextFloat();
    }
    public void nhaphesobac1(){
        System.out.print("Nhập hệ số bac 1, b = ");
        b = sc.nextFloat();
    }
    public void nhaphesotudo(){
        System.out.print("Nhập hệ số tự do, c = ");
        c = sc.nextFloat();
    }
    public void giaiPTBac2() {
        // kiểm tra các hệ số
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: "+ "x = " + (-c / b));
            }
            return;
        }
        // tính delta
        float delta = b*b - 4*a*c;
        float x1;
        float x2;
        // tìm nghiệm
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phương trình có 2 nghiệm là: "+ "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: "+ "x1 = x2 = " + x1);
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }
    }
}
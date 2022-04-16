package mainclass;
import shapes.Hinhchunhat;
import shapes.Hinhtron;
import shapes.Hinhhoc;

public class App75 {
    public static void main(String [] args){
        Hinhhoc hinhhoc = new Hinhhoc();
        Hinhtron hinhtron1 = new Hinhtron();
        Hinhtron hinhtron2 = new Hinhtron();
        Hinhchunhat hinhchunhat = new Hinhchunhat();

        //Đếm số hình
        System.out.println("Có tất cả " + Hinhtron.dem + " hình trong ứng dụng.");
    }
}
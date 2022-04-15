package mainclass;
import shapes.Hinhchunhat;
import shapes.Hinhtron;
import shapes.Hinhtru;
import shapes.Hinhvuong;

public class App54 {
    public static void main (String[] args){
        //Hinhtron
        Hinhtron hinhtron=new Hinhtron();
        hinhtron.xuatten();
        hinhtron.nhapbankinh();
        hinhtron.tinhchuvi();
        hinhtron.tinhdientich();
        hinhtron.inchuvi();
        hinhtron.indientich();
        // Hinhtru
        Hinhtru hinhtru=new Hinhtru();
        hinhtru.xuatten();
        hinhtru.nhapchieucao();
        hinhtru.tinhthetich();
        hinhtru.inthetich();
        //Hinhchunhat
        Hinhchunhat hinhchunhat=new Hinhchunhat();
        hinhchunhat.xuatten();
        hinhchunhat.nhapchieudai();
        hinhchunhat.nhapchieurong();
        hinhchunhat.tinhchuvi();
        hinhchunhat.tinhdientich();
        hinhchunhat.inchuvi();
        hinhchunhat.indientich();
        //Hinhvuong
        Hinhvuong hinhvuong=new Hinhvuong();
        hinhvuong.xuatten();
        hinhvuong.nhapcanh();
        hinhvuong.tinhchuvi();
        hinhvuong.tinhdientich();
        hinhvuong.inchuvi();
        hinhvuong.indientich();

    }

}

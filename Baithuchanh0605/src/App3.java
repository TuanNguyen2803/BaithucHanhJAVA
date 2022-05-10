import java.util.ArrayList;
import java.util.ListIterator;

public class App3 {
    public static void main(String[] args) throws Exception {
        //khai bao 1 ArrList co ten la arrListChar
        //co kieu la Character
        ArrayList<Character> arrListChar=new ArrayList<>();
            arrListChar.add('a');
         arrListChar.add('e');
         arrListChar.add('b');
         arrListChar.add('c');
         //khai bao mot ListInterator co kieu la Charactor
         ListIterator<Character> listIterator=arrListChar.listIterator();
         //hienthi cac phan tu co trong arrListChar
         //bang cach su dung ListIterator
         System.out.println("Cac phan tu co trong arrListChar la:");
         while(listIterator.hasNext()){
             System.out.print(listIterator.next()+"\t");
         }
        }
}

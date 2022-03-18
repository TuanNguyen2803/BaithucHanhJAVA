package Demo;
import java.util.Scanner;
public class Person {
    String PersonID;
    String PersonName;
    String Address;
    Boolean Gender;
    Scanner sc = new Scanner(System.in);
public void nhapthongtin(){
  System.out.print("nhap ID:");
  PersonID=sc.nextLine();
  System.out.print("nhap ho va ten:");
  PersonName=sc.nextLine();
  System.out.print("nhap dia chi:");
  Address=sc.nextLine();
  System.out.print("nhap gioi tinh:");
  Gender=sc.nextLine();
}
public void inthongtin(){
  System.out.println("ID:"+PersonId);
  System.out.println("Ho va Ten:"+PersonName);
  System.out.println("Dia chi:"+Addrees);
  System.out.println("Gioi tinh:"+Gender);
}
}


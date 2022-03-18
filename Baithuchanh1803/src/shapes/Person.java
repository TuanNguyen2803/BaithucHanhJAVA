
package shapes;
import java.util.Scanner;
public class Person {
    String PersonID;
    String PersonName;
    Boolean Gender;
    String Address;
    Scanner sc = new Scanner(System.in);
    public void nhapPersonID() {
        System.out.print("Nhap PersonID: ");
        PersonID = sc.nextLine();
    }
    public void nhapPersonName() {
        System.out.print("Nhap PersonName: ");
        PersonName = sc.nextLine();
    }
    public void nhapGender() {
        System.out.print("Nhap Gender: ");
        Gender = sc.hasNext();
    }
    public void nhapAddress() {
        System.out.print("Nhap Address: ");
        Address = sc.nextLine();
    }
    public void inPersonID(){
        System.out.println("PersonID : " + PersonID);
    }
    public void inPersonName(){
        System.out.println("PersonName : " + PersonName);
    }
    public void inGender(){
        System.out.println("Gender : " + Gender);
    }
    public void inAddress(){
        System.out.println("Address: " + Address);
    }
  }
package kiemtrgiuaky;
import java.util.Scanner;
public class Nguoi {
    private String hoTen;
    private String diaChi;
    Scanner n = new Scanner(System.in);

   public Nguoi (){
       setHoTen();
       setDiaChi();
   }
    public void setHoTen() {
       System.out.println("nhap vao ten nguoi: ");
       hoTen = n.nextLine();
    }
    public void setDiaChi() {
        System.out.println("nhap dia chi: ");
        diaChi = n.nextLine();
    }
   
    @Override
    public String toString() {
       return hoTen+" "+diaChi;
    }
}
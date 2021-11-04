package kiemtrgiuaky;
import java.util.ArrayList;
public class DanhSachQuanLy {
    private ArrayList<Object> list = new ArrayList<>();
   public void themNguoi(Object object){
       list.add(object);
   }
   public void inDanhSach(){
       for (Object obj: list){
           System.out.println(obj.toString());
       }
   }
}
    
}

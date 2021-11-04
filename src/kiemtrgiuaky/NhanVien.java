package kiemtrgiuaky;

public class NhanVien extends nguoi{
    private float heSoLuong;

    public NhanVien (){
        super();
        setHeSoLuong();
    }

    protected float tinhLuong(){
        return heSoLuong*1500000;
    }

    public void setHeSoLuong() {
        do{
            System.out.println("nhap  he so luong: ");
            heSoLuong = n.nextFloat();
        }while(heSoLuong <0 && heSoLuong > 10);
    }
   
    @Override
    public String toString() {
        return super.toString() + tinhLuong();
    }
}
package kiemtrgiuaky;

public class HocVien extends nguoi {
        private float diemMonhoc1 ;
        private float diemMonhoc2;
        
        public HocVien (){
            super();
            setDiemMonhoc1();
            setDiemMonhoc2();
        }
        public void setDiemMonhoc1 (){
            do {
                System.out.println("nhap diem mon 1 : ");
                diemMonhoc1= n.nextFloat();
            }while (diemMonhoc1 < 0 && diemMonhoc1 > 10);
        }
    
        public void setDiemMonhoc2 (){
            do {
                System.out.println("nhap diem mon 2 : ");
                diemMonhoc2= n.nextFloat();
            }while (diemMonhoc2 < 0 && diemMonhoc1 > 10);
        }
    
       
    
        protected float diemTB(){
             return (diemMonhoc1 + diemMonhoc2)/2;
        }
        @Override
        public String toString() {
            return super.toString() + diemTB();
        }
    }

    
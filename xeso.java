package KhoPhungTungXeMay;
import java.util.Objects;
public class xeso extends PTxe{
    xeso(String Kind, String Brand, Double Price, String InPutDay, String OutPutDay , String maPT){
        super();
        this.Kind = Kind;
        this.Brand =Brand;
        this.Price = Price;
        this.InPutDay = InPutDay;
        this.OutPutDay = OutPutDay;
        this.maPT = maPT;
    }
    public xeso (String maPt) {
        this.maPT = maPt;
    }
    @Override
    public void RangeOfVehicle(){
        System.out.println("\nDanh cho xe so");
    }

    @Override
    public String toString(){
        return "------INFO.PT.XESO-----\nPhu tung "+Kind+" danh cho xe "+Brand+"\nNgay nhap kho:"+InPutDay+"\nNgay xuat kho:"+OutPutDay+"\nGia: "+Price +"\nMa phu tung: "+maPT;
    }

    public int hashCode() {
        return Objects.hash(Kind , Brand , Price , InPutDay , OutPutDay , maPT);
    }
    
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        xeso other = (xeso) obj;
        return Objects.equals(maPT, other.maPT);
    }
}
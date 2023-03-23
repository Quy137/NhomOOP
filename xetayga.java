package KhoPhungTungXeMay;
import java.util.Objects;
public class xetayga extends PTxe{
    xetayga(String Kind, String Brand, Double Price, String InPutDay, String OutPutDay, String maPT){
        super();
        this.Kind = Kind;
        this.Brand =Brand;
        this.Price = Price;
        this.InPutDay = InPutDay;
        this.OutPutDay = OutPutDay;
        this.maPT = maPT;
    }
    public xetayga (String maPT) {
        this.maPT = maPT;
    }
    @Override
    public void RangeOfVehicle(){
        System.out.println("\nDanh cho xe tay ga");
    }

    @Override
    public String toString(){
        return "------INFO.PT.XETAYGA-----\nPhu tung "+Kind+" danh cho xe "+Brand+"\nNgay nhap kho:"+InPutDay+"\nNgay xuat kho:"+OutPutDay+"\nGia: "+Price+"\nMa phu tung: "+maPT;
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
        xetayga other = (xetayga) obj;
        return Objects.equals(maPT, other.maPT);
    }
}
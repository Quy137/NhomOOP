package KhoPhungTungXeMay;

import java.util.Objects;

public class xecontay extends PTxe implements Comparable<xecontay>{
    
    public xecontay(){}
    public xecontay(String maPT) {
        this.maPT = maPT;
    }
    public xecontay(String Kind, String Brand, Double Price, String InPutDay, String OutPutDay, String maPT){
        super();
        this.Kind = Kind;
        this.Brand =Brand;
        this.Price = Price;
        this.InPutDay = InPutDay;
        this.OutPutDay = OutPutDay;
        this.maPT = maPT;
    }
    @Override
    public void RangeOfVehicle(){
        System.out.println("\nDanh cho xe con tay");
    }
    
    @Override
    public String toString(){
        return "------INFO.PT.XECONTAY-----\nPhu tung "+Kind+" danh cho xe "+Brand+"\nNgay nhap kho:"+InPutDay+"\nNgay xuat kho:"+OutPutDay+"\nGia: "+Price+"\nMa phu tung: "+maPT;
    }
    @Override
    public int compareTo(xecontay o) {
        return this.Kind.compareTo(o.maPT);
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
        xecontay other = (xecontay) obj;
        return Objects.equals(maPT, other.maPT);
    }
}
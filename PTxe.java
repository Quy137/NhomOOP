package KhoPhungTungXeMay;

public class PTxe {
    protected String Kind;
    protected String Code;
    protected String Brand;
    protected double Price;
    protected String InPutDay;
    protected String OutPutDay;
    protected String maPT;

    
    public PTxe(String kind, String code, String brand, double price, String inPutDay, String outPutDay, String maPT) {
        this.Kind = kind;
        this.Code = code;
        this.Brand = brand;
        this.Price= price;
        this.InPutDay = inPutDay;
        this.OutPutDay = outPutDay;
        this.maPT = maPT;
    }
    public String getMaPT() {
        return maPT;
    }
    public void setMaPT(String maPT) {
        this.maPT = maPT;
    }
    // contructor
    public PTxe(){}
    
    // getMethod
    public String getKind(){
        return this.Kind;
    }
    public String getBrand(){
        return this.Brand;
    }
    public double getPrice(){
        return this.Price;
    }
    // setMethod
    public void setKind(String kind){
        this.Kind = kind;
    }
    public void setBrand(String brand){
        this.Brand = brand;
    }
    public void setPrice(Double price){
        this.Price = price;
    }
    public void RangeOfVehicle(){
        System.out.println("dong xe");
    }

    public void inputDay(String inday){
        this.InPutDay = inday;
    }
    public void outputDay(String outday){
        this.OutPutDay = outday;
    }
    
    public String inputDay(){
        return this.InPutDay;
    }
    public String outputDay(){
        return this.OutPutDay;
    }
    // toString
    public String toString(){
        return Kind+Brand+Price+InPutDay+OutPutDay;
    }


}

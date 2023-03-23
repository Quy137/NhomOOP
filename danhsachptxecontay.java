package KhoPhungTungXeMay;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// import javax.lang.model.util.ElementScanner14;

public class danhsachptxecontay  {
    public ArrayList<xecontay> listPTxecontay;

    public danhsachptxecontay(){
        this.listPTxecontay = new ArrayList<xecontay>();
    }
    public danhsachptxecontay(ArrayList<xecontay> listPTxecontay){
        this.listPTxecontay = listPTxecontay;
    }
    public void addPT(xecontay xct){
        this.listPTxecontay.add(xct);
    }
    // xuat thong tin
    public void xuatthongtin(){
        for(xecontay xecontay : listPTxecontay){
            System.out.println(xecontay);
        }
    }
    // xóa thông tin 1 phụ tùng
    public boolean xoaThongTin(xecontay xecontay) {
        return this.listPTxecontay.remove(xecontay);
    }
    // sắp xếp danh sách phụ tùng từ cao đến thấp
    public void sapXepTheoPtGiamDan() {
        Collections.sort(this.listPTxecontay, new Comparator<xecontay>() {

            @Override
            public int compare(xecontay xect1, xecontay xect2) {
                if(xect1.getPrice() < xect2.getPrice()) {
                    return 1;
                } else if(xect1.getPrice() > xect2.getPrice()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });;
    }
}

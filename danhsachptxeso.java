package KhoPhungTungXeMay;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class danhsachptxeso {
    public ArrayList<xeso> listPTxeso;

    public danhsachptxeso(){
        this.listPTxeso = new ArrayList<xeso>();
    }
    public danhsachptxeso(ArrayList<xeso> listPTxeso){
        this.listPTxeso = listPTxeso;
    }
    public void addPT(xeso xct){
        this.listPTxeso.add(xct);
    }
    // xuat thong tin
    public void xuatthongtin(){
        for(xeso xeso : listPTxeso){
            System.out.println(xeso);
        }
    }
    // xóa thông tin 1 phụ tùng
    public boolean xoaThongTin(xeso xeso) {
        return this.listPTxeso.remove(xeso);
    }
    // sắp xếp danh sách phụ tùng từ cao đến thấp

    public void sapXepTheoPtGiamDan() {
        Collections.sort(this.listPTxeso, new Comparator<xeso>() {

            @Override
            public int compare(xeso xes1, xeso xes2) {
                if(xes1.getPrice() < xes2.getPrice()) {
                    return 1;
                } else if(xes1.getPrice() > xes2.getPrice()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });;
    }
}
package KhoPhungTungXeMay;

import java.lang.constant.DirectMethodHandleDesc.Kind;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        danhsachptxecontay dsxecontay = new danhsachptxecontay();
        danhsachptxeso dsxeso = new danhsachptxeso();
        danhsachptxetayga dsxetayga = new danhsachptxetayga();
        int a;
// chọn menu
        do{
        System.out.println("--------MENU------");
        System.out.println("Hay nhap vao con so tuong ung trong menu:");
        System.out.println("1: Them vao danh sach PT danh cho xe con tay."); 
        System.out.println("2: Them vao danh sach PT danh cho xe so.");      
        System.out.println("3: Them vao danh sach PT danh cho xe tay ga.");   
        System.out.println("4:Xuat thong tin phu tung xe con tay.");   
        System.out.println("5:Xuat thong tin phu tung xe so.");        
        System.out.println("6:Xuat thong tin phu tung xe tay ga.");
        System.out.println("7: Xoa thong tin cua 1 phu tung trong danh sach");
        System.out.println("8: So sanh gia theo chieu giam dan");               
        System.out.println("9: Thoat.");
// nhập lại menu
        do{
            a =input.nextInt();
            if(a<=0 || a>9){
                System.out.println("----------ERROR----------");
                System.out.println("Vui long chon trong khoang 1 toi 9!!!!!");
                System.out.println("Hay nhap vao con so tuong ung trong menu:");
                System.out.println("Hay nhap vao con so tuong ung trong menu:");
                System.out.println("1: Them vao danh sach PT danh cho xe con tay."); 
                System.out.println("2: Them vao danh sach PT danh cho xe so.");      
                System.out.println("3: Them vao danh sach PT danh cho xe tay ga.");   
                System.out.println("4:Xuat thong tin phu tung xe con tay.");   
                System.out.println("5:Xuat thong tin phu tung xe so.");        
                System.out.println("6:Xuat thong tin phu tung xe tay ga.");
                System.out.println("7: Xoa thong tin cua 1 phu tung trong danh sach");    
                System.out.println("8: So sanh gia theo chieu giam dan");         
                System.out.println("9: Thoat.");
            }
        }while(a<=0 || a>9);
// vào menu
        switch(a){
            case 1:{
                xecontay xecontay = new xecontay();
                System.out.println("Hay nhap vao loai phu tung: ");
                input.nextLine();
                String Kind = input.nextLine();
                System.out.println("Hay nhap vao hang san xuat: ");
                String Brand = input.nextLine();
                System.out.println("Hay nhap vao gia san pham: ");
                Double Price = input.nextDouble();
                System.out.println("Hay nhap vao ngay nhap kho: ");
                input.nextLine();
                String InPutDay = input.nextLine();
                System.out.println("Hay nhap vao ngay xuat kho: ");
                String OutPutDay = input.nextLine();
                System.out.println("Hay nhap vao ma phu tung (vd banh xe honda : BH1 ) : ");
                String maPT = input.nextLine();
                xecontay = new xecontay(Kind, Brand, Price, InPutDay, OutPutDay, maPT);
                dsxecontay.addPT(xecontay);
                break;
                }
                case 2:{
                    System.out.println("Hay nhap vao loai phu tung: ");
                    input.nextLine();
                    String Kind = input.nextLine();
                    System.out.println("Hay nhap vao hang san xuat: ");
                    String Brand = input.nextLine();
                    System.out.println("Hay nhap vao gia san pham: ");
                    Double Price = input.nextDouble();
                    System.out.println("Hay nhap vao ngay nhap kho: ");
                    input.nextLine();
                    String InPutDay = input.nextLine();
                    System.out.println("Hay nhap vao ngay xuat kho: ");
                    String OutPutDay = input.nextLine();
                    System.out.println("Hay nhap vao ma phu tung (vd banh xe honda : BH1  : ");
                    String maPT = input.nextLine();
                    xeso xeso = new xeso(Kind, Brand, Price, InPutDay, OutPutDay , maPT);
                    dsxeso.addPT(xeso);
                    break;
                }
                
                case 3:{
                    System.out.println("Hay nhap vao loai phu tung: ");
                    input.nextLine();
                    String Kind = input.nextLine();
                    System.out.println("Hay nhap vao hang san xuat: ");
                    String Brand = input.nextLine();
                    System.out.println("Hay nhap vao gia san pham: ");
                    Double Price = input.nextDouble();
                    System.out.println("Hay nhap vao ngay nhap kho: ");
                    input.nextLine();
                    String InPutDay = input.nextLine();
                    System.out.println("Hay nhap vao ngay xuat kho: ");
                    String OutPutDay = input.nextLine();
                    System.out.println("Hay nhap vao ma phu tung (vd banh xe honda : BH1 ) : ");
                    String maPT = input.nextLine();
                    xetayga xetayga = new xetayga(Kind, Brand, Price, InPutDay, OutPutDay, maPT);
                    dsxetayga.addPT(xetayga);
                    break;
                }
                case 4:{
                    dsxecontay.xuatthongtin();
                    break;
                }
                case 5:{
                    dsxeso.xuatthongtin();
                    break;
                }
                case 6:{
                    dsxetayga.xuatthongtin();
                    break;
                }
                case 7:{
                    System.out.println("1: Xoa thong tin trong danh sach xe con tay");
                    System.out.println("2: Xoa thong tin trong danh sach xe so");
                    System.out.println("3: Xoa thong tin trong danh sach xe tay ga");
                    int x = input.nextInt();
                    input.nextLine();
                    switch(x) {
                        case 1:{
                            System.out.println("Nhap ma phu trung cua xe con tay ");
                            String maPT = input.nextLine();
                            xecontay xecontay = new xecontay(maPT);
                            System.out.println("Xoa thong tin phu tung : " + dsxecontay.xoaThongTin(xecontay));
                            break;
                        }
                        case 2:{
                            System.out.println("Nhap ma phu trung cua xe so ");
                            String maPT = input.nextLine();
                            xeso xeso = new xeso(maPT);
                            System.out.println("Xoa thong tin phu tung : " + dsxeso.xoaThongTin(xeso));
                            break;
                        }
                        case 3:{
                            System.out.println("Nhap ma phu trung cua xe tay ga ");
                            String maPT = input.nextLine();
                            xetayga xetayga = new xetayga(maPT);
                            System.out.println("Xoa thong tin phu tung : " + dsxetayga.xoaThongTin(xetayga));
                            break;
                        }
                    }
                    break;
                }
                case 8:{
                    int x;
                    System.out.println("1: Danh sach phu tung xe con tay giam dan");
                    System.out.println("2: Danh sach phu tung xe so giam dan");
                    System.out.println("3: Danh sach phu tung xe tay ga giam dan");
                    do{
                        x = input.nextInt();
                        if(x<=0 || x>3){
                            System.out.println("----------ERROR----------");
                            System.out.println("Vui long chon trong khoang 1 toi 3!!!!!");
                            System.out.println("1: Danh sach phu tung xe con tay giam dan");
                            System.out.println("2: Danh sach phu tung xe so giam dan");
                            System.out.println("3: Danh sach phu tung xe tay ga giam dan");
                        }
                    }while(x<=0 || x>3);
                    switch(x) {
                        case 1:{
                            dsxecontay.sapXepTheoPtGiamDan();
                            dsxecontay.xuatthongtin();
                            break;
                        }
                        case 2:{
                            dsxeso.sapXepTheoPtGiamDan();
                            dsxeso.xuatthongtin();
                            break;
                        }
                        case 3:{
                            dsxetayga.sapXepTheoPtGiamDan();
                            dsxetayga.xuatthongtin();
                            break;
                        }
                    }
                }
                
                
                
                
                
                
                
                
                
                
            
        }
    }while(a != 9);
                //     case 1:{
                    //         PTxe = new xecontay();
                    //         System.out.println("Ban dang tim SP cho xe con tay!!!");
                    //         System.out.println("Hay nhap vao 1 trong nhung hang sau: ");
                    //         System.out.println("1.HONDA");
                    //         System.out.println("2.YAMAHA");
                    //         System.out.println("3.SUZUKI");
                    //         System.out.println("4.DUCATI");
                    //         int Brand;
                    //         do{
                        //             Brand = input.nextInt();
                        //             if(Brand <= 0 || Brand > 4){
                            //                 System.out.println("Chung toi khong co SP cua hang san xuat nay!!!\nVui long nhap lai!!!");
                            //                 System.out.println("1.HONDA");
                            //                 System.out.println("2.YAMAHA");
                            //                 System.out.println("3.SUZUKI");
                            //                 System.out.println("4.DUCATI");
                            //             }else{
                                //                 switch(Brand){
                                    //                     case 1:{PTxe.setBrand("HONDA");break;}
                                    //                     case 2:{PTxe.setBrand("YAMAHA");break;}
                                    //                     case 3:{PTxe.setBrand("SUZUKI");break;}
                                    //                     case 4:{PTxe.setBrand("DUCATI");break;}
                                    //                 }
                                    //             }
                                    //         }while(Brand <= 0 || Brand > 4);
                                    
                                    //         System.out.println("Hay nhap vao SP ban muon tim: ");
                                    //         PTxe.setKind(input.nextLine());
                                    //         PTxe.setKind(input.nextLine());
                                    //         System.out.println("Hay nhap vao gia san pham: ");
                                    //         PTxe.setPrice(input.nextDouble());
                                    //         System.out.println("-------INFO--------");
                                    //         System.out.print(PTxe.toString());
                                    //         String b[] = PTxe.getKind().split(" ");
        //             for (String s : b){
        //                  System.out.print(s.charAt(0));
        //             }    
        //         PTxe.RangeOfVehicle();
        //         PTxe.inputDay();
        //         PTxe.outputDay();
        //         PTxe.employee();
        //         break;
        //     }
        //     case 2:{
            //         PTxe = new xeso();
            //         System.out.println("Ban dang tim SP cho xe so!!!");
            //         System.out.println("Hay nhap vao 1 trong nhung hang sau: ");
        //         System.out.println("1.HONDA");
        //         System.out.println("2.YAMAHA");
        //         System.out.println("3.SUZUKI");
        //         System.out.println("4.SYM");
        //         int Brand;
        //         do{
            //             Brand = input.nextInt();
            //             if(Brand <= 0 || Brand > 4){
                //                 System.out.println("Chung toi khong co SP cua hang san xuat nay!!!\nVui long nhap lai!!!");
                //                 System.out.println("1.HONDA");
                //                 System.out.println("2.YAMAHA");
                //                 System.out.println("3.SUZUKI");
                //                 System.out.println("4.SYM");
                //             }else{
                    //                 switch(Brand){
        //                     case 1:{PTxe.setBrand("HONDA");break;}
        //                     case 2:{PTxe.setBrand("YAMAHA");break;}
        //                     case 3:{PTxe.setBrand("SUZUKI");break;}
        //                     case 4:{PTxe.setBrand("SYM");break;}
        //                 }
        //             }
        //         }while(Brand <= 0 || Brand > 4);
        
        //         System.out.println("Hay nhap vao SP ban muon tim: ");
        //         PTxe.setKind(input.nextLine());
        //         PTxe.setKind(input.nextLine());
        //         System.out.println("Hay nhap vao gia san pham: ");
        //         PTxe.setPrice(input.nextDouble());
        //         System.out.println("-------INFO--------");
        //         System.out.print(PTxe.toString());
        //         String b[] = PTxe.getKind().split(" ");
        //             for (String s : b){
        //                  System.out.print(s.charAt(0));
        //             }    
        //         PTxe.RangeOfVehicle();
        //         PTxe.inputDay();
        //         PTxe.outputDay();
        //         PTxe.employee();
        //         break;
        //     }
        //     case 3:{
            //         PTxe = new xetayga();
            //         System.out.println("Ban dang tim SP cho xe tay ga!!!");
            //         System.out.println("Hay nhap vao 1 trong nhung hang sau: ");
            //         System.out.println("1.HONDA");
            //         System.out.println("2.YAMAHA");
            //         System.out.println("3.SYM");
            //         System.out.println("4.PIAGO");
            //         int Brand;
            //         do{
                //             Brand = input.nextInt();
                //             if(Brand <= 0 || Brand > 4){
        //                 System.out.println("Chung toi khong co SP cua hang san xuat nay!!!\nVui long nhap lai!!!");
        //                 System.out.println("1.HONDA");
        //                 System.out.println("2.YAMAHA");
        //                 System.out.println("3.SYM");
        //                 System.out.println("4.PIAGO");
        //             }else{
            //                 switch(Brand){
                //                     case 1:{PTxe.setBrand("HONDA");break;}
                //                     case 2:{PTxe.setBrand("YAMAHA");break;}
                //                     case 3:{PTxe.setBrand("SYM");break;}
                //                     case 4:{PTxe.setBrand("PIAGO");break;}
                //                 }
                //             }
                //         }while(Brand <= 0 || Brand > 4);

        //         System.out.println("Hay nhap vao SP ban muon tim: ");
        //         PTxe.setKind(input.nextLine());
        //         PTxe.setKind(input.nextLine());
        //         System.out.println("Hay nhap vao gia san pham: ");
        //         PTxe.setPrice(input.nextDouble());
        //         System.out.println("-------INFO--------");
        //         System.out.print(PTxe.toString());
        //         String b[] = PTxe.getKind().split(" ");
        //             for (String s : b){
            //                  System.out.print(s.charAt(0));
            //             }    
            //         PTxe.RangeOfVehicle();
            //         PTxe.inputDay();
            //         PTxe.outputDay();
            //         PTxe.employee();
        //         break;
        //     }
        //     case 4:{
        //         break;
        //     }
    input.close();
}
}

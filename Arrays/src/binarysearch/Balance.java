//package binarysearch;
//
//import java.util.*;
//abstract class FundTransfer {
//    String accountNumber;
//    double balance;
//    double transfer;
//    Scanner s=new Scanner(System.in);
//    void get() {
//        accountNumber=s.next();
//        balance=s.nextDouble();
//        transfer=s.nextDouble();
//    }
//
//    boolean validate(double transfer) {
//        if(accountNumber.length()==10 && (transfer>0 && transfer<balance))
//            return true;
//        else
//            return false;
//    }
//    abstract boolean transfer(double transfer);
//}
//
//class NEFTTransfer extends FundTransfer {
//    boolean transfer(double transfer) {
//        if(transfer+(0.02*transfer)<balance)
//            return true;
//        else
//            return false;
//
//    }
//}
//
//class IMSPSTransfer extends FundTransfer {
//    boolean transfer(double transfer) {
//        if(transfer>10000)
//            return true;
//        else
//            return false;
//    }
//
//}
//
//class RTGSTransfer extends FundTransfer {
//    boolean transfer(double transfer) {
//        if(transfer+(0.05*transfer)<balance)
//            return true;
//        else
//            return false;
//    }
//}
//
//public class Balance {
//    public static void main(String[] args) {
//        Scanner s3=new Scanner(System.in);
//        int s4=s3.nextInt();
//        switch(s4) {
//            case 1:
//                NEFTTransfer t=new NEFTTransfer ();
//                t.get();
//
//                if(t.validate(t.transfer)) {
//                    boolean t3=t.transfer(t.transfer);
//                    if(t3==true) {
//                        System.out.println("Transfer occured successful:");
//                        double remain=balance-(transfer+(0.02*transfer));
//                        System.out.println(remain);
//                    }
//                }
//                System.out.println("Transfer unsuccessful");
//                break;
//            case 2:
//                IMSPSTransfer it = new IMPSTransfer ();
//                it.get();
//                if(it.validate(transfer))
//                {
//                    boolean it3=it.transfer(transfer);
//                    if(it3==true)
//                        System.out.println("Transfer occured successful:");
//                    double remain1 = balance - transfer;
//                    System.out.println(remain1);
//                }
//                System.out.println("Transfer unsuccessful");
//                break;
//            case 3:
//                RTGSTransfer rt=new RTGsTransfer ();
//                rt.get();
//
//                if(it.validate(transfer))
//                {
//                    boolean rt3=rt.transfer(transfer);
//                    if(rt3==true)
//                        System.out.println("Transfer occured successful:");
//                    double remain2=balance-(transfer+(0.05*transfer));
//                    System.out.println(remain2);
//                }
//                System.out.println("Transfer unsuccessful");
//                break;
//            default:
//                System.out.println("-1");
//        }
//    }
//}

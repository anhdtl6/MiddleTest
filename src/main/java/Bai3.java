import java.util.InputMismatchException;
import java.util.Scanner;

public class Bai3 {
    void songuyenduong() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn hãy nhập số nguyên dương");
        int n = sc.nextInt();

                if (n <= 12 && n > 0) {
                    monthSwitch(n);
                } else {
                    System.out.println("Đây không phải là một tháng trong năm, hãy nhập từ 1-12 bạn nhé");
                }
    }
    void monthSwitch(int month){
        switch(month)
        {
            case 1:
                System.out.println("Tháng này có 31 ngày bạn nhé");
                break;
            case 2:
                System.out.println("Tháng này có 28 hoặc 29 ngày bạn nhé");
                break;
            case 3:
                System.out.println("Tháng này có 31 ngày bạn nhé");
                break;
            case 4:
                System.out.println("Tháng này có 30 ngày bạn nhé");
                break;
            case 5:
                System.out.println("Tháng này có 31 ngày bạn nhé");
                break;
            case 6:
                System.out.println("Tháng này có 30 ngày bạn nhé");
                break;
            case 7:
                System.out.println("Tháng này có 31 ngày bạn nhé");
                break;
            case 8:
                System.out.println("Tháng này có 31 ngày bạn nhé");
                break;
            case 9:
                System.out.println("Tháng này có 30 ngày bạn nhé");
                break;
            case 10:
                System.out.println("Tháng này có 31 ngày bạn nhé");
                break;
            case 11:
                System.out.println("Tháng này có 30 ngày bạn nhé");
                break;
            case 12:
                System.out.println("Tháng này có 31 ngày bạn nhé");
                break;
//            default:
//                System.out.println("Tháng này không hợp lệ");
//                break;
        }
    }
}

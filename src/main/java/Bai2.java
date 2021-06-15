import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai2 {
    public void inputPass()
    {
        String correctPass="^(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Z\\d@$!%*?&]{10,}$";
        Scanner sc= new Scanner(System.in);
        System.out.println("Bạn hãy nhập mật khẩu");
        String str= sc.nextLine();
            if (str.length() < 10) {
                System.out.println("Mật khẩu yếu");
            }
            else {
                if(str.matches(correctPass))
                {
                    System.out.println("Mật khẩu mạnh");
                }
                else System.out.println("Mật khẩu chưa đủ mạnh");
        }

    }
}

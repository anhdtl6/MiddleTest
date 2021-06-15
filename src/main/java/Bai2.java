import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai2 {
    public void inputPass()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Bạn hãy nhập mật khẩu của bạn");
        String str= sc.nextLine();
        if(str.length()>=10) {
            System.out.println("Mật khẩu đúng định dạng");
            validatePass(str);
        }
        else {
            if (str.length() < 10) {
                System.out.println("Mật khẩu yếu");
            }
        }

    }
    public boolean validatePass(String pass)
    {
        CharSequence inputStr = pass;
        String correctPass="^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{10,}$";
        Pattern pattern=Pattern.compile(correctPass,Pattern.CASE_INSENSITIVE);
        Matcher matcher= pattern.matcher(inputStr);
        if(matcher.matches())
            return true;
        else
            return false;
    }
}

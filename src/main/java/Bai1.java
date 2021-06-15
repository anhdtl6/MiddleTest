public class Bai1 {
    String str= "You Only Live Once. But if You do it right. once is Enough";
    void count()
    {
        int count =0;
        for(int i =0; i<str.length();i++)
        {
            if(str.charAt(i)>='A'&&str.charAt(i)<='Z')
            {
                count++;
            }
        }
        System.out.println("Số từ in hoa trong chuỗi là: "+ count);
    }
    void UpperCase()
    {
        char[] charArray= str.toCharArray();
        boolean space= true;
        for(int i=0; i<charArray.length; i++)
        {
            if(Character.isLetter(charArray[i]))
            {
                if(space)
                {
                    charArray[i]= Character.toUpperCase(charArray[i]);
                    space=false;
                }
            }
            else {
                space=true;
            }
        }
        System.out.println("Chuỗi ban đầu là: "+str);
        str= String.valueOf(charArray);
        System.out.println("Chuỗi sau khi in hoa chữ cái đầu là: "+str);
    }
}

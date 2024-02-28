import java.util.*;
class RightMostSetBit {
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter  a number:");
      String str=s.nextLine();
      int position=findPosition(str);
      System.out.println(position);
    }
    static int findPosition(String str)
    { int m=1;
     int key=0;
        for(int i=str.length()-1;i>=0;i--)
        {
            int a=(int) str.charAt(i);
            if((m&a)==0)
            {
                m<<1;
                key++;
            }
            else{
                break;
            }
        }
        return key;
    }
}

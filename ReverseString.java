import java.util.Arrays;

public class ReverseString {
    public void reverseString(char[] s) {
        System.out.println(Arrays.toString(s));
        int mid = s.length /2;
        int i = 0;
        int j = s.length - 1;
       if(s.length % 2 == 0){
           while (i < mid + 1 && j > mid - 1){
               char temp = s[i];
               s[i] = s[j];
               s[j] = temp;
               i++;
               j--;
           }
       } else {
           while (i < mid && j > mid){
               char temp = s[i];
               s[i] = s[j];
               s[j] = temp;
               i++;
               j--;
           }
       }
        System.out.println(Arrays.toString(s));
    }

    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        char[] w ={'A',' ','m','a','n',',',' ','a',' ','p','l','a','n',',',' ','a',' ','c','a','n','a','l',':',' ','P','a','n','a','m','a'};
        char[] s ={'a', 'p', 'p', 'l', 'e', 's'};
        rs.reverseString(s);
    }
}

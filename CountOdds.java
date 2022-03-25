import java.net.CookiePolicy;

public class CountOdds {
    public int countOdds(int low, int high) {
        int count = 0;
        for(int i = low; i <= high; i++){
            if(i % 2 != 0) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        CountOdds co = new CountOdds();
        System.out.println(co.countOdds(8, 10));
    }
}

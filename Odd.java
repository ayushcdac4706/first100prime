package q3;

public class Odd {
    public static void main(String[] args) {
        int n = 1;
        int cnt=0;
        while (cnt <= 100) {
            if (n % 2 != 0) {
                cnt++;
                System.out.println(n);
            }
            n++;
        }
    }
    
}


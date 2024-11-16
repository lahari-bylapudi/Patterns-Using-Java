import java.util.*;
public class Pattern18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            for(int ch = 'E'- i; ch <= 'E'; ch++){
                System.out.print((char)ch + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

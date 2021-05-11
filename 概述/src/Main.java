import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        if(n < 0) {
            System.out.println("输入的数据有错误");
        } else {
            for (int i = 0; i < n; i++) {
                sum += i;
            }
            System.out.println(sum);
        }
    }
}
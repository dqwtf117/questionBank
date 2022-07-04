package 华为OD;

import java.util.Scanner;

/**
已知连续正整数数列{K}=K1,K2,K3…Ki的各个数相加之和为S，i=N (0<S<100000, 0<N<100000), 求此数列K。
输入描述:
输入包含两个参数，1）连续正整数数列和S，2）数列里数的个数N。
输出描述:
如果有解输出数列K，如果无解输出-1
示例1
输入
525 6
输出
85 86 87 88 89 90
示例2
输入
3 5
输出
-1
————————————————
版权声明：本文为CSDN博主「旧梦昂志」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/csfun1/article/details/124528902
 */
public class 求解连续数列 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = in.nextInt();
        int n = in.nextInt();
        // sum(x x+1 x+2 ... x+n-1) = sum
        // n*x + n*(n-1)/2 = sum
        // x= [sum - n*(n-1)/2 ]/n
        int temp = sum - n*(n-1)/2;
        if (temp <=0 || temp%n!=0){
            System.out.println(-1);
            return;
        }
        int begin = temp/n;
        for (int i = 0; i < n; i++) {
            System.out.print(begin+i);
            System.out.print(' ');
        }
    }
}

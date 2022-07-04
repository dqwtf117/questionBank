package 华为OD.check;

import java.util.Scanner;

/**
 * 公司用一个字符串来表示员工的出勤信息：
 * absent：缺勤
 * late：迟到
 * leaveearly：早退
 * present：正常上班
 * 现需根据员工出勤信息，判断本次是否能获得出勤奖，能获得出勤奖的条件如下：
 * 缺勤不超过一次；没有连续的迟到/早退；任意连续7次考勤，缺勤/迟到/早退不超过3次
 * 输入描述:
 * 用户的考勤数据字符串，记录条数 >= 1；输入字符串长度<10000；不存在非法输入
 * 如：
 * 2
 * present
 * present absent present present leaveearly present absent
 * 输出描述:
 * 根据考勤数据字符串，如果能得到考勤奖，输出"true"；否则输出"false"，对于输入示例的结果应为：
 * true false
 * 示例1：
 * 输入
 * 2
 * present
 * present present
 * 输出
 * true true
 * 示例2：
 * 输入
 * 2
 * present
 * present absent present present leaveearly present absent
 * 输出
 * true false
 * ————————————————
 * 版权声明：本文为CSDN博主「旧梦昂志」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
 * 原文链接：https://blog.csdn.net/csfun1/article/details/124509176
 */
public class 考勤信息 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        String[] arr = new String[count];
        for (int i = 0; i < count; i++) {
            arr[i] = in.nextLine();
        }

    }
    private static boolean check(String[] arr ,int index){
        int count = 0;
        int start =index<7?0:(index-6);
        for (int i = start; i <=index ; i++) {
            String status = arr[i];
            if ("absent".equals(status)|| "late".equals(status)||"leaveearly".equals(status)){
                count++;
            }
        }
        return count<=3;
    }
}

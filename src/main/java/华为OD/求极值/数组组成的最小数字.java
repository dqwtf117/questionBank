package 华为OD.求极值;

/**
 * 给定一个整型数组，请从该数组中选择3个元素组成最小数字并输出（如果数组长度小于3，则选择数组中所有元素来组成最小数字）。
 * 输入描述:
 * 一行用半角逗号分割的字符串记录的整型数组，0 < 数组长度 <= 100，0 < 整数的取值范围 <= 10000。
 * 输出描述:
 * 由3个元素组成的最小数字，如果数组长度小于3，则选择数组中所有元素来组成最小数字。
 * 示例1
 * 输入
 * 21,30,62,5,31
 * 输出
 * 21305
 * 说明
 * 数组长度超过3，需要选3个元素组成最小数字，21305由21,30,5三个元素组成的数字，为所有组合中最小的数字
 * 示例2
 * 输入
 * 5,21
 * 输出
 * 215
 * 说明
 * 数组长度小于3， 选择所有元素来主城最小值，215为最小值。
 * ————————————————
 * 版权声明：本文为CSDN博主「旧梦昂志」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
 * 原文链接：https://blog.csdn.net/csfun1/article/details/124544351
 */
//思路：
//1、大于3各数的数组，从其中选择3各最小的数，组合排序可以得到最小的数
//2、小于3各数，组合排序即可
//3、可以根据首位进行排序
public class 数组组成的最小数字 {
}

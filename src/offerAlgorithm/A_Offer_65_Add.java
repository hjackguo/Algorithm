package offerAlgorithm;
/**
 写一个函数，求两个整数之和，要求在函数体内不得使用 “+”、“-”、“*”、“/” 四则运算符号。

  

 示例:

 输入: a = 1, b = 1
 输出: 2
  

 提示：

 a, b 均可能是负数或 0
 结果不会溢出 32 位整数
 */

public class A_Offer_65_Add {
    /**
     b记录进位   (a&b)<<1
     a记录非进位和  a^b
     */
    public int add(int a,int b){
        while (b!=0){
            int c = (a&b)<<1; //进位
            a = a^b; // 非进位和
            b = c;
        }
        return a;
    }
}
package com.example.demo.leetcode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
 * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
 * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
 *
 * 1,枚举这几个4，9，40，90，400，900
 * 其他都做除法看倍数switch吧
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/integer-to-roman
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Leetcode12 {

    public String intToRoman(int num) {
        StringBuffer stringBuffer = new StringBuffer();
        Map<Integer,String> map = new LinkedHashMap<Integer, String>(){
            {
                put(1000,"M");
                put(900,"CM");
                put(500,"D");
                put(400,"CD");
                put(100,"C");
                put(90,"XC");
                put(50,"L");
                put(40,"XL");
                put(10,"X");
                put(9,"IX");
                put(5,"V");
                put(4,"IV");
                put(1,"I");
            }
        };
        Set<Integer> integers = map.keySet();
        for (Integer i:
                integers) {
            int t = num / i;
            while (t>0){
                num = num - i ;
                stringBuffer.append(map.get(i));
                t--;
            }

        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Long g = 3L;
        System.out.println(c.equals(d));
        System.out.println(e.equals( f));
        System.out.println(c == (a + b));
        System.out.println(c.equals(a + b));
        System.out.println(g == (a + b));
        System.out.println(g.equals(a + b));

    }
}

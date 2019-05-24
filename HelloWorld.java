import java.util.ArrayList;
import java.io.*;
class FreshJuice {
    static  int Num;
    enum FreshJuiceSize{ SMALL, MEDIUM , LARGE }
    FreshJuiceSize size;
}
public class HelloWorld {
    /**
     *
     * @param args
     */
    public static void main(String[] args) throws IOException {
        String strOrig = "Hello world ,Hello Runoob";

        System.out.println(new StringBuffer(strOrig).reverse().toString());

       int a='A';
        System.out.println(a);
        FreshJuice juice = new FreshJuice();
        FreshJuice juice2 = new FreshJuice();
        juice.Num=2;
        juice2.Num=3;
        System.out.println(juice.Num);
        juice.size = FreshJuice.FreshJuiceSize.MEDIUM  ;
        System.out.println(juice.size);
    }
    public String judgeType(Object temp) {
        if (temp instanceof Byte) {
            return "是Byte类型";
        } else if (temp instanceof Integer) {
            return "是Integer类型";
        } else {
            return "是其他类型";
        }
    }
}
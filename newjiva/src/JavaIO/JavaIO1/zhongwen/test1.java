package JavaIO.JavaIO1.zhongwen;

import java.io.UnsupportedEncodingException;

//以字符 中 为例，查看其在不同编码方式下的值是多少
//也即在不同的棋盘上的位置
public class test1 {
    public static void main(String[] args) {
        String str = "中";
        showCode(str);
    }

    private static void showCode(String str) {
        String[] encodes = {"BIG5", "GBK", "GB2312", "UTF-8"};
        for (String encode : encodes) {
            showCode1(str, encode);
        }
    }

    private static void showCode1(String str, String encode) {
        try {
            System.out.printf("字符：\"%s\"的在编码方式%s下的十六进制值是%n", str, encode);
            byte[] bs = str.getBytes(encode);
            for (byte b : bs) {
                int i = b & 0xff;
                System.out.printf(Integer.toHexString(i) + "\t");
            }
            System.out.println();
            System.out.println();

        } catch (UnsupportedEncodingException e) {
            System.out.printf("UnsupportedEncodingException: %s编码方式无法解析字符%s\n", encode, str);
        }
    }
}

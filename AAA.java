/**
 * @author xuxiongbin
 * @description
 * @date 2022/3/2 下午4:05
 */
public class AAA {
    public static void main(String[] args) {
        ByteUtils byteUtils = new ByteUtils();
        byte[] bytes = new byte[]{-74, 63, 2, 94, 110, 25, -49, 42, 82, 18, 105, -96, 95, -40, 79, 86, -128, -112, 55, 48, -43, -23, -35, -72, -35, -13, -128, -29, -123, -119, 78, -55};
        String a = "10 11 66 -20 93 104 67 -60 -106 43 67 35 42 26 85 -89 104 -126 -83 -103 20 96 -119 65 -91 -1 -45 -11 111 86 -75 -85 -90 -65 -19 -59 124 -73 65 -86 103 -84 -45 -119 -5 -100 14 -29 19 -123 -120 -3 119 103 96 -60 113 -93 77 94 43 118 -106 -101 -20 121 -122 -84 -108 24 93 50 -119 18 36 -98 123 -116 -59 119 87 23 -23 121 -45 -4 80 9 -67 -17 -32 -88 15 -5 -57 97";
        for (int i = 0; i < bytes.length; i++) {
            System.out.print(byteUtils.byteToHex(bytes[i]));
        }
        System.out.println();


        int i = 0;
        String b = "";
        String []aStr = a.split(" ");
        for (int j = 0; j <=48; j++) {
            b += aStr[j] + ",";
        }
        System.out.println(b);
        System.out.println(a);
        for (byte by:bytes) {
            System.out.print(byteUtils.byteToHex(by));
        }
        System.out.println();
    }
}

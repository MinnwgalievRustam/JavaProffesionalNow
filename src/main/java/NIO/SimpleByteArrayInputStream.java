package NIO;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

public class SimpleByteArrayInputStream {
    public static void main(String[] args) {
        byte[] arr = new byte[]{1,6,4,8,9,6};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arr);

        int tmp;
        while ((tmp = byteArrayInputStream.read()) != - 1){
          //  System.out.println(tmp);
        }

        String str = "Hello";
        byte[] arr2 = str.getBytes(StandardCharsets.UTF_8);
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(arr2, 0,arr2.length);
        int tmp2;
        while ((tmp2 = byteArrayInputStream2.read()) != - 1){
            System.out.println((char) tmp2);
        }
    }
}

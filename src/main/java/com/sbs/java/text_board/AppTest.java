package com.sbs.java.text_board;
import java.util.Arrays;
public class AppTest {
    public static void main(String[] args) {
        // 파라미터 분석
        String queryString = "a=1&b=2&c=3";
        // a=1, b=2, c=3
        String[] queryStringBits = queryString.split("&");
        System.out.println(Arrays.toString(queryStringBits));

        for(String bit : queryStringBits) {
            String[] bitBits = bit.split("=");
            String paramName = bitBits[0];
            String paramValue = bitBits[1];

            System.out.printf("%s : %s\n", paramName, paramValue);
        }

    }
}

package io流.打印流;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class 打印流Test {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("F:\\workspace\\javawebxin\\out\\prop.txt");

        System.setOut(ps);
       System.out.println("hehhe");
    }
}

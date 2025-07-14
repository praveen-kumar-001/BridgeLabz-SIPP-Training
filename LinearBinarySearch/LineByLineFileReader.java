package com.DSA.LinearBinarySearch;
import java.io.*;

public class LineByLineFileReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String line;
        while ((line = br.readLine()) != null)
            System.out.println(line);
        br.close();
    }
}

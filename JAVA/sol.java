import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Sol {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long sum = 0;
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
        for (int i = 0; i < 5; i++){
            long n = in.nextLong();
            sum += n;
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        System.out.println((sum - max) + " " + (sum - min));
    }
}
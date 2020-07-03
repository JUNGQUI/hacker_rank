package com.jk.algorithm.hackerrank;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HackerrankApplicationTests {

//    Pattern pattern = Pattern.compile("\\d{1,2}");
//    new int[] {3, 1};

    @Test
    public void contextLoads() {
        String w = "dkhc";
        String result = "";
        int pivot = -1;
        int changeIDX = -1;

        for (int i = w.length()-1; i > 0; i--) {
            int before = w.charAt(i);
            int after = w.charAt(i-1);

            if (before > after) {
                pivot = i-1;
                break;
            }
        }

        if (pivot == -1) {
            return;
        }

        int compair = w.charAt(pivot);

        for (int i = w.length()-1; i > pivot; i--) {
            int temp = w.charAt(i);

            if (temp > compair) {
                changeIDX = i;
                break;
            }
        }

        if (changeIDX != -1) {
            char[] ws = w.toCharArray();
            char temp = ws[pivot];
            ws[pivot] = ws[changeIDX];
            ws[changeIDX] = temp;
            char[] needSort = Arrays.copyOfRange(ws, pivot+1, ws.length);
            Arrays.sort(needSort);
            char[] prefix = Arrays.copyOf(ws, pivot+1);

            result += new String(prefix) + new String(needSort);
        } else {
            result = "no answer";
        }

        System.out.println("J tag");
    }
}




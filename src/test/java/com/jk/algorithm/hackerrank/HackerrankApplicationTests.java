package com.jk.algorithm.hackerrank;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HackerrankApplicationTests {

//    Pattern pattern = Pattern.compile("\\d{1,2}");
//    new int[] {3, 1};

    @Test
    public void contextLoads() {
//        String s = "if man was meant to stay on the ground god would have given us roots";
//        String s = "i am groot";
//        String s = "haveaniceday";
//        String s = "chillout";
        String s = "iffactsdontfittotheorychangethefacts";

        StringBuilder result = new StringBuilder();
        s = s.replaceAll(" ", "");

        int row = (int) Math.floor(Math.sqrt(s.length()));
        int high = (int) Math.ceil(Math.sqrt(s.length()));

        int column = s.length() > row * row ? row + 1 : row;

        for (int i = 0; i < high; i++) {
            if (row*column < s.length()) {
                row++;
            } else {
                if (row < column) {
                    row++;
                }
                break;
            }

            if (row * column < s.length()) {
                column++;
            } else {
                break;
            }
        }

        for (int a = 0; a < row; a++) {
            for (int b = 0; b < column; b++) {
                int temp = (b*column) + a;
                result.append(temp >= s.length() ? "" : s.substring(temp, temp + 1));
            }
            if (a + 1 != row) {
                result.append(" ");
            }
        }

        System.out.println("J tag");
    }
}




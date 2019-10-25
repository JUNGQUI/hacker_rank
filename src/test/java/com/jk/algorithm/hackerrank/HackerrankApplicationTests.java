package com.jk.algorithm.hackerrank;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HackerrankApplicationTests {

//    Pattern pattern = Pattern.compile("\\d{1,2}");

    @Test
    public void contextLoads() {
        List<String> testList = new ArrayList<>();
        int testCases = 4;
        int get = 0;

        testList.add("<h1>Nayeem loves counseling</h1>");
        testList.add("<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>");
        testList.add("<Amee>safat codes like a ninja</amee>");
        testList.add("<SA premium>Imtiaz has a secret crush</SA premium>");

        while(testCases>0){
            String line = testList.get(get);

            //Write your code here
            Pattern pattern = Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher m = pattern.matcher(line);

            System.out.println(m.find());

            testCases--;
            get++;
        }
    }

}

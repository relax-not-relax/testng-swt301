/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.paramTestNG.core;

/**
 *
 * @author Hoang Anh
 */
public class GetMaxOccurringChar {
     public static char getMaxOccurringChar(String str)       
    {
        int counter[] = new int[256];
        String sentences=str.toLowerCase();
        int len = sentences.length();
        for (int i = 0; i < len; i++)
            counter[sentences.charAt(i)]++;
        int max= counter[sentences.charAt(0)];
        char c=sentences.charAt(0);
        char array[] = new char[sentences.length()];
        for (int i = 0; i < len; i++) {
            array[i] = sentences.charAt(i);
            int flag = 0;
            for (int j = 0; j <= i; j++) {
                if (sentences.charAt(i) == array[j])
                    flag++;
            }
            if (flag == 1)         
        if (max < counter[sentences.charAt(i)]){
            max = counter[sentences.charAt(i)];
            c=sentences.charAt(i);
            System.out.println(c);
        }
        }
        return c;
    }   
}

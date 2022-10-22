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
public class PerfectSquareChecker {
   public static Double checkPerfectSquare(Integer x)
    {
        double sq = Math.sqrt(x);
        double result=sq - Math.floor(sq);
        return result;
    }
}

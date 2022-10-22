/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package com.helen.mathprime.core;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 *
 * @author Admin
 */
public class MathPrimeTestNG {
    
    @Test
    public void testPrimeGivenWrongArgument(){
        boolean actual = Prime.isPrimeNumber(-4);
        Assert.assertFalse(actual,"Nhap vao so khong am");
        //Assert.assertTrue(actual,"Nhap vao so khong am");
    }

    @Test
    public void testPrimeGivenRightArgumentReturnWell() throws Exception{
        boolean expected = true;
        boolean actual = Prime.isPrimeNumber(113);
        Assert.assertEquals(expected, actual);
    }
    
    @DataProvider(name = "input")
    public static Object[][] initData(){
    return new Object[][]{
        {1,false},
        {11,true},
        {13,true},
        {24,false},
        {31,true},
        {36,false},
        {71,true},
        {88,false},
        {93,false},
        {100,false},};
    }
   
    @Test(dataProvider = "input")
    public void testPrime(int n, boolean check) throws Exception{
        Assert.assertEquals(Prime.isPrimeNumber(n), check);
    }
    
}

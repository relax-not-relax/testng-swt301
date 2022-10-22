/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package com.netbu.demo.core;

import static com.netbu.harddependencies.core.DemoHardDependencies.checkInput;
import static com.netbu.harddependencies.core.DemoHardDependencies.isPrimeNumber;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Admin
 */
public class DemoHardDenpendeciesTest {
    
    @Test
    public void checkInputTest() {
        boolean expected = true;
        boolean actual = checkInput(3);
        assertEquals(actual, expected);
    }
    
    @Test (dependsOnMethods = {"checkInputTest"})
    public void isPrimeNumberTest(){
        boolean expected = true;
        boolean actual = isPrimeNumber(3);
        assertEquals(actual, expected);
    }
    
}

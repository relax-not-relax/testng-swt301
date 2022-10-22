/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.paramTestNG.core.PerfectSquareChecker;
import static org.testng.Assert.*;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 *
 * @author Hoang Anh
 */
public class ParamTestNGWithParameterized {
      private PerfectSquareChecker perfectSquareChecker;
    @Test
   @Parameters("number")
   public void parameterTest(Integer number) {
       if(perfectSquareChecker.checkPerfectSquare(number)==0) System.out.println(number+ " is perfect square number");
       else System.out.println(number+ " isn't perfect square number");
        assertEquals(perfectSquareChecker.checkPerfectSquare(number),0.0);
   }
}

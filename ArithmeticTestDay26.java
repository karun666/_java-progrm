package projectJunit5eg;



import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.junitchk.Arithmetic;
import com.junitchk.ArithmeticAssignment;
import com.junitchk.ArithmeticDay26;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ArithmeticTestDay26 {

    //private  ArithmeticDay26  arithmetics;
	private   ArithmeticDay26 arithmetics = new ArithmeticDay26();

    @BeforeAll
    static void befallmet() {
    	// arithmetics = new ArithmeticDay26();-> need to check this is not working for me
    	
    System.out.println("Before All method");	
    }
    
    @BeforeEach
    void befeachmet() {
    System.out.println("Before Each method");	
    }
    @Order(1)
    @Test
    @Tag("Feature1")
    void testMet() {
    	
    	Arithmetic arith  = new Arithmetic();
    	int actual_value=arith.add(-3,-5);
    	assertEquals(-8,actual_value,"Addition should work for negative values also");
    	System.out.println("Test1");
    	
    }
   // @Disabled
    @Order(2)
    @Test
    @Tag("Feature2")
    void testAdd() {
        assertEquals(5, arithmetics.add(2, 3), "Addition should return the sum of two numbers");
        System.out.println("Test 2");
    }

    @Order(3)
    @Test
    @Tag("Feature1")
    void testSubtract() {
        assertEquals(1, arithmetics.subtract(5, 4), "Subtraction should return the difference of two numbers");
        System.out.println("Test 3");
    }

    @Test
    @Tag("Feature2")
    void testMultiply() {
        assertEquals(6, arithmetics.multiply(2, 3), "Multiplication should return the product of two numbers");
        System.out.println("Test 4");
    }

    @Test
    @Tag("Feature1")
    void testDivide() {
        assertEquals(2, arithmetics.divide(6, 3), "Division should return the quotient of two numbers");
        System.out.println("Test 5");
    }

    @Test
    @Tag("Feature2")
    void testDivideByZero() {
        ArithmeticException thrown = assertThrows(ArithmeticException.class, () -> arithmetics.divide(1, 0), "Division by zero should throw ArithmeticException");
        assertEquals("Cannot divide by zero", thrown.getMessage());
        System.out.println("Test 6");
    }
    @Test
    @Tag("Feature1")
    void meta() {
    	int arr[]= {11,22,33,44,55};
    	int[] actual_arr=arithmetics.reverse(arr);
    	int[]expected_arr= {55,44,33,22,11};
    	assertArrayEquals(expected_arr,actual_arr,"comparing reverse arry");
    }
    @AfterEach
    void metafter() {
    	arithmetics= null;
    	System.out.println("After Each");
    }
    @AfterEach
    void metAll() {
    	 
    	System.out.println("After All");
    }
}


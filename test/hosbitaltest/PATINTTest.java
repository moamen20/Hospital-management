/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package hosbitaltest;

import java.sql.Connection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author LENOVO
 */
public class PATINTTest {
    
    public PATINTTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Search_id method, of class PATINT.
     */
   
    @Test
    public void testSearch_id_valid() {
        System.out.println("Search_id");
        int id = 3;
        PATINT instance = new PATINT();
        String[] expResult = {"3","HELAL","22","565848"};
        String[] result = instance.Search_id(id);
        assertArrayEquals(expResult, result);
        
    }
     @Test
    public void testSearch_id_invalid() {
        System.out.println("Search_id");
        //id don't exist
        int id = 333;
        PATINT instance = new PATINT();
        String[] expResult = new String [4];
        String[] result = instance.Search_id(id);
        assertArrayEquals(expResult, result);
        
    }


    /**
     * Test of Search_name method, of class PATINT.
     */
    @Test
    public void testSearch_name_valid() {
        System.out.println("Search_name");
        String name = "HELAL";
        PATINT instance = new PATINT();
        String[] expResult ={"3","HELAL","22","565848"};
        String[] result = instance.Search_name(name);
        assertArrayEquals(expResult, result);
       
    }
    @Test
    public void testSearch_name_invalid() {
        System.out.println("Search_name");
        //name don't exits
        String name = "waaliid";
        PATINT instance = new PATINT();
        String[] expResult = new String[4];
        String[] result = instance.Search_name(name);
        assertArrayEquals(expResult, result);
       
    }
    

    /**
     * Test of add method, of class PATINT.
     */
    @Test
    public void testAdd_valid() {
       
        String name = "Ali";
        int age = 22;
        String email = "ali22@gmail.com";
        int tel = 01200000;
        PATINT instance = new PATINT();
        instance.add(name, age, email, tel);
      
    }
    
     @Test
     public void testAdd_invalid1() {
         //  Empty fields
        System.out.println("add");
        String name = "";
        int age = 22;
        String email = "";
        int tel = 0;
        PATINT instance = new PATINT();
        instance.add(name, age, email, tel);
      
    }
     /*
    @Test
     public void testAdd_invalid2() {
        System.out.println("add");
        //attributes don't follow constraints
        String name = "11111";
        int age = 0;
        String email = "11";
        int tel = ;
        PATINT instance = new PATINT();
        instance.add(name, age, email, tel);
      
    }*/
    @Test
     public void testAdd_invalid3() {
        System.out.println("add");
        //Empty fileds and attributes don't follow constraints
        String name = "11111";
        int age = 0;
        String email = "";
        int tel = 0;
        PATINT instance = new PATINT();
        instance.add(name, age, email, tel);
      
    }
    /**
     * Test of delete method, of class PATINT.
     */
    @Test
    public void testDelete_valid() {
        System.out.println("delete");
        int id = 101;
        PATINT instance = new PATINT();
        instance.delete(id);     
    }
    
     @Test
    public void testDelete_invalid1() {
        System.out.println("delete");
        //id don't exist
        int id = 99;
        PATINT instance = new PATINT();
        instance.delete(id);     
    }
   
    /**
     * Test of update method, of class PATINT.
     */
    @Test
    public void testUpdate_valid() {
        System.out.println("update");
        int id = 4;
        String name = "amr";
        String age = "40";
        String email = "amr30@gmail.com";
        int tel = 33333;
        PATINT instance = new PATINT();
        instance.update(id, name, age, email, tel);
    }
    
    @Test
    public void testUpdate_invalid1() {
        System.out.println("update");
        //id don't exist
        int id = 444;
        String name = "amr";
        String age = "40";
        String email = "amr30@gmail.com";
        int tel = 33333;
        PATINT instance = new PATINT();
        instance.update(id, name, age, email, tel);
    }
    @Test
    public void testUpdate_invalid2() {
        System.out.println("update");
        //id exist but input values don't follow constraints
        int id = 5;
        String name = "11111";
        String age = "apa";
        String email = "amr30@gmail";
        int tel = 33333;
        PATINT instance = new PATINT();
        instance.update(id, name, age, email, tel);
    }
    @Test
    public void testUpdate_invalid3() {
        System.out.println("update");
        //id don't exist and input values don't follow constraints
        int id = 888;
        String name = "11111";
        String age = "apa";
        String email = "amr30@gmail";
        int tel = 33333;
        PATINT instance = new PATINT();
        instance.update(id, name, age, email, tel);
    }
    
    
}

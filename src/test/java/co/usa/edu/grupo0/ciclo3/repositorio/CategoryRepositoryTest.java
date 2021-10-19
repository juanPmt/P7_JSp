/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.edu.grupo0.ciclo3.repositorio;

import co.usa.edu.grupo0.ciclo3.modelo.Category;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author EUSEBIO
 */
public class CategoryRepositoryTest {
    
    public CategoryRepositoryTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getAll method, of class CategoryRepository.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        CategoryRepository instance = new CategoryRepository();
        List<Category> expResult = null;
        List<Category> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCategory method, of class CategoryRepository.
     */
    @Test
    public void testGetCategory() {
        System.out.println("getCategory");
        int id = 0;
        CategoryRepository instance = new CategoryRepository();
        Optional<Category> expResult = null;
        Optional<Category> result = instance.getCategory(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class CategoryRepository.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        Category category = null;
        CategoryRepository instance = new CategoryRepository();
        Category expResult = null;
        Category result = instance.save(category);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

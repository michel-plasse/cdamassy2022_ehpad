/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ehpad.dao;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Formateur
 */
public class DatabaseTest {
    
    @Test
    public void testGetConnection() throws Exception {
        System.out.println("getConnection");
        assertNotNull(Database.getConnection());
    }

  
}

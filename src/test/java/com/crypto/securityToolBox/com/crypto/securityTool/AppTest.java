package com.crypto.securityToolBox.com.crypto.securityTool;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase{
	
	
	public void shouldCreateAnHashFromString(){
		try {
			String message  = Sha.createTheHashFromString("Gabriel");
			System.out.println("Le message est "+message);
			Assert.assertNotNull(message);
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			Assert.fail(e.getMessage());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Assert.fail(e.getMessage());
		}
	}
	
	public void shouldCreateAnHashFromFile()throws Exception{
		
		
		try{
			String message = Sha.createTheHashFromFile("");
			Assert.assertNotNull(message);
			
		}catch(Exception e){
			Assert.fail(e.getMessage());
		}
	}
	
}

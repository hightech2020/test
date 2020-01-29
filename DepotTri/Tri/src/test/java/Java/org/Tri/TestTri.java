package Java.org.Tri;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTri {
	TriBulle Tr = new TriBulle();

	@Test
	void testTri_bulle() {
		int arr[] ={84, 12, 1, 43, 5, 10};  
		int arr2[] ={1, 5, 10, 12, 43, 84 };  
		
		Tr.tri_bulle(arr);
		assertArrayEquals(arr2,arr );
		
	}
	
	  
		@Test
		public	void testtri_selection() {
			 int  arr[]  = { 1, 2, 3 };
		      int arr1[]   = { 2, 1, 3 };
		     Tr.tri_selection(arr1);
		     assertArrayEquals(arr, arr1);
		     
		      
		}

	

		@Test
		public	void testtrierapide() {
			 int  arr[]  = { 1, 2, 3 };
		      int arr1[]   = { 2, 1, 3 };
		     Tr.trierapide(arr1,0,2);
		     assertArrayEquals(arr, arr1);
		   
		}
		

		@Test
		public	void testtrifusion() {
			 int  arr[]  = { 1, 2, 3 };
		      int arr1[]   = { 2, 1, 3 };
		     Tr. trifusion(0,2,arr1);
		     assertArrayEquals(arr, arr1);
		  
		      
		}

}

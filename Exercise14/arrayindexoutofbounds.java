//9. Write a program to generate ArrayIndexOutOfBoundException 
package exercise14;

public class arrayindexoutofbounds 
{
		  
	public static void main(String[] args) 
	{  
				String[] arr = {"Rohit","Shikar","Virat","Dhoni"};   
				//Declaring 4 elements in the String array                                       
	          
					for(int i=0;i<=arr.length;i++) 
					{       
	  
							//Here, no element is present at the iteration number arr.length, i.e 4  
							             System.out.println(arr[i]);      
							//So it will throw ArrayIndexOutOfBoundException at iteration 4 
/*The ArrayIndexOutOfBoundsException occurs whenever we are trying to access 
 * any item of an array at an index which is not present in the array. 
 * In other words, the index may be negative or exceed the size of an array.
 * */							             
					}  
	}
	  
}

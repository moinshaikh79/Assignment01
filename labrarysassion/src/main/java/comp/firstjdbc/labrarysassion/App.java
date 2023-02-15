package comp.firstjdbc.labrarysassion;

/**
 * Hello world!
 *
 */


 
    
    	

    	import java.sql.Connection;
    	import java.sql.DriverManager;
    	import java.sql.PreparedStatement;
    	import java.sql.ResultSet;
    	import java.util.Scanner;
    	

    	/**
    	 * Hello world!
    	 *
    	 */
    	public class App 
    	{
    		static void Insertion()
    		{
    			
    			try
    			{
    				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "Moin10062");
    				if(con.isClosed())
    				{
    					System.out.println("The connection is closed");
    				}
    				else
    				{
    					System.out.println("The connection is Established");
    				}
    				
    				System.out.println("Inserting Your Data");
    				//Creating the Insert Statement"
    	    		String q = "insert into student (rollno,name,dept,address) values(?,?,?,?)";
    	    		
    				PreparedStatement pt = con.prepareCall(q);
    	    		
    	    		//Insert Record Using Scanner
    	    		Scanner sc = new Scanner(System.in);
    	    		System.out.println("Enter roll no :- ");
    	    		int rollno = sc.nextInt();
    	    		System.out.println("Enter  name :- ");
    	    		String name = sc.next();
    	    		System.out.println("Enter dept :- ");
    	    		String dept=sc.next();
    	    		System.out.println("Enter address:- ");
    	    		
    	    		String ddd  = sc.next();
    	    		
    	    		pt.setInt(1,rollno);
    	    		pt.setString(2,name);
    	    		pt.setString(3,dept);
    	    		pt.setString(4,ddd);
    	    		//Executing the query
    	    		pt.executeUpdate();
    	    		System.out.println("The Data Is Inserted Successfully....!");
    	    		
    	    		//Closing the connection
    	    		con.close();	
    			}
    			catch(Exception e)
    			{
    				
    				System.out.println(e);
    				
    			}
    		}

    		static void Updation()
    		{
    			
    			try
    			{
    				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "Moin10062");
    				if(con.isClosed())
    				{
    					System.out.println("The connection is closed");
    				}
    				else
    				{
    					System.out.println("The connection is Established");
    				}
    				
    				System.out.println("Updating Your Data");
    				//Creating the Insert Statement
    	    		String q = "update student set name = ? ,  dept = ? where rollno=?";
    	    	
    				PreparedStatement pt = con.prepareCall(q);
    				
    				Scanner sc = new Scanner(System.in);
    				System.out.println("Enter student Name That you Want to change :- ");
    				String name = sc.next();
    				System.out.println("Enter student dept That you want to change :- ");
    				String dept = sc.next();
    				System.out.println("Enter student rollno where you want to change info :- ");
    				int rollno = sc.nextInt();
    				
    				pt.setString(1,name);
    				pt.setString(2,dept);
    				pt.setInt(3, rollno);
    				
    				pt.executeUpdate();
    				System.out.println("The Data Is Updated Successfully....!");
    			}
    			catch(Exception e)
    			{
    				System.out.println(e);
    			}
    		}
    		
    		static void Deletion()
    		{
    			
    			try
    			{
    				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "Moin10062");
    				if(con.isClosed())
    				{
    					System.out.println("The connection is closed");
    				}
    				else
    				{
    					System.out.println("The connection is Established");
    				}
    				
    				System.out.println("Deleting Your Data");
    				//Creating the Insert Statement
    	    		String q = "delete from student where rollno = ?";
    	    		
    				PreparedStatement pt = con.prepareCall(q);
    				
    				Scanner sc = new Scanner(System.in);
    				System.out.println("Enter  rollno the you want to delete :- ");
    				int id = sc.nextInt();
    				
    				pt.setInt(1, id);
    				
    				pt.executeUpdate();
    				System.out.println("The Data Is Deleted !");
    			}
    			catch(Exception e)
    			{
    				System.out.println(e);
    			}
    		}
    		
    		static void Display()
    		{
    			
    			try
    	    	{
    				//Establish Connection To SQL											 (Database Name)    (User Name) (Pass)
    	    		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","Moin10062");
    	    		if(con.isClosed())
    	    		{
    	    			System.out.println("The connection is close");
    	    		}
    	    		else
    	    		{
    	    			System.out.println("The connection is Established");
    	    		}
    	    		
    	    		System.out.println("Displaying Your Data");
    	    		//Select Statement
    	        	String q = "select rollno,name,dept from student";
    	        	PreparedStatement pt = con.prepareStatement(q);
    	        	ResultSet rset = pt.executeQuery();
    	        	
    	        	while(rset.next())
    	        	{
    	        		int rollno = rset.getInt(1);
    	        		String name = rset.getString(2);
    	        		String dept = rset.getString(3);
    	        	
    	        		
    	        		System.out.println("student_rollno : "+rollno+"  student_name: "+name+" Student_dept: "+dept);
    	        		
    	        	}
    	        	
    	        	//Closing the connection
    	    		con.close();
    	        }
    	    	catch(Exception e)
    	    	{
    	    		System.out.println(e);
    	    	}
    		}
    		
    		static void operation()
    		{	
    				Scanner sc = new Scanner(System.in);
    				System.out.println("Enter Your Choise :-  1 : Insertion, 2 : Updation, 3 : Deletion, 4 : Display ");
    				int c = sc.nextInt();
    				
    				switch(c)
    				{
    					case 1: Insertion();
    					break;
    					
    					case 2: Updation();
    					break;
    					
    					case 3: Deletion();
    					break;
    					
    					case 4: Display();
    					break;
    					
    					default:System.out.println("Invalid Choice");
    					break;
    				}
    		}
    		
    	    public static void main( String[] args )
    	    {
    	     
    	        //System.out.println( "Hello World!" );
    	    	operation();
 }
    	
   	}
    		
    			
    		
    		
    	    
    	
    


 

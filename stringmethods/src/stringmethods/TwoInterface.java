package stringmethods;

interface Printable
{
	void print();
}
interface Calculate
{
	int Cal(int n);	
}

class CalSquare implements Calculate ,Printable
{
	public void print()
 {
	
	   System.out.println("Square of a number is :");
	
 }
	public int Cal(int n)
  {
		int q=n*n;	
      
		return q;
 }
		
}
class CalCube implements Calculate ,Printable
{
	public void print()
 {
		System.out.println("cube of a number is :");
 }
	public int Cal(int n) 
{
	int r=n*n*n;
	return r;
}

}

  	public class TwoInterface
{
	public static void main(String[] args)
{
		

		CalSquare S=new CalSquare();

		S.print();

		System.out.println(S.Cal(50));

		CalCube C=new CalCube();

		C.print();

		System.out.println(C.Cal(30));
		
		
	}


}
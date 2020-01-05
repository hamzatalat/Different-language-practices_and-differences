import java.util.Scanner;


public class shop {

	void Shop()
	{
		FastFood a;
		invoice b;
		seasion c =new seasion();
		char aa='y';
		for(;aa!='n'; )
		{	
			a =new FastFood();
			a.order();
			b=new invoice(a);
			a=b;
			((invoice) a).print_invoice();
			c.add_detail(b);
			System.out.println("Enter y to continue the season and n to close the system");
			
			Scanner scan = new Scanner(System. in);
			aa = scan. next(). charAt((int) 0. );
			
		}
		a=c;
		((seasion) a).season_detail();
		
	}
	
	

	public static void main(String[] args) {
        //System.out.println("Hello World!");
		shop a=new shop();
		a.Shop();
		
    }

}

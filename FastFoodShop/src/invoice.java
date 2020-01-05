import java.util.ArrayList;


public class invoice extends FastFood{
	ArrayList<String> arr = new ArrayList<String>();
	int[] priced;
	int [] choiced;
	invoice(FastFood a)
	{
		priced=a.order_price;
		choiced=a.choice;
		arr=a.arr;
	}

	public void print_invoice()
	{
		System.out.println("-------------------Invoice Detail ------------------");
		//System.out.println("lenght is " +choiced.length);
		for(int i=0 ; i<choiced.length;i++)
		{
			if(choiced[i]>0)
			{
				System.out.println(arr.get(i) +" [Quantity added ::" + choiced[i]);
			}
			
		}
		System.out.println("Total price to be paid " + (priced[0]+ priced[1]));
	}
	
}

import java.util.ArrayList;
import java. util. Scanner;
public class FastFood {
	
	ArrayList<String> arr = new ArrayList<String>();
	int [] prices ={12,22,10,8,15,7};
	int ending=6;
	int [] order_price={0,0};
	int [] choice={0,0,0,0,0,0};
	FastFood()
	{
		String a1="1 large Pizza = 12 AUD";
		arr.add(a1);
		String a2="2 large Pizza = 22 AUD";
		arr.add(a2);
		String a3="N large pizzas = N*10 AUD,\n where N>=3";
		arr.add(a3);
		String a4="1 large pasta = 8 AUD";
		arr.add(a4);
		String a5="2 large pastas = 15 AUD";
		arr.add(a5);
		String a6="M large pastas = M*7 \n AUD, where M>=3,42 AUD]";
		arr.add(a6);
		int b1=12;
		
		
	}


	public void showmanu()
	{
		int l=0;
		for (; l<arr.size();l++)
		{
			System.out.println("Press "+ l+ "-> "+arr.get(l));
		}
		System.out.println("Press "+ l+ "-> To exit");
	}
	public void add_to_manu()
	{
		System.out.println("Please enter the new deal for the manu ");
		Scanner sc = new Scanner(System. in);
		String s = sc. nextLine();
		arr.add(s);
		
		System.out.println("Please enter the price for the new deal in the manu ");
		//Scanner sc = new Scanner(System. in);
		int ssss= sc. nextInt();
		int i = prices.length;  
	    int n = ++i;  
	    int[] newArray = new int[n];  
	    for(int cnt=0;cnt<prices.length-1;cnt++)
	    {  
	        newArray[cnt] =prices[cnt];  
	    }
	    newArray[prices.length]=ssss;
	    prices=newArray;
	    
	    
	    
	    
	    int ii = choice.length;  
	    int nn = ++ii;  
	    int[] newarray = new int[nn];  
	    for(int cnt=0;cnt<choice.length;cnt++)
	    {  
	        newarray[cnt] =choice[cnt];  
	    }
	    newarray[choice.length]=0;
	    choice=newarray;
	    ending++;
	    
	}
	public void order()
	{
		int choices=0;
		while(choices!=ending)
		{
			//System.out.println("Please enter the price for the new deal in the manu ");
			if(choices <= ending)
			{
				showmanu();
				Scanner sc = new Scanner(System. in);
				choices= sc. nextInt();
				
				if(choices ==2)
				{
					System.out.println("Please enter the number of pizza u want (N>=3)");
					int no;
					no=sc. nextInt();
					if(no>=3)
					{
						order_price[0]+=no*10;
						choice[choices]+=no;
						
					}
				}
				
				if(choices ==5)
				{
					System.out.println("Please enter the number of Pasta u want (N>=3)");
					int no;
					no=sc. nextInt();
					if(no>=3)
					{
						order_price[1]+=no*10;
						choice[choices]+=no;
					}
				}
				if(choices <2 && choices<ending )
					{choice[choices]+=1;
					//System.out.println("choice entered "+ choice[choices]+ " "+ choices);
					order_price[0]=order_price[0]+prices[choices];}
				else if(choices >3 && choices <ending-1 && choices<ending )
				{
					choice[choices]+=1;
					//System.out.println("choice entered "+ choice[choices]+ " "+ choices);
					
					order_price[1]=order_price[1]+prices[choices];
				}
				
			}
			else 
			{
				System.out.println("Invalid choice enter again  ");
				
			}
		}
	}
	
}

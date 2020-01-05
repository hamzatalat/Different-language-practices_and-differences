
public class seasion extends FastFood {
	
	int pizza_price=0;
	int pasta_price=0;
	int [] choices={0,0};
	seasion()
	{
		
	}
	public void add_detail(invoice a)
	{
		choices[0]+=a.choiced[0]+(a.choiced[1]*2)+a.choiced[2];
		choices[1]+=a.choiced[3]+a.choiced[4]+a.choiced[5];
		pizza_price += a.priced[0];
		pasta_price+=a.priced[1];
	}
	
	void season_detail()
	{
		System.out.println("------------Season details are as fallows -----------");
		System.out.println("Total number of pizza sold today	" +(choices[0]) );
		System.out.println("Total number of Pasta sold today	" +(choices[1]) );
		System.out.println("Total income of today	" +(pizza_price+ pasta_price) );
	}
	
	
	
}

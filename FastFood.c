
#include <stdio.h>

int total_price=0;
int prices[6]={12,22,10,8,15,7};
int choices[6]= {0,0,0,0,0,0};
char deals[6][100]={"1 large Pizza = 12 AUD","2 large Pizza = 22 AUD","N large pizzas = N*10 AUD,\n where N>=3","1 large pasta = 8 AUD","2 large pastas = 15 AUD","M large pastas = M*7 \n AUD, where M>=3,42 AUD"};
int size = 6;

void bill(int i)
{

    if(i <size && i!=2 && i!=5)
        {
            //printf("Here");
            choices[i]=choices[i]+1;
        }
        if(i <size && i==2 || i==5)
        {
            int j=0;
            printf("how many pizza/pasta do you want should be greater than 3 /n");
            scanf("%d", &j);
            if(j>3)
            {
                choices[i]=choices[i]+j;
            }
            else
            {
                printf("choose again");
            }
        }
        
        
        printf("************* Bill **************** \n");
        int price=0;
        for(int i=0;i<size ; i++)
        {
            if(choices[i]>0)
            {
                printf("\n");
                printf("%s" , deals[i]);
                price+=(choices[i]*prices[i]);
            }
                
        }
        printf("\n Total bill is ");
        printf("%d" , price);
        printf("\n ");
        
     total_price+=price;
        price =0;

}

void Manu()
{
     for(int i=0; i!=size; )
    {
        printf("-------------------- Wellcome---------------------- \n"); 
        printf("press 0 to add 1 large Pizza = 12 AUD \n" );
        printf("press 1 to add 2 large Pizza = 22 AUD \n" );
        printf("press 2 to add N large pizzas = N*10 AUD,\n where N>=3 \n" );
        printf("press 3 to add 1 large pasta = 8 AUD \n" );
        printf("press 4 to add 2 large pastas = 15 AUD\n" );
        printf("press 5 to add M large pastas = M*7 AUD, where M>=3,42 AUD  \n" );
        printf("press 6 to exit  \n" );
        printf("Enter your choice \n" );
        scanf("%d", &i);
        bill(i);
    }

}
void seasion ()
{
     int k=0;
    for(;k!=1;)
    {
        Manu();
        for(int i=0;i<size ; i++)
        {
            choices[i]=0;
        }
        
    printf("\n press 1 to end the seasion or 0 to continue \n");
    scanf("%d", &k);
        
    }
}

int main()
{
    
    seasion();
    printf("Total earnings of today %d", total_price);
    return 0;
}

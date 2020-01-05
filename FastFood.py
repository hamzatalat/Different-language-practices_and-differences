#!/usr/bin/env python
# coding: utf-8

# In[5]:


choice =[0,0,0,0,0,0]
prices =[12,22,10,8,15,7]
ending=6
arr =[]
a1="1 large Pizza = 12 AUD"
arr.append(a1)
a2="2 large Pizza = 22 AUD"
arr.append(a2)
a3="N large pizzas = N*10 AUD ,where N>=3"
arr.append(a3)
a4="1 large pasta = 8 AUD"
arr.append(a4)
a5="2 large pastas = 15 AUD"
arr.append(a5)
a6="M large pastas = M*7 \n AUD, where M>=3,42 AUD]"
arr.append(a6)
class  Manu:
    def add(self):
        a=""
        a=input("Please input new deal ")
        arr.append(a)
        choice.append(0)
        b=0
        b=input("Please input the price for the deal  ")
        prices.append(int(b))
        global ending
        ending+=1
    def fun(self):
        print("---------------------Manu-----------------------")
        l=0
        while l < ending:
            print("Press "+str(l) + "-> " +arr[l])
            l+=1
        print("Press "+str(l) + "-> " +" To Exit")
        pass
ace=Manu()
class customer_order:
    def order(self):
        i=0
        while int(i) != ending:
            ace.fun()
            i = input("Enter your choice   ")
            if int(i)==2 or int(i)==5:
                print("Please enter the number of pizza/pasta u want (N>=3)");
                no=0;
                no=input();
                if(int(no)>=3):
                    choice[int(i)]+=int(no);
            if int(i)<ending and i!=2 and i!=5:   
                choice[int(i)]=choice[int(i)]+1
        pass

class Invoice:
    def print_invoice(self):

        b=customer_order()
        b.order()
        print("************************* Invoice Detail ***************************")
        i=0
        while i<ending:
            if choice[i]>0:
                print(arr[i] + " quantity :: " + str(choice[i]))
            i+=1
        pizza_price=0
        pizza_price +=((choice[0]*prices[0]) + (choice[1]*prices[1]) + (choice[2]*prices[2]) )
        pizza_count=0
        pizza_count+=(choice[0]+(choice[1]*2)+choice[2])
        i=3
        pasta_count=-0
        pasta_price=0
        while i<ending:
            pasta_count+=choice[i]
            pasta_price+=(choice[i]*prices[i])
            i+=1
        final_price=0
        final_price=pizza_price + pasta_price
        print("Total price to be paid is " +str(pizza_price + pasta_price))
        K=0
        while K<ending:
            choice[K]=0
            K+=1
        return [pizza_count ,pasta_count, final_price ]
class seasions:
    def seasion(self):
        a=0
        pizza_count=0
        pasta_count=0
        final_price=0
        I=Invoice()
        while int(a)!=1:
            if int(a)==5:
                ace.add()
            aa,b,c= I.print_invoice()
            pizza_count+=aa
            pasta_count+=b
            final_price+=c
            a=input("Press 1 to end the seasion or 0 to continue or 5 to add new deal ")
        print("*********************   Seasion details  *************************")
        print("Total pizza sold today  "+ str(pizza_count))
        print("Total pasta sold today  "+str(pasta_count))
        print("Total Income of this seasion  "+str(final_price))
    
S=seasions()
S.seasion()


# In[ ]:





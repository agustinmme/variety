#include <iostream>
using namespace std;
int calSalePrice(int n1,int n2);
int sumTotalBuy(int arr[], int n);
int sumTotalSale(int price[],int stock[], int n);
int main(){
	
	int valueIteration = 2;
	
    printf("Hi,Welcome\n");
    
    int n1[valueIteration],n2[valueIteration];
    for(int i=0;i<valueIteration;i+=1){
 	cout<<"Enter price"<<endl;
    cin>>n1[i];
    cout<<"Enter stock"<<endl;
    cin>>n2[i];
    printf("\n");
	}
	
   for(int i=0;i<valueIteration;i+=1){
    cout<<"\nSale Price "<<i<<" : "<<calSalePrice(n1[i],n2[i]);
	}
	cout << "\nTotal Buy   : " << sumTotalBuy(n1, valueIteration);
	cout << "\nTotal Sale  : " << sumTotalSale(n1,n2, valueIteration);
    return 0;
}
int calSalePrice(int price ,int stock){
    int result;
    if((price<1500 && stock>=100)|| stock<50){
    	result=price*1.15*1.21;
	}else{
		result=(price*1.20*1.21);
	}
    return result;
}

int sumTotalBuy(int arr[], int n)
{
    int sum = 0; 
    for (int i = 0; i < n; i++)
    sum += arr[i];
    return sum;
}

int sumTotalSale(int price[],int stock[], int n)
{
    int sum = 0; 
    int result;
    for (int i = 0; i < n; i++){
    if((price[i]<1500 && stock[i]>=100)|| stock[i]<50){
    	result=(price[i]*1.15*1.21);
	}else{
		result=(price[i]*1.20*1.21);
	}
	 sum += result;
	}
    return sum;
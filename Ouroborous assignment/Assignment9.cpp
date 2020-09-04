#include <iostream>
using namespace std;

int main()
{
    int n;
  cout<<"enter the no of elements in array";
   cin>>n;
	int arr[n];
	cout<<"\n enter the elements in array";
    for(int i=0;i<n;i++)
         {
           cin>>arr[i];
         }
    int key;
    cout<<"Enter the number to be find : ";
    cin>>key;
    int flag=0;

    for(int i=0;i<n;i++)
    {
        if(arr[i]==key)
        {
            cout<<"Element found at position : "<<i+1<<endl;
            flag=1;
            break;
        }
    }
    if(flag==0)
        cout<<"Element not found";

    return 0;
}


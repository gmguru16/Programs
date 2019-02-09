#include <iostream>
#include <string>
#include <sstream>

using namespace std;

int main() 
{
    int t;
    cin>>t;
    string str;
    getline(cin,str);
    getline(cin,str);
    while(t--)
    {
    	char ch;
    	int k,l,m,a[110]={0},b[110]={0},c[110]={0},d[110][12][1]={0};
    	while(getline(cin,str) && str.size()>0)
    	{
    		stringstream ss(str);
	        ss >> k >> l >> m >> ch;
    		a[k]=k;
    		if(ch=='C')
    		{
    			
    			if(d[k][l][0]>=0)
    			{
    				b[k]++;
    			    c[k]=c[k]+m;
    				c[k]=c[k]+d[k][l][0];
    				d[k][l][0]=-1;
    			}
    		}
    		else
    		{
    			if(ch=='I' && d[k][l][0]>=0)
    			{
    			 d[k][l][0]=d[k][l][0]+20;	
    			}
    		}
    	}
    	int temp,flag=1; 
        for(int i = 1; (i <= 100+1) && flag; i++)
        {
          flag = 0;
          for (int j=0; j < (100); j++)
          {
               if (b[j+1] > b[j])      
               { 
                    temp = a[j];            
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    
                    temp = b[j];            
                    b[j] = b[j+1];
                    b[j+1] = temp;
                    
                    temp = c[j];            
                    c[j] = c[j+1];
                    c[j+1] = temp;
                    flag = 1;               
               }
               if (b[j+1] == b[j] && c[j+1]<c[j])      
               { 
                    temp = a[j];            
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    
                    temp = b[j];            
                    b[j] = b[j+1];
                    b[j+1] = temp;
                    
                    temp = c[j];            
                    c[j] = c[j+1];
                    c[j+1] = temp;
                    flag = 1;               
               }
          }
        }
        for(int j=0;j<=100;j++)
        {
        	if(a[j]!=0)
        	{
        	 cout<<a[j]<<" "<<b[j]<<" "<<c[j]<<endl;
        	}
        }
        if(t>0)
        {
    	 cout<<endl;
        }
    }
	return 0;
}

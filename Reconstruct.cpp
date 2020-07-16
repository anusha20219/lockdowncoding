#include <bits/stdc++.h>  
using namespace std;  
  
void construct(int n, int m, int a[]) 
{ 
    int ind = 0; 
  
    // Finding the index which is not -1 
    for (int i = 0; i < n; i++) 
    { 
        if (a[i] != -1)  
        { 
            ind = i; 
            break; 
        } 
    } 
      
    // Calculating the values of  
    // the indexes ind-1 to 0 
    for (int i = ind - 1; i > -1; i--) 
    { 
        if (a[i] == -1) 
            a[i] = (a[i + 1] - 1 + m) % m; 
    } 
      
    // Calculating the values of 
    // the indexes ind + 1 to n 
    for (int i = ind + 1; i < n; i++)  
    { 
        if (a[i] == -1) 
            a[i] = (a[i - 1] + 1) % m; 
    } 
    for (int i = 0; i < n; i++) 
    { 
        cout<< a[i] << " "; 
    } 
  
} 
  
// Driver code 
int main()  
{  
  
    int n = 6, m = 7; 
    int a[] = { 5, -1, -1, 1, 2, 3 }; 
    construct(n, m, a); 
    return 0;  
}  

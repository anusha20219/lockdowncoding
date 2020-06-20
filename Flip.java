import java.util.*; 

class GFG  
{ 

  
// Function to return the count of bits 
// to be flipped to convert a to b 

static int countBits(int a, int b) 
{ 

  

    // To store the required count 

    int count = 0; 

  

    // Loop until both of them become zero 

    while (a > 0 || b > 0)  

    { 

  

        // Store the last bits in a 

        // as well as b 

        int last_bit_a = a & 1; 

        int last_bit_b = b & 1; 

  

        // If the current bit is not same 

        // in both the integers 

        if (last_bit_a != last_bit_b) 

            count++; 

  

        // Right shift both the integers by 1 

        a = a >> 1; 

        b = b >> 1; 

    } 

  

    // Return the count 

    return count; 
} 

  
// Driver code 

public static void main(String[] args)  
{ 

    int a = 10, b = 7; 

  

    System.out.println(countBits(a, b)); 
} 
} 

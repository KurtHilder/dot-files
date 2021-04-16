#include <iostream>
#include <ctime>
#include <math.h>
using namespace std;





int main(void)
{
    cout << "|---------------------|" << endl;
    cout << "| SIMPLE PRIME C++    |" << endl;
    cout << "|---------------------|" << endl;
    
    int primesToFind = 10000; 
    int primesFound = 0;
    int currentNumber = 0;

    
    clock_t timer = clock();
    
    
    while(primesFound < primesToFind)
    {
        currentNumber++;
        
        int divCount = 0;
    
        for(int i = 1; i <= currentNumber; i++)
        {
            int mod = currentNumber % i;
            if(mod == 0)
            {
                divCount++;
            }
        }


        if(divCount == 2)
        {
            primesFound++;
            cout << primesFound <<  " " << currentNumber << endl; 
        }
    }
    
    timer  = clock() - timer;
    float milli = ((float)timer)/CLOCKS_PER_SEC;

    cout << "Time:" << milli << endl;

    return 0;


}


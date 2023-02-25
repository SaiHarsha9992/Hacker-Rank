#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
    char s [ 1000 ] ;
    int digit [ 10 ] = {0};
    scanf ( "%s" , s ) ;
    for ( int i = 0 ; i < strlen ( s ) ; i++ )
    {
        if ( s [ i ] >= 48 && s [ i ] <= 57  )
        {
            digit [ s [ i ] - 48 ]++  ;
        }
    }  
    for ( int i = 0 ; i < 10 ; i++ )
    {
        printf ( "%d " , digit [ i ] ) ;
    }
    return 0;
}

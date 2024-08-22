public class Pattern5 {
    int n = 5 ;
    for (int i = 0 ; i < (2*n - 1);i++){
        if (i>n)
            {}
        else 
            {
                for(int j = 0;j<i;j++)
                {System.out.print("* ");}
                System.out.println( );
            }
    }
}
/*
 *  *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *
 */
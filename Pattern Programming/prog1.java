class prog1
{
    public static void main(String[] args) {
        int n=10;
        for (int i = 0; i < n; i++) {

            /* *****************Using For Print A ********************* */

            for (int j = 0; j < n; j++) {

                if (i==0 && j>0 && j<(n-1)/2 || j==0 && i>0 || i==(n-1)/2 && j<=(n-1)/2 || j==(n-1)/2 && i>0 )
                {
                    System.out.print("*");
                    
                } else {

                    System.out.print(" ");
                    
                }
                   
                
            }

            /* *****************Using For Print B ********************* */

            for (int j = 0; j < n; j++) {

                
                if(j==0 && i>=0 || i==0 && j>0 & j<(n-1)/2 || i>0 && i<(n-1)/2 && j==(n-1)/2 || i==(n-1)/2 && j>0 && j<(n-1)/2 || i>(n-1)/2  && i<n-1 && j==(n-1)/2 || i==(n-1) && j>0 && j<(n-1)/2) 
                {
                    System.out.print("*");
                    
                } else {

                    System.out.print(" ");
                    
                }    
                
            }

            /* *****************Using For Print C ********************* */

            for (int j = 0; j < n; j++) {

                
                if(j==0 && i>0 && i<n-1 || i==0 && j>0 && j<(n-1)/2 +2 || i==n-1 && j>0 && j<(n-1)/2 +2) 
                {
                    System.out.print("*");
                    
                } else {

                    System.out.print(" ");
                    
                }    
                
            }

            /* *****************Using For Print D ********************* */
            for (int j = 0; j < n; j++) {

                
                if(i==0 && j<(n-1)/2 || i==(n-1) && j<(n-1)/2 || i>0 && i<n-1 && j==0 || j==(n-1)/2 && i<(n-1) && i>0)  
                {
                    System.out.print("*");
                    
                } else {

                    System.out.print(" ");
                    
                }    
                
            }

            /* *****************Using For Print E ********************* */
            for (int j = 0; j < n; j++) {

                
                if(j==0 && i>=0 || i==0 && j>0 & j<=(n-1)/2 ||  i==(n-1)/2 && j>0 && j<(n-1)/2 ||  i==(n-1) && j>0 && j<=(n-1)/2) 
                {
                    System.out.print("*");
                    
                } else {

                    System.out.print(" ");
                    
                }    
                
            }

            /* *****************Using For Print F ********************* */
            for (int j = 0; j < n; j++) {

                
                if(j==0 && i>=0 || i==0 && j>0 & j<=(n-1)/2 ||  i==(n-1)/2 && j>0 && j<(n-1)/2 )  
                {
                    System.out.print("*");
                    
                } else {

                    System.out.print(" ");
                    
                }    
                
            }

            /* *****************Using For Print G ********************* */
            for (int j = 0; j < n; j++) {

                
                if(j==0 && i>0 && i<n-1 || i==0 && j>0 && j<(n-1)/2 || i==n-1 && j>0 && j<(n-1)/2  || i==1 && j==(n-1)/2 || i==(n-1)/2 && j>1 && j<(n-1)/2 || i>=(n-1)/2 && j==(n-1)/2) 
                {
                    System.out.print("*");
                    
                } else {

                    System.out.print(" ");
                    
                }    
                
            }

            /* *****************Using For Print H ********************* */
            for (int j = 0; j < n; j++) {

               
                if (j==0 && i>=0 || i==(n-1)/2 && j<=(n-1)/2 || j==(n-1)/2 && i>=0 )
                {
                    System.out.print("*");
                    
                } else {

                    System.out.print(" ");
                    
                }    
                
            }
            System.out.println();

            
            
        }
    }
}
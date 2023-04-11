public class prog5 {
    public static void main(String[] args) {
        int n=10;
        for (int i = 0; i < n; i++) {

            /* *****************Using For Print S ********************* */

            for (int j = 0; j < n; j++) {

                if(i>=0 && i<=(n-1)/2 && j==0 || j>0 && i==0 && j<n-3 ||j>0 && i==(n-1)/2 && j<n-3 || j==n-3 && i>(n-1)/2 || i==n-1 && j>=0 && j<n-3) 
                {
                    System.out.print("*");
                    
                } else {

                    System.out.print(" ");
                    
                }
                   
                
            }

            /* *****************Using For Print A ********************* */

            for (int j = 0; j < n; j++) {

                
                if (i==0 && j>0 && j<(n-1)/2 || j==0 && i>0 || i==(n-1)/2 && j<=(n-1)/2 || j==(n-1)/2 && i>0 )
                {
                    System.out.print("*");
                    
                } else {

                    System.out.print(" ");
                    
                }    
                
            }

            /* *****************Using For Print P ********************* */

            for (int j = 0; j < n; j++) {

                
                if (i>=0 && j==0 || i==0 && j>0 && j<(n-1)/2 || i>0 && j==(n-1)/2 && i<(n-1)/2 || i==(n-1)/2 && j>0 && j<(n-1)/2) 
                {
                    System.out.print("*");
                    
                } else {

                    System.out.print(" ");
                    
                }    
                
            }

            /* *****************Using For Print T ********************* */
            for (int j = 0; j < n; j++) {

                
                if(i==0 && j>=0 && j<=(n-1)/2 || i>0  && j==2)   
                {
                    System.out.print("*");
                    
                } else {

                    System.out.print(" ");
                    
                }    
                
            }

            /* *****************Using For Print A ********************* */
            for (int j = 0; j < n; j++) {

                
                if (i==0 && j>0 && j<(n-1)/2 || j==0 && i>0 || i==(n-1)/2 && j<=(n-1)/2 || j==(n-1)/2 && i>0 ) 
                {
                    System.out.print("*");
                    
                } else {

                    System.out.print(" ");
                    
                }    
                
            }

            /* *****************Using For Print R ********************* */
            for (int j = 0; j < n; j++) {

                
                if(i>0 && j==0 || i==5 && j==1 || i==6 && j==2 || i==7 && j==3 || i==8 && j==4 || i==9 && j==5 || i==0 && j>0 && j<(n-1)/2 || j==(n-1)/2 && i>0 & i<(n-1)/2 || i==(n-1)/2 && j>0 && j<(n-1)/2)  
                {
                    System.out.print("*");
                    
                } else {

                    System.out.print(" ");
                    
                }    
                
            }

            /* *****************Using For Print S ********************* */
            for (int j = 0; j < n; j++) {

                
                if(i>=0 && i<=(n-1)/2 && j==0 || j>0 && i==0 && j<n-3 ||j>0 && i==(n-1)/2 && j<n-3 || j==n-3 && i>(n-1)/2 || i==n-1 && j>=0 && j<n-3) 
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
            /* *****************Using For Print I ********************* */
            for (int j = 0; j < n; j++) {

               
                if(i==0 && j>=0 && j<=(n-1)/2 || i==n-1 && j>=0 && j<=(n-1)/2 || i>0 && i<n-1 && j==2) 
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

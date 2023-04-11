public class prog4 {
    public static void main(String[] args) {
        int n=10;
        for (int i = 0; i < n; i++) {

            /* *****************Using For Print P ********************* */

            for (int j = 0; j < n; j++) {

                if (i>=0 && j==0 || i==0 && j>0 && j<(n-1)/2 || i>0 && j==(n-1)/2 && i<(n-1)/2 || i==(n-1)/2 && j>0 && j<(n-1)/2)
                {
                    System.out.print("*");
                    
                } else {

                    System.out.print(" ");
                    
                }
                   
                
            }

            /* *****************Using For Print W ********************* */

            for (int j = 0; j < n; j++) {

                
                if(i>=0 && j==0 || i>=0 && j==n-4 || i==n-4 && j==(n-1)/2 -1 || i==n-2 && j==n-9 || j==(n-1)/2 + 1 && i==n-2 || i==n-3 && j==n-8 || i==n-3 && j==(n-1)/2 ) 
                {
                    System.out.print("*");
                    
                } else {

                    System.out.print(" ");
                    
                }    
                
            }
            System.out.print("\t\t");

            /* *****************Using For Print S ********************* */

            for (int j = 0; j < n; j++) {

                
                if(i>=0 && i<=(n-1)/2 && j==0 || j>0 && i==0 && j<n-3 ||j>0 && i==(n-1)/2 && j<n-3 || j==n-3 && i>(n-1)/2 || i==n-1 && j>=0 && j<n-3) 
                {
                    System.out.print("*");
                    
                } else {

                    System.out.print(" ");
                    
                }    
                
            }

            /* *****************Using For Print K ********************* */
            for (int j = 0; j < n; j++) {

                
                if(i>=0 && j==0 || i==(n-1)/2 && j==1 || i==3 && j==2 || i==2 && j==3 || i==1 && j==4 || i==0 && j==5 || i==5 && j==1 || i==6 && j==2 || i==7 && j==3 || i==8 && j==4 || i==9 && j==5)  
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

            /* *****************Using For Print L ********************* */
            for (int j = 0; j < n; j++) {

                
                if(i>=0 && j==0 || i==n-1 && j>0 && j<=(n-1)/2 )  
                {
                    System.out.print("*");
                    
                } else {

                    System.out.print(" ");
                    
                }    
                
            }

            /* *****************Using For Print L ********************* */
            for (int j = 0; j < n; j++) {

                
                if(i>=0 && j==0 || i==n-1 && j>0 && j<=(n-1)/2 )
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
            System.out.println();

            
            
        }
    }
}

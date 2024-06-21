class Pattern{
   public static void main(String[] args) {
       tri();
       rev_tri();
       hill();
       pyramid ();
       square();
   }
    public static void tri() {
        int n=10;
        for (int i=1; i<=n; i++){
            for( int j=1; j<=n;j++){
                if (i>=j){
                    System.out.print(" *");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.err.println();
        }
    }
    public static void rev_tri() {
System.err.println("\n");

        int n=5;
        for (int i=1; i<=n;i++){
            for (int j=1; j<=n;j++){
                if (j>=i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void hill() {
System.err.println("\n");

        for(int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                if(j>=6-i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
    public static void pyramid () {

        for(int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                if(j>=6-i){
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }

    public static void square() {
System.err.println("\n");        

        for (int i=1;i<=5; i++){
            for (int j=1;j<=5;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    








}
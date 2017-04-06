package arr;
public class Arr {
    public static void main(String[] args) {
        int n=8;
        int a[][]= new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n; j++) {
                a[i][j]= (int) (Math.random()*(9+1));
                System.out.print("["+a[i][j]+"]");
            }
            System.out.println("");
        }
        System.out.println("");
        String b="";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==j){
                    System.out.println(b+"["+a[i][j]+"]");
                    b+="   ";
                }
            }
        }
        System.out.println("");
        for (int i = a.length-1; i >=0; i--) {
            for (int j = a.length-1; j>=0; j--) {
                System.out.print("["+a[i][j]+"]");
            }
            System.out.println("");
        }
        System.out.println("");
        String dim="";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i+j==a.length-1){
                    System.out.print(dim+"["+a[i][j]+"]");
                    dim+="   ";
                }
            }
            System.out.println("");
        }
    }
    
}

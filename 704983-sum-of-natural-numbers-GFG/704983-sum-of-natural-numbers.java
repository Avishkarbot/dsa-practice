import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n==0 || n==1){
            System.out.print(n);

        }else{
           System.out.print(sum(n)); 
        }
        
    }
    
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        return n + sum(n-1);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
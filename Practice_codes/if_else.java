import java.util.Scanner;
public class if_else {
    public static int sign(int n){
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        sc.close();
        if(n<0){
            return(-1);
        }
        else if(n>0){
            return(1);
        }
        else{
            return(0);
        }
        
    }
}

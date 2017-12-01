import java.util.Scanner;

public class Coins {



    public static void main(String[] args){
        int q = 0;
        int d = 0;
        int p = 0;
        int n = 0;
        int z = 0;
        Scanner Total = new Scanner(System.in);
        int x = Total.nextInt();
        for(q = 0; (q*25)<= x; q++){
            for(d = 0; (d*10)<= (x - q*25); d++){
                for(n = 0; (n*5)<= (x - q*25 -  d*10); n++){
                    for(p = 0; (p)<= (x - 25*q - 10*d - 5*n); p++){
                            if((q*25) + (d*10) + (n*5) + (p) == x){
                                z++;
                                System.out.println(z + ": " + x + " = " + (q) + " Quarters + " + (d) + " Dimes + "+ (n) + " Nickels + "+ (p) + " Pennies");
                            }
                    }
                }
            }
        }
    }
}

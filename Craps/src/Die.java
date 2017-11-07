import java.util.Random;

public class Die {
    public void roll(){

    }
    public int getNumDots(){
Random ran = new Random();
int numDots = ran.nextInt(6) + 1;
        return numDots;
    }
public static void main (String[] args){

    Die die = new Die();
    die.roll();
    System.out.println(die.getNumDots());
    die.roll();

}
}

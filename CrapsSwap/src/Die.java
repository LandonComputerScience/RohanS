import java.util.Random;

public class Die {
    public int numDots;
    public void roll(){
        Random ran = new Random();
        numDots = (int)(6* Math.random() + 1);
    }

public int getNumDots(){
return numDots;
    }
public static void main (String[] args){

    Die die = new Die();
    die.roll();
    System.out.println(die.getNumDots());
    die.roll();


}
}

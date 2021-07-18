package participants;

public class Robot implements Party {
    private int maxrun;
    private int maxjump;

    public Robot( int maxrun, int maxjump){
        this.maxjump = maxjump;
        this.maxrun = maxrun;
    }
@Override
    public boolean run( int length)
    {return this.maxrun >= length; }
@Override
    public  boolean jump( int height)
    {return this.maxjump >= height;}



}
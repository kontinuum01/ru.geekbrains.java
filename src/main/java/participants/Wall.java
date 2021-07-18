package participants;

public class Wall implements Competitions {
    private int height;

    public Wall(int height){
         this.height = height;}

    public boolean result(Party party){
        if (party.jump(this.height)){
            System.out.printf("%s jumping %d meters.\n",party.getClass().getSimpleName(), height);
                    return true;
        }
        System.out.printf("%s not jamping %d meters.\n",party.getClass().getSimpleName(), height);
        return false;
    }
    }


package participants;

public class Game {
    public static void main(String[] args) {
         Party[] party = {
                 new Human(3500,2),
                 new Robot(10000,3),
                 new Cat(5000,5)
         };

         Competitions[] test = {
                 new Track(1500),
                 new Wall(1),
                 new Track(2500),
                 new Wall(2),
                 new Track(3500),
                 new Wall(3)
         };

         for ( Party p : party){
        for( Competitions r : test) {
            if ( !r.result(p))
                break;
        }
    }
    }
}

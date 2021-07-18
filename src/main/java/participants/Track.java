package participants;

public  class Track implements Competitions {
    private int lenght;

    public Track(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public boolean result(Party party) {
        if (party.run(this.lenght)) {
            System.out.printf("%s runs %d meters.\n", party.getClass().getSimpleName(), lenght);
            return true;
        }
        System.out.printf("%s not runs %d meters.\n", party.getClass().getSimpleName(), lenght);
        return false;
    }
}

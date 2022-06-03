public class Player {

    private int currentPoints;
    private String name;

    public Player(String name) {
        this.name = name;
        this.currentPoints = 50;
    }

    public Player(int currentPoints, String name) {
        this.currentPoints = currentPoints;
        this.name = name;
    }

    public void subtractPoints(int points) {
        if (moreThanZeroPointsAfterSubtracting(points)) {
            this.currentPoints -= points;
        }
        else {
            this.currentPoints += points;
        }
    }

    public boolean moreThanZeroPointsAfterSubtracting(int points) {
        if (this.currentPoints - points > 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isWinner() {
        if (this.currentPoints == 1) {
            return true;
        }
        else {
            return false;
        }
    }

    public String toString() {
        return name + ": " + currentPoints;
    }

    public String getName() {
        return this.name;
    }

}

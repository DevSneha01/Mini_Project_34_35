package Model;

public class OffensiveLine {
    
    private FootballPlayer center;
    private FootballPlayer offensiveGuard;
    private FootballPlayer offensiveTackle;

    public OffensiveLine() {
    }

    public OffensiveLine(FootballPlayer center, FootballPlayer offensiveGuard,
                         FootballPlayer offensiveTackle) {
        this.center = center;
        this.offensiveGuard = offensiveGuard;
        this.offensiveTackle = offensiveTackle;
    }

    public FootballPlayer getCenter() {
        return center;
    }

    public void setCenter(FootballPlayer center) {
        this.center = center;
    }

    public FootballPlayer getOffensiveGuard() {
        return offensiveGuard;
    }

    public void setOffensiveGuard(FootballPlayer offensiveGuard) {
        this.offensiveGuard = offensiveGuard;
    }

    public FootballPlayer getOffensiveTackle() {
        return offensiveTackle;
    }

    public void setOffensiveTackle(FootballPlayer offensiveTackle) {
        this.offensiveTackle = offensiveTackle;
    }

    public int averageWeight() {
        return (center.getWeight() + offensiveGuard.getWeight()
                + offensiveTackle.getWeight()) / 3;
    }

  
    @Override
    public String toString() {
        return "------ Center Player ------\n" + center +
                "------ OffensiveGuard Player ------\n" + offensiveGuard +
                "------ OffensiveTackle Player ------\n" + offensiveTackle;
    }
}

package Model;

public class FootballPlayer {
    
    private int number;
    private String name;
    private String position;
    private Height height;
    private int weight;
    private String hometown;

    public FootballPlayer() {
        number = 0;
        name = "";
        position = "";
        new Height(0, 0);
        weight = 0;
        hometown = "";
    }


    public FootballPlayer(int number, String name, String position, Height height, int weight, String hometown) {
        this.number = number;
        this.name = name;
        this.position = position;
        this.height = height;
        this.weight = weight;
        this.hometown = hometown;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Height getHeight() {
        return height;
    }

    public void setHeight(Height height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

   
    @Override
    public String toString() {
        return "Number = " + number + '\n' +
                "Name = " + name + '\n' +
                "Position = " + position + '\'' +
                "Height = " + height + '\n' +
                "Weight = " + weight + '\n' +
                "Hometown = " + hometown + '\n';
    }
}

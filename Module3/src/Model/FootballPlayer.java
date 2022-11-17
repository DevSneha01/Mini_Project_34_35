package Model;

import java.util.ArrayList;

public class FootballPlayer extends Person implements TableMember {

    private int number;
    private String position;

    
    public FootballPlayer() {
        number = 0;
        position = "";
    }

    public FootballPlayer(int number, String name, String position, Height height,
                          int weight, String hometown, String highSchool) {
        super(name, height, weight, hometown, highSchool);
        this.number = number;
        this.position = position;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    
    @Override
    public String toString() {
        return super.toString() +
                "Number = " + number + '\n' +
                "Position = " + position + '\n';
    }

    
    @Override
   
    public String getAttribute(int n) {
        switch (n) {
            case 0 -> {
                return super.getName();
            }
            case 1 -> {
                return "" + super.getHeight();
            }
            case 2 -> {
                return "" + super.getWeight();
            }
            case 3 -> {
                return super.getHometown();
            }
            case 4 -> {
                return super.getHighSchool();
            }
            case 5 -> {
                return "" + getNumber();
            }
            case 6 -> {
                return getPosition();
            }
            default -> {
                return null;
            }
        }
    }

    @Override
    public ArrayList<String> getAttributes() {
        ArrayList<String> A = new ArrayList<String>();
        A.add(super.getName());
        A.add("" + super.getHeight());
        A.add("" + super.getWeight());
        A.add(super.getHometown());
        A.add(super.getHighSchool());
        A.add("" + getNumber());
        A.add(getPosition());

        return A;
    }

    @Override
    public String getAttributeName(int n) {
        switch (n) {
            case 0 -> {
                return "name";
            }
            case 1 -> {
                return "height";
            }
            case 2 -> {
                return "weight";
            }
            case 3 -> {
                return "hometown";
            }
            case 4 -> {
                return "highSchool";
            }
            case 5 -> {
                return "number";
            }
            case 6 -> {
                return "position";
            }
            default -> {
                return null;
            }
        }
    }

   
    @Override
    public ArrayList<String> getAttributeNames() {
        ArrayList<String> A = new ArrayList<String>();
        A.add("name");
        A.add("height");
        A.add("weight");
        A.add("hometown");
        A.add("highSchool");
        A.add("number");
        A.add("position");

        return A;
    }
}

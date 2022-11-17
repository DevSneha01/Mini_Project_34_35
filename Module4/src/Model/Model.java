package Model;

import java.util.ArrayList;

public class Model {

    private FootballPlayerData fpData = new FootballPlayerData();

    public Model() {
        System.out.println("=============================================================");

        System.out.println("The Table Size is " + fpData.getTable().size());

        System.out.println("=============================================================");

        this.displayArray(fpData.getHeaders());
       
        this.displayArray(fpData.getLine(4));

        System.out.println("=============================================================");

    
        this.displayArray(fpData.getHeaders());
      
        this.displayArray(fpData.getLine(121));

        System.out.println("=============================================================");

        this.displayArrayOfArrays(fpData.getLines(70, 72));
        System.out.println("=============================================================");

        this.displayArrayOfArrays(fpData.getLines(100, 101));

        System.out.println("=============================================================");
        System.out.println("=============================================================");

        System.out.println("The Table Size is " + fpData.getTable().size());
    }

    public void displayArrayOfArrays(ArrayList<ArrayList<String>> manyLines) {
        for (int i = 0; i < manyLines.size(); i++) {
            displayArray(manyLines.get(i));
        }
    }

    public void displayArray(ArrayList<String> oneLineOnly) {
        for (int k = 0; k < oneLineOnly.size(); k++) {
            System.out.print(oneLineOnly.get(k));
            System.out.print(" ");
        }
        System.out.println("");
    }

    public FootballPlayerData getFpData() {
        return fpData;
    }

    public void setFpData(FootballPlayerData fpData) {
        this.fpData = fpData;
    }
}
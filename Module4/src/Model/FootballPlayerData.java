package Model;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.io.*;

public class FootballPlayerData implements TableData {

    private ArrayList<FootballPlayer> players;

  
    public FootballPlayerData() {
        players = new ArrayList<>();
       
        loadTable();
    }

    public void ReadPlayersFromXML() {
        try {
            FootballPlayer fp;
            XMLDecoder decoder;
            decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream("FootballPlayerTable.xml")));
            fp = new FootballPlayer();
            while (fp != null) {
                try {
                    fp = (FootballPlayer) decoder.readObject();
                    players.add(fp);
                } catch (ArrayIndexOutOfBoundsException theend) {
                    break;
                }
            }
            decoder.close();
        } catch (Exception xx) {
            xx.printStackTrace();
        }
    }

    
    @Override
    public void loadTable() {
        
        ReadPlayersFromXML();
    }

    @Override
    public ArrayList<FootballPlayer> getTable() {
        return players;
    }

    @Override
    public ArrayList<String> getHeaders() {
        FootballPlayer fp = new FootballPlayer();
        return fp.getAttributeNames();
    }

  
    @Override
    public ArrayList<String> getLine(int line) {
        return players.get(line).getAttributes();
    }

    @Override
    public ArrayList<ArrayList<String>> getLines(int firstLine, int lastLine) {
        ArrayList<ArrayList<String>> A = new ArrayList<ArrayList<String>>();


        for (int i = firstLine; i <= lastLine; i++) {
            A.add(getLine(i));
        }
        return A;
    }
}

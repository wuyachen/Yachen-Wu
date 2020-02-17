
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read{
    private final int AUTOMOBILE_COUNT,INJURY_COUNT,FATAL_COUNT,SCHOOL_ZONE;
    private final int COLLISION_TYPE,CURVED_ROAD,DEER_RELATED,VHICLE_COUNT;
    private final float DEC_LAT,DEC_LONG;
    private float score;



    public float getScore() {
        return score;
    }

    public int getAUTOMOBILE_COUNT(){
        return AUTOMOBILE_COUNT;
    }

    public int getINJURY_COUNT(){
        return INJURY_COUNT;
    }

    public int getFATAL_COUNT(){
        return FATAL_COUNT;
    }

    public int getSCHOOL_ZONE(){
        return SCHOOL_ZONE;
    }
 
    public int getCOLLISION_TYPE(){
        return COLLISION_TYPE;
    }

    public int getCURVED_ROAD(){
        return CURVED_ROAD;
    }

    public int getCURVED_ROAD(){
        return CURVED_ROAD;
    }

    public int getDEER_RELATED(){
        return DEER_RELATED;
    }

    public int getVHICLE_COUNT(){
        return VHICLE_COUNT;
    }

    public float getDEC_LAT(){
        return DEC_LAT;
    }

    public float getDEC_LONG(){
        return DEC_LONG;
    }

    public void setScore(float s) {
        this.score = s;
    }

    private static accident createarray(String[] metadata) { 
        String name = metadata[0]; 
        int price = Integer.parseInt(metadata[1]); 
        String author = metadata[2]; 
        // create and return book of this metadata 
        return new accident(name, price, author); } } 
        
    public static void main(String[] args) {

        String csvFile = "database";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                String[] country = line.split(cvsSplitBy);
                System.out.println("Country [COLLISION_TYPE=" + country[13] + ",VHICLE_COUNT=" + country[23] + "INJURY_COUNT=" + country[33] + " CURVED_ROAD=" + country[1] + "LATITUDE=" + country[63] + " LONGITUDE=" + country[64] + "  DEER_RELATED=" + country[65] + "AUTOMOBILE_COUNT= " + country[24] + " , FATAL_COUNT=" + country[32] + "]");

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

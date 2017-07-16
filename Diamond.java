import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by mhz on 16/07/17.
 */
public class Diamond {

    private List<String> alphabets = Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z");

    public void diamondPrint(String c){

        int index = alphabets.indexOf(c);
        int size = ((index+1)*2)-1;
        String [][] grid = new String[size][size];
        int middle;

        if(size%2==0){
            middle = size/2;
        }
        else{
            middle= (size/2)+1;
        }

        //completing the first half of the diamond
        for(int i=0;i<middle;i++){
            if(i==0){
                grid[i][middle+i-1] = alphabets.get(i);
            }
            else{
                grid[i][middle+i-1] = alphabets.get(i);
                grid[i][middle-i-1] = alphabets.get(i);
            }
        }

        //completing the second half of the diamond
        int counter =2;
        for(int i=middle;i<size;i++){
            for (int j=0;j<size;j++){
                grid[i][j] = grid[i-counter][j];
            }
            counter+=2;
        }

        //print diamond
        String s = "";
        for (int i=0;i<size;i++){
            for (int j=0; j<size;j++){
                if(grid[i][j] == null){
                    s=" "+s;
                }
                else{
                    s=grid[i][j]+s;
                }
            }
            System.out.println(s);
            s="";
        }
    }

    public List<String> getAlphabets() {
        return alphabets;
    }

    public void setAlphabets(List<String> alphabets) {
        this.alphabets = alphabets;
    }
}

package kata2;

import java.util.HashMap;
import java.util.Map;

public class KATA2 {

    public static void main(String[] args) {
        String  [] data   = {"Rosa", "Pepe", "Juan", "Pepe", "Pepe", "Rosa"};
        Map<Integer,Integer> histogram = new HashMap<>();
        Histogram histo= new Histogram(data);
        Map<String,Integer> histogr= histo.getHistogram();
        
        for(String key:histogr.keySet()){
            System.out.println(key + " ==>" + histogr.get(key) + "veces");
        }
    }
    
}

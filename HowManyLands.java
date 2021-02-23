/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package howmanylands;

import java.io.IOException;
import java.util.HashMap;

/**
 *
 * @author natha_000
 */
public class HowManyLands {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        GUI myFrame = new GUI();
        JSONReader jsonReader = new JSONReader();
        HashMap<String, Double> cardList = jsonReader.convertJSONToHashMap();
        System.out.println(cardList.get("Kolaghan's Command"));
    }
    
}

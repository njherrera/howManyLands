package howmanylands;

import com.google.gson.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class JSONReader {

    public String filePathToJSON = "C:/Users/natha_000/Downloads/AtomicCards.json";

    public HashMap<String, Double> convertJSONToHashMap() throws FileNotFoundException {
        Reader myReader = new FileReader(filePathToJSON);
        JsonObject obj = JsonParser.parseReader(myReader).getAsJsonObject();
        JsonObject data = obj.getAsJsonObject("data");
        Set<Map.Entry<String, JsonElement>> entrySet = data.entrySet();
        Set<String> keys = data.keySet();
        HashMap<String, Double> cardMap = new HashMap<String, Double>();
        for (String str : keys){
            JsonArray cardInfoArray = data.getAsJsonArray(str);
            JsonObject infoArrayJson = (JsonObject) cardInfoArray.get(0);
            String CMC = infoArrayJson.get("convertedManaCost").toString();
            cardMap.put(str, Double.parseDouble(CMC));
        }
        return cardMap;

    }
}

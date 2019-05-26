package json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import db.pojo.GeneralSet;


public class JsonGenerator {

    private static Gson gson = new GsonBuilder().setPrettyPrinting().create();



    public String createJson(GeneralSet generalSet) {
        String json = gson.toJson(generalSet);
        return json;
    }
}

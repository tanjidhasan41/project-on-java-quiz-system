import netscape.javascript.JSObject;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreateUser {

    public static void main(String[] args) throws IOException, ParseException {

        String filepath="./src/main/resources/users.json";
        JSONParser parser= new JSONParser();
        JSONArray jsonArray = (JSONArray) parser.parse(new FileReader(filepath));

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("username","tanjid");
        jsonObject.put("password","1234");
        jsonObject.put("role","student");

        jsonArray.add(jsonObject);

        System.out.println(jsonArray);

        FileWriter writer = new FileWriter(filepath);
        writer.write(jsonArray.toJSONString());
        writer.flush();
        writer.close();

    }

}

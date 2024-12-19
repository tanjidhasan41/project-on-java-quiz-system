import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Admin {

    public void adminPortal() throws IOException, ParseException {

        Scanner scanner = new Scanner(System.in);

        String filepath1="./src/main/resources/quiz.json";
        JSONParser parser= new JSONParser();
        JSONArray jsonArray = (JSONArray) parser.parse(new FileReader(filepath1));

        while (true)
        {
            System.out.println("Input your question");
            String question = scanner.nextLine();

            System.out.println("Input option 1:");
            String option1 = scanner.nextLine();

            System.out.println("Input option 2:");
            String option2 = scanner.nextLine();

            System.out.println("Input option 3:");
            String option3 = scanner.nextLine();

            System.out.println("Input option 4:");
            String option4 = scanner.nextLine();

            System.out.println("What is the answer key?");
            String answerKey = scanner.nextLine();

            JSONObject questionObj = new JSONObject();
            questionObj.put("question", question);
            questionObj.put("option 1", option1);
            questionObj.put("option 2", option2);
            questionObj.put("option 3", option3);
            questionObj.put("option 4", option4);
            questionObj.put("answerkey", answerKey);

            jsonArray.add(questionObj);

            System.out.println("Saved successfully! Do you want to add more questions? (press s for start and q for quit)");
            String press = scanner.nextLine();

            if (press.equalsIgnoreCase("q"))
            {
                break;
            }
        }

        FileWriter writer = new FileWriter(filepath1);
        writer.write(jsonArray.toJSONString());
        writer.flush();
        writer.close();

    }

}

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Student {

    public void studentPortal() throws IOException, ParseException {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String filepath1 = "./src/main/resources/quiz.json";
        JSONParser parser = new JSONParser();
        JSONArray jsonArray = (JSONArray) parser.parse(new FileReader(filepath1));

        while (true) {
            int count = 0;
            HashSet<Integer> hashSet = new HashSet<>();

            System.out.println("We will throw you 10 questions.");
            System.out.println("Each MCQ mark is 1 and no negative marking. Are you ready? Press 's' for start.");

            if (!scanner.nextLine().equalsIgnoreCase("s")) {
                return;
            }
            for (int i = 0; i < 10; i++) {
                int randomIndex;
                do {
                    randomIndex = random.nextInt(jsonArray.size());
                } while (hashSet.contains(randomIndex));

                hashSet.add(randomIndex);

                JSONObject jsonObject = (JSONObject) jsonArray.get(randomIndex);
                System.out.println("[Question " + (i + 1) + "] " + jsonObject.get("question"));
                System.out.println("1. " + jsonObject.get("option 1"));
                System.out.println("2. " + jsonObject.get("option 2"));
                System.out.println("3. " + jsonObject.get("option 3"));
                System.out.println("4. " + jsonObject.get("option 4"));

                int answer = Integer.parseInt(scanner.nextLine());

                if (answer == Integer.parseInt(jsonObject.get("answerkey").toString())) {
                    count++;
                }

            }
            showResult(count);

            System.out.println("Would you like to start again? Press 's' for start or 'q' for quit.");
            String press = scanner.nextLine();

            if (press.equalsIgnoreCase("q")) {
                break;
            }

        }

    }

    public static void showResult(int count) {
        if (count >= 8) {
            System.out.println("Excellent! You have got " + count + " out of 10");
        } else if (count >= 5) {
            System.out.println("Good. You have got " + count + " out of 10");
        } else if (count >= 2) {
            System.out.println("Very poor! You have got " + count + " out of 10");
        } else {
            System.out.println("Very sorry you are failed. You have got " + count + " out of 10");
        }
    }

}

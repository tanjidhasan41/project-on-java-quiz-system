import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Login {

    public static void main(String[] args) throws IOException, ParseException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your username");
        String username = scanner.next();

        System.out.println("Enter password");
        String password = scanner.next();

        String filepath = "./src/main/resources/users.json";
        JSONParser parser = new JSONParser();
        JSONArray jsonArray = (JSONArray) parser.parse(new FileReader(filepath));

        for (Object obj : jsonArray) {
            JSONObject jsonObject = (JSONObject) obj;

            if (jsonObject.get("username").equals(username) && jsonObject.get("password").equals(password)) {
                String role = jsonObject.get("role").toString();
                if (role.equals("admin")) {
                    System.out.println("Welcome admin! Please create new questions in the question bank.");
                    Admin admin = new Admin();
                    admin.adminPortal();
                } else if (role.equals("student")) {
                    System.out.println("Welcome " + username + " to the quiz!");
                    Student student = new Student();
                    student.studentPortal();
                }

            }
        }

    }

}

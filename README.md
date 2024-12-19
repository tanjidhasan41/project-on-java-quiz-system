# Project Description

This software system enables a role-based experience for managing and participating in quizzes. It provides two user roles: ***Admin*** and ***Student***. The functionality is as follows:

**Admin Role:**

- Admin can log in using admin credentials.
- Admin can create, edit, and save multiple MCQs in a ```quiz.json``` file with 4 options and an answer key.
- The system allows adding new questions until the admin decides to quit.

**Student Role:**

- Students can log in using their credentials.
- Students can take an MCQ quiz from the question bank stored in ```quiz.json```.
- The system randomly generates 10 questions from the quiz bank for each session.
- After completing the quiz, the system evaluates the answers and displays the result based on the number of correct answers.

# Prerequisites

- Basic understanding of Java programming language.
- Java Development Kit (JDK) installed on your machine.
- A text editor or IDE (e.g., IntelliJ IDEA, Eclipse, or VS Code).

**Files:**

- ```users.json```: Contains the login credentials and roles for both admin and students.
- ```quiz.json```: Stores the questions, options, and answer keys added by the admin.

# What I Have Done

**Implemented the Admin Login feature:**

- Admin can input questions interactively with options and answer keys.
- Questions are saved into ```quiz.json```.
- Allows the admin to continuously add questions until they choose to quit by pressing ```'q'```.

**Implemented the Student Login feature:**

- Students are welcomed with an instruction prompt.
- Randomly selects 10 questions from ```quiz.json``` for the quiz session.
- Evaluates the student’s answers and calculates the score.

**Created a scoring system with feedback:**

- 8-10 marks: Excellent!
- 6-7 marks: Good.
- 3-5 marks: Very poor.
- 0-2 marks: Very sorry, you are failed.

**Ensured user-friendly prompts for both admin and students.**

# How to Run the Tests

- Clone or download the project repository to your local machine.
- Ensure ```users.json``` and ```quiz.json``` are in the same directory as your Java program.
- Run the program using your preferred IDE or the terminal.

## Admin Test:

- Log in using the credentials from ```users.json``` (username: ```admin```, password: ```1234```).
- Add questions with prompts.

**Sample Video**
https://github.com/user-attachments/assets/51f8a0a1-5f52-4334-a356-459a1a90e09d

## Student Test:

- Log in using the credentials from ```users.json``` (username: ```tanjid```, password: ```1234```).
- Start the quiz by pressing ```'s'``` when prompted.
- Answer the questions interactively.
- View the result after completing the quiz.

**Sample Video**
https://github.com/user-attachments/assets/4ccd275b-2889-4574-94c1-fcde067d3077


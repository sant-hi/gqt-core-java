package com.gqt.corejava.Strings;
import java.util.Scanner;
		class Question {
		    // === INSTANCE VARIABLES ===
		    String question;
		    String[] options = new String[4];
		    char correctOption;

		    // === INSTANCE METHOD to set values ===
		    void setValues(String qText, String opt1, String opt2, String opt3, String opt4, char correct) {
		        question = qText;
		        options[0] = opt1;
		        options[1] = opt2;
		        options[2] = opt3;
		        options[3] = opt4;
		        correctOption = correct;
		    }

		    // Display available options
		    void displayOptions() {
		        char label = 'A';
		        for (String opt : options) {
		            if (opt != null && !opt.isEmpty()) {
		                System.out.println(label + ") " + opt);
		            }
		            label++;
		        }
		    }

		    // Apply 50-50 lifeline
		    void apply5050() {
		        int correctIndex = correctOption - 'A';
		        int removed = 0;
		        for (int i = 0; i < 4 && removed < 2; i++) {
		            if (i != correctIndex && options[i] != null) {
		                options[i] = "";
		                removed++;
		            }
		        }
		    }

		    // Show fixed audience poll
		    void displayAudiencePoll() {
		        for (int i = 0; i < 4; i++) {
		            char label = (char) ('A' + i);
		            if (label == correctOption) {
		                System.out.println(label + ": 65%");
		            } else {
		                System.out.println(label + ": 12%");
		            }
		        }
		    }
		}

		public class Project2 {
		    // === STATIC VARIABLES ===
		    static int[] prizeLevels = { 1000, 2000, 3000, 5000, 10000, 20000, 40000, 80000, 160000, 10000000 };
		    static boolean used5050 = false;
		    static boolean usedAudience = false;

		    public static void main(String[] args) {
		        // === LOCAL VARIABLES ===
		        Scanner sc = new Scanner(System.in);
		        int currentPrize = 0;

		        // === OBJECTS ===
		        Question[] questions = new Question[10];

		        // === CREATING OBJECTS AND SETTING DATA WITHOUT CONSTRUCTORS ===
		        for (int i = 0; i < 10; i++) {
		            questions[i] = new Question(); // default constructor
		        }

		        // Set values using method instead of constructor
		        questions[0].setValues("Q1: What is the capital of India?", "Mumbai", "New Delhi", "Kolkata", "Chennai", 'B');
		        questions[1].setValues("Q2: Who wrote the national anthem of India?", "Rabindranath Tagore", "Bankim Chandra Chatterjee", "Allama Iqbal", "Subramania Bharati", 'A');
		        questions[2].setValues("Q3: Which planet is known as the Red Planet?", "Venus", "Mars", "Jupiter", "Saturn", 'B');
		        questions[3].setValues("Q4: What is H2O commonly called?", "Salt", "Water", "Oxygen", "Hydrogen", 'B');
		        questions[4].setValues("Q5: Which is the largest continent by area?", "Africa", "Asia", "Europe", "Antarctica", 'B');
		        questions[5].setValues("Q6: Which language is primarily used for Android development?", "Kotlin", "Swift", "Ruby", "PHP", 'A');
		        questions[6].setValues("Q7: What is the boiling point of water at sea level (in Celsius)?", "90", "80", "100", "212", 'C');
		        questions[7].setValues("Q8: Who is known as the father of computers?", "Albert Einstein", "Charles Babbage", "Isaac Newton", "Nikola Tesla", 'B');
		        questions[8].setValues("Q9: What is the value of pi (approx)?", "2.14", "3.14", "4.14", "1.14", 'B');
		        questions[9].setValues("Q10: Which gas do plants absorb from the atmosphere?", "Oxygen", "Nitrogen", "Carbon Dioxide", "Helium", 'C');

		        System.out.println("Welcome to Millionaire Show!");
		        System.out.println("Use 'L' for lifeline, 'Q' to quit.\n");

		        // === MAIN GAME LOOP ===
		        for (int i = 0; i < questions.length; i++) {
		            Question q = questions[i];
		            System.out.println("---- Question " + (i + 1) + " (Rs." + prizeLevels[i] + ") ----");

		            boolean answered = false;

		            while (!answered) {
		                System.out.println("\nCurrent secured prize: Rs." + currentPrize);
		                System.out.print("Available lifelines: ");
		                if (!used5050) System.out.print("50-50 ");
		                if (!usedAudience) System.out.print("Audience Poll ");
		                if (used5050 && usedAudience) System.out.print("None");
		                System.out.println();

		                System.out.println(q.question);
		                q.displayOptions();

		                System.out.print("Enter answer (A/B/C/D), 'L' for lifeline, 'Q' to quit: ");
		                String input = sc.next().trim().toUpperCase();

		                if (input.equals("Q")) {
		                    System.out.println("\u001B[38;2;128;0;128mGame Finished!\u001B[0m");
		                    System.out.println("You chose to quit. You take home Rs." + currentPrize);
		                    sc.close();
		                    return;
		                } else if (input.equals("L")) {
		                    if (used5050 && usedAudience) {
		                        System.out.println("No lifelines left.");
		                    } else {
		                        System.out.println("Choose lifeline:");
		                        if (!used5050) System.out.println("1) 50-50");
		                        if (!usedAudience) System.out.println("2) Audience Poll");
		                        System.out.print("Your choice: ");
		                        String lifeline = sc.next().trim();

		                        if (lifeline.equals("1") && !used5050) {
		                            used5050 = true;
		                            q.apply5050();
		                            System.out.println("50-50 applied. Two wrong options removed.");
		                        } else if (lifeline.equals("2") && !usedAudience) {
		                            usedAudience = true;
		                            q.displayAudiencePoll();
		                        } else {
		                            System.out.println("Invalid lifeline choice.");
		                        }
		                    }
		                } else if (input.matches("[ABCD]")) {
		                    char answer = input.charAt(0);
		                    int index = answer - 'A';
		                    if (q.options[index] == null || q.options[index].isEmpty()) {
		                        System.out.println("Option not available. Try again.");
		                    } else {
		                        answered = true;
		                        if (answer == q.correctOption) {
		                            currentPrize = prizeLevels[i];
		                            System.out.println("\u001B[38;2;0;200;0mCorrect! You won Rs." + currentPrize + "\u001B[0m");
		                        } else {
		                            int awarded = 0;
		                            if (i <= 4) {
		                                awarded = 0;
		                            } else if (i == 5 || i == 6) {
		                                awarded = prizeLevels[4];
		                            } else {
		                                awarded = prizeLevels[6];
		                            }
		                            System.out.println("\u001B[38;2;255;0;0mSorry! Wrong answer.\u001B[0m");
		                            System.out.println("Correct answer was: " + q.correctOption);
		                            System.out.println("\u001B[38;2;128;0;128mGame Finished !\u001B[0m");
		                            System.out.println("You take home Rs." + awarded);
		                            sc.close();
		                            return;
		                        }
		                    }
		                } else {
		                    System.out.println("Invalid input. Use A/B/C/D, L, or Q.");
		                }
		            }

		            System.out.println();
		        }

		        System.out.println("\u001B[38;2;128;0;128mGame Finished.\nCongratulations! You are a Millionaire and won Rs." + currentPrize + "!\u001B[0m");
		    }
}

package com.gqt.corejava.Strings;
import java.util.Scanner;

public class  Project1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] q = { "1: What is the capital of India?",
        		"2: Who wrote the national anthem of India?",
        		"3: Which planet is known as the Red Planet?",
        		"4: What is H2O commonly called?",
        		"5: Which is the largest continent by area?",
        		"6: Which language is primarily used for Android development?",
        		"7: What is the boiling point of water at sea level (in Celsius)?",
                "8: Who is known as the father of computers?",
                "9: What is the value of pi (approx)?",
                "10: Which gas do plants absorb from the atmosphere?"};

        String[][] opt = {{ "Mumbai", "New Delhi", "Kolkata", "Chennai" },
            { "Rabindranath Tagore", "Bankim Chandra Chatterjee", "Allama Iqbal", "Subramania Bharati" },
            { "Venus", "Mars", "Jupiter", "Saturn" },
            { "Salt", "Water", "Oxygen", "Hydrogen" },
            { "Africa", "Asia", "Europe", "Antarctica" },
            { "Kotlin", "Swift", "Ruby", "PHP" },
            { "90", "80", "100", "212" },
            { "Albert Einstein", "Charles Babbage", "Isaac Newton", "Nikola Tesla" },
            { "2.14", "3.14", "4.14", "1.14" },
            { "Oxygen", "Nitrogen", "Carbon Dioxide", "Helium" }};

        char[] correctAnswers = { 'B', 'A', 'B', 'B', 'B', 'A', 'C', 'B', 'B', 'C' };
        int[] MoneyWin = { 1000, 2000, 3000, 5000, 10000, 20000, 40000, 80000, 160000, 10000000 };

        int currentMoney = 0;
       
        System.out.println("*********Welcome to Millionaire Show************");
        System.out.println();
        System.out.println("!!!Instructions!!!");
        System.out.println();
        System.out.println("1.You can use two lifelines \n 1.50-50 \n 2.AudiencePoll");
        System.out.println("2.To choose the lifeline type 'L'");
        System.out.println("3.To quit the game type 'Q'");
        System.out.println("4.To answer the questions type A, B, C, or D.");
        System.out.println();
        boolean AudiencePoll=false;
        boolean fiftyfifty=false;
        for (int i = 0; i < q.length; i++) {
        	System.out.println();
            System.out.println(" Question " + (i + 1));

            String[] temp = new String[4];
            for (int j = 0; j < 4; j++) {
               temp[j] = opt[i][j];
            }

            boolean doneans = false;
            while (doneans==false) {
                System.out.println();
                System.out.println("Amount secured : Rs." + currentMoney);
                System.out.println();
              
                System.out.println(q[i]);
                char o = 'A';
                for (int k = 0; k < 4; k++) {
                	if (temp[k] != null && temp[k].length() > 0) {
                        System.out.println(o + ") " + temp[k]);
                    }
                    o++;
                }
               
                System.out.println();
                System.out.print("Lifelines Left: ");
                if (fiftyfifty == false || AudiencePoll == false) {
                    if (fiftyfifty == false) {
                        System.out.print("1.50-50  ");
                    }
                    if (AudiencePoll == false) {
                        System.out.print("2.Audience Poll  ");
                    }
                } else {
                    System.out.print("!!!NO LIFELINE LEFT!!!");
                }
                System.out.println();

                System.out.println("Enter answer (A/B/C/D)(L/Q): ");
                String userInput = sc.next().toUpperCase();

                if (userInput.equals("Q")) {
                	System.out.println("\u001B[38;2;128;0;128mGame Finished!\u001B[0m");
                	System.out.println();
                    System.out.println("Good Decision. You will get Rs." + currentMoney + ". Thanks for playing!");
                    sc.close();
                   return;
                } else if (userInput.equals("L")) {
                    if (fiftyfifty==true && AudiencePoll==true) {
                        System.out.println("No lifelines left.");
                    } else {
                        System.out.println("Choose the lifeline:");
                        if (fiftyfifty==false) {
                            System.out.println("1) 50-50");
                        }      
                        if (AudiencePoll==false) {
                            System.out.println("2) Audience Poll");
                        }
                        System.out.print("Choose your choice: ");
                        String choice = sc.next(); 
                        if (choice.equals("1") && fiftyfifty == false) {
                            fiftyfifty = true; 
                            
                            
                            int correctAnsIndex = 0;
                            
                            if (correctAnswers[i] == 'A') {
                            	correctAnsIndex = 0;
                            } else if (correctAnswers[i] == 'B') {
                            	correctAnsIndex = 1;
                            } else if (correctAnswers[i] == 'C') {
                            	correctAnsIndex = 2;
                            } else if (correctAnswers[i] == 'D') {
                            	correctAnsIndex = 3;
                            }

                            int wrongAnsRemove = 0;

                            for (int k = 0; k < 4 && wrongAnsRemove < 2; k++) {
                                if (k == correctAnsIndex) {
                                } else {
                                    temp[k] = ""; 
                                    wrongAnsRemove++;
                                }
                            }
                        

                            System.out.println("Two wrong options removed.");
                        }
                        
                  
                    else if (choice.equals("2") && AudiencePoll==false) {
                        	AudiencePoll = true;
                            System.out.println("Audience Poll results:");
                            for (int k = 0; k < 4; k++) {
                                char optl = (char) ('A' + k);
                                if (optl == correctAnswers[i]) {
                                    System.out.println(optl + ": 73%");
                                } else {
                                    System.out.println(optl + ": 17%");
                                }
                            }
                        } else {
                            System.out.println("Lifeline already used.");
                        }
                    }
                } else {
                    char userAnswer = userInput.charAt(0);

                    if ((userAnswer == 'A' || userAnswer == 'B' || userAnswer == 'C' || userAnswer == 'D')) {
                        int inputToIdx = userAnswer - 'A';

                        if (temp[inputToIdx] == null || temp[inputToIdx].length() == 0) {
                            System.out.println("NOT Available");
                        } else {
                            doneans = true;
                            if (userAnswer == correctAnswers[i]) {
                                currentMoney = MoneyWin[i];
                                System.out.println("\u001B[38;2;0;200;0mCorrect! You won Rs." + currentMoney + "\u001B[0m");
                                System.out.println("-------------------------------");
                            } else {
                                int redusedMOney = 0;
                                if (i <= 4) {
                                	redusedMOney = 0;
                                } else if (i == 5 || i == 6) {
                                	redusedMOney = MoneyWin[4];
                                } else {
                                	redusedMOney = MoneyWin[6];
                                }
                                System.out.println("\u001B[38;2;255;0;0mSorry! Wrong answer.\u001B[0m");
                                System.out.println("Correct answer was: " + correctAnswers[i]);
                                System.out.println("\u001B[38;2;128;0;128mGame Finished !\u001B[0m");
                                System.out.println("You take home Rs." + redusedMOney);
                                sc.close();
                                return;
                            }
                        }
                    } else {
                        System.out.println("Invalid");
                    }
                }

            }

            System.out.println();
        }

        System.out.println("\u001B[38;2;128;0;128mGame Finished. \n Congratulations! You answered all questions correctly and are a Millionaire of Rs." + currentMoney + "!\u001B[0m");    }
}

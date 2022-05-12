//make sure text files are inside project folder!
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Arrays;

public class APVocabQuizGenerator {

    //holds Spanish answers, to be printed out after
    private static ArrayList<String> answers = new ArrayList();
    private static int questionNum = 1;
    public static void main(String args[]) {
        //takes care of all instances of the APVocabList class
        ArrayList<String>A1ew = new ArrayList();
        ArrayList<String> A1sw = new ArrayList();
        createWordLists("A1.txt", A1ew, A1sw);
        APVocabList A1 = new APVocabList("A1", A1ew, A1sw);

        ArrayList<String> A2ew = new ArrayList();
        ArrayList<String> A2sw = new ArrayList();
        createWordLists("A2.txt", A2ew, A2sw);
        APVocabList A2 = new APVocabList("A2", A2ew, A2sw);

        ArrayList<String> A3ew = new ArrayList();
        ArrayList<String> A3sw = new ArrayList();
        createWordLists("A3.txt", A3ew, A3sw);
        APVocabList A3 = new APVocabList("A3", A3ew, A3sw);

        ArrayList<String> A4ew = new ArrayList();
        ArrayList<String> A4sw = new ArrayList();
        createWordLists("A4.txt", A4ew, A4sw);
        APVocabList A4 = new APVocabList("A4", A4ew, A4sw);

        ArrayList<String> A5ew = new ArrayList();
        ArrayList<String> A5sw = new ArrayList();
        createWordLists("A5.txt", A5ew, A5sw);
        APVocabList A5 = new APVocabList("A5", A5ew, A5sw);

        ArrayList<String> A6ew = new ArrayList();
        ArrayList<String> A6sw = new ArrayList();
        createWordLists("A6.txt", A6ew, A6sw);
        APVocabList A6 = new APVocabList("A6", A6ew, A6sw);

        ArrayList<String> A7ew = new ArrayList();
        ArrayList<String> A7sw = new ArrayList();
        createWordLists("A7.txt", A7ew, A7sw);
        APVocabList A7 = new APVocabList("A7", A7ew, A7sw);

        ArrayList<String> B1ew = new ArrayList();
        ArrayList<String> B1sw = new ArrayList();
        createWordLists("B1.txt", B1ew, B1sw);
        APVocabList B1 = new APVocabList("B1", B1ew, B1sw);

        ArrayList<String> B2ew = new ArrayList();
        ArrayList<String> B2sw = new ArrayList();
        createWordLists("B2.txt", B2ew, B2sw);
        APVocabList B2 = new APVocabList("B2", B2ew, B2sw);

        ArrayList<String> B3ew = new ArrayList();
        ArrayList<String> B3sw = new ArrayList();
        createWordLists("B3.txt", B3ew, B3sw);
        APVocabList B3 = new APVocabList("B3", B3ew, B3sw);

        ArrayList<String> B4ew = new ArrayList();
        ArrayList<String> B4sw = new ArrayList();
        createWordLists("B4.txt", B4ew, B4sw);
        APVocabList B4 = new APVocabList("B4", B4ew, B4sw);

        ArrayList<String> B5ew = new ArrayList();
        ArrayList<String> B5sw = new ArrayList();
        createWordLists("B5.txt", B5ew, B5sw);
        APVocabList B5 = new APVocabList("B5", B5ew, B5sw);

        ArrayList<String> B6ew = new ArrayList();
        ArrayList<String> B6sw = new ArrayList();
        createWordLists("B6.txt", B6ew, B6sw);
        APVocabList B6 = new APVocabList("B6", B6ew, B6sw);

        ArrayList<String> C1ew = new ArrayList();
        ArrayList<String> C1sw = new ArrayList();
        createWordLists("C1.txt", C1ew, C1sw);
        APVocabList C1 = new APVocabList("C1", C1ew, C1sw);

        ArrayList<String> C2ew = new ArrayList();
        ArrayList<String> C2sw = new ArrayList();
        createWordLists("C2.txt", C2ew, C2sw);
        APVocabList C2 = new APVocabList("C2",C2ew, C2sw);

        ArrayList<String> C3ew = new ArrayList();
        ArrayList<String> C3sw = new ArrayList();
        createWordLists("C3.txt", C3ew, C3sw);
        APVocabList C3 = new APVocabList("C3",C3ew, C3sw);

        ArrayList<String> C4ew = new ArrayList();
        ArrayList<String> C4sw = new ArrayList();
        createWordLists("C4.txt", C4ew, C4sw);
        APVocabList C4 = new APVocabList("C4",C4ew, C4sw);

        ArrayList<String> C5ew = new ArrayList();
        ArrayList<String> C5sw = new ArrayList();
        createWordLists("C5.txt", C5ew, C5sw);
        APVocabList C5 = new APVocabList("C5",C5ew, C5sw);

        ArrayList<String> C6ew = new ArrayList();
        ArrayList<String> C6sw = new ArrayList();
        createWordLists("C6.txt", C6ew, C6sw);
        APVocabList C6 = new APVocabList("C6",C6ew, C6sw);

        ArrayList<String> D1ew = new ArrayList();
        ArrayList<String> D1sw = new ArrayList();
        createWordLists("D1.txt", D1ew, D1sw);
        APVocabList D1 = new APVocabList("D1",D1ew, D1sw);

        ArrayList<String> D2ew = new ArrayList();
        ArrayList<String> D2sw = new ArrayList();
        createWordLists("D2.txt", D2ew, D2sw);
        APVocabList D2 = new APVocabList("D2",D2ew, D2sw);

        ArrayList<String> D3ew = new ArrayList();
        ArrayList<String> D3sw = new ArrayList();
        createWordLists("D3.txt", D3ew, D3sw);
        APVocabList D3 = new APVocabList("D3",D3ew, D3sw);

        ArrayList<String> D4ew = new ArrayList();
        ArrayList<String> D4sw = new ArrayList();
        createWordLists("D4.txt", D4ew, D4sw);
        APVocabList D4 = new APVocabList("D4",D4ew, D4sw);

        ArrayList<String> D5ew = new ArrayList();
        ArrayList<String> D5sw = new ArrayList();
        createWordLists("D5.txt", D5ew, D5sw);
        APVocabList D5 = new APVocabList("D5",D5ew, D5sw);

        ArrayList<String> D6ew = new ArrayList();
        ArrayList<String> D6sw = new ArrayList();
        createWordLists("D6.txt", D6ew, D6sw);
        APVocabList D6 = new APVocabList("D6",D6ew, D6sw);

        //collection all APVocabLists
        ArrayList<APVocabList> masterList = new ArrayList();
        masterList.add(A1);
        masterList.add(A2);
        masterList.add(A3);
        masterList.add(A4);
        masterList.add(A5);
        masterList.add(A6);
        masterList.add(A7);
        masterList.add(B1);
        masterList.add(B2);
        masterList.add(B3);
        masterList.add(B4);
        masterList.add(B5);
        masterList.add(B6);
        masterList.add(C1);
        masterList.add(C2);
        masterList.add(C3);
        masterList.add(C4);
        masterList.add(C5);
        masterList.add(C6);
        masterList.add(D1);
        masterList.add(D2);
        masterList.add(D3);
        masterList.add(D4);
        masterList.add(D5);
        masterList.add(D6);

        //now, let's prompt the user for the quiz they want!
        Scanner scan = new Scanner(System.in);

        ArrayList<APVocabList> whichLists = new ArrayList();

        ArrayList<String> vocabListUnitNames = new ArrayList();
        ArrayList<Integer> numWords = new ArrayList();

        String u;
        int n;

        while (true) {

            System.out.println("Introduzca el nombre de la unidad que quiere incluir.");
            System.out.println("Introduzca 0 cuando esté terminad@.");

            u = scan.nextLine();
            if (u.equals("0")) {
                break;
            }
            else {
                vocabListUnitNames.add(u);
            }

            System.out.println("¿Cuántas palabras de esta unidad?");

            n = scan.nextInt();
            numWords.add(n);

            /**
             * Revisit to include "while" statements so code
             * doesn't crash with invalid input
             */

            //why doesn't the code work without this line at the end?
            u = scan.nextLine();
        }

        //now we have vocabListUnitNames, the names of the units we're adding from
        //as well as numWords, the corresponding number of words from each unit


        /**
         * So now, let's determine which vocabLists we'd like to reference 
         * by checking to see which "name" instance variables align with the
         * Strings stored in vocabListUnitNames. Adds appropriate lists to "whichLists"
         */

        for (String str : vocabListUnitNames) {
            for (APVocabList apvl : masterList) {
                if (str.equals(apvl.getName())) {
                    whichLists.add(apvl);
                }
            }
        }

        //now, we have the vocabLists we're including in the quiz with whichLists
        //as well as the corresponding number of words for each list in numWords

        System.out.println("-----PREGUNTAS-----");
        //one for loop to reference printWordLists
        for (int i = 0; i < whichLists.size(); i++) {
            printUnitQuestions(whichLists.get(i), numWords.get(i));
        }

        System.out.println("\n-----RESPUESTAS-----");

        //for loop to print out each English word in "answers"

        for (String str : answers) {
            System.out.println(str);
        }
    }

    /**
     * randomly generates indices of words to print from each English list,
     * adds corresponding answer words from Spanish list to "answers" (to be printed later in main method)
     * prints words at those indices
     */
    public static void printUnitQuestions (APVocabList apvl, int num) { 
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            
            /** starts at index 0 **/
            int n = (int)(Math.random()*(apvl.getLength()) - 1);

            //generates a NEW random number as long as the current random number already exists in arr
            while (holds(arr, n)) {
                n = (int)(Math.random()*(apvl.getLength()) - 1);
            }
            arr[i] = n;
        }

        
        //now, arr holds all the indices of words we'd like to print out from apvl's ew, 
        //and all the indices of words whose words we want to add to "answers"

        //now, let's print the english words out, and add the words to "answers"
        for (int i = 0; i < arr.length; i++) {
            System.out.println(questionNum + ". " + apvl.getEnglishWords().get(arr[i]));
            answers.add(questionNum + ". " +apvl.getSpanishWords().get(arr[i]));
            questionNum++;
        }
    }

    //returns true if the int[] contains the int
    public static boolean holds(int[] a, int x) {
        int count = 0;
        for (int num : a) {
            if (num == x) {
                count++;
            }
        }
        return (count > 0);
    }

      public static void createWordLists(String fileName, ArrayList<String> ew, ArrayList<String> sw) {
        //puts all lines of text file into a temporary collection
        ArrayList<String> collection = new ArrayList();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            for (String curWord = reader.readLine(); curWord != null; curWord = reader.readLine()) {
                collection.add(curWord);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }

        //adds words from "collection" to their appropriate wordLists, according to language
        for (int i = 0; i < collection.size(); i++) {
            if (i%2 == 0) {
                sw.add(collection.get(i));
            }
            else {
                ew.add(collection.get(i));
            }
        }

    }
}
//convenient 
//se dice el pecado, pero no el pecador
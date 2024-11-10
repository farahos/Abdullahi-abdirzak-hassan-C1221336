import java.util.Scanner;

public class Vowellfrequency {
    //String word;


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         int[] Vowelcount= new int[5];

        String word;
       // Vowellfrequency myvowel = new Vowellfrequency();


            System.out.println("Enter the word");
            word = input.next();
            word.toLowerCase();

        //for(int i=0; i<myvowel.Vowelcount.length; i++){}
         for (char ch :word.toCharArray()) {
             switch (ch) {
                    case 'a':
                        Vowelcount[0]++;
                        break;
                    case 'e':
                        Vowelcount[1]++;
                        break;
                    case 'i':
                        Vowelcount[2]++;
                        break;
                    case 'o':
                        Vowelcount[3]++;
                        break;
                    case 'u':
                        Vowelcount[4]++;
                        break;
                    default:

                        break;
                }
            }
            System.out.println("Vowel frequencies:");
            System.out.println("a: " + Vowelcount[0]);
            System.out.println("e: " + Vowelcount[1]);
            System.out.println("i: " + Vowelcount[2]);
            System.out.println("o: " + Vowelcount[3]);
            System.out.println("u: " + Vowelcount[4]);


         }








    }





package Basic;

import java.util.Scanner;

public class Looping {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String name = "";

        char[] vowels = {'a', 'e', 'e', 'o', 'u'};

        char[] alph = new char[26];

        for(char c: vowels)
            System.out.print(c + " ");


        for(int i = 0; i < alph.length; i++)
            alph[i] = (char) (65 + i);

        for (char a: alph)
            System.out.print(a + " ");


        do {
            System.out.print("\nEnter your name: ");
            name = in.nextLine();
        } while(name.isBlank());

        System.out.println(name);

        int count = 0;

        for(int i = 0; i < name.length(); i++) {
            count++;    
        }

        System.out.println("There are " + count + " letter in your name");
        char[] arr = name.toCharArray();
        for (char c: arr) {
            System.out.println(c);
        }

        int rows, columns;

        String symbol = "";

        System.out.print("Enter # of rows: ");
        rows = Integer.parseInt(in.nextLine());
        System.out.print("Enter # of columns: ");
        columns = Integer.parseInt(in.nextLine());
        System.out.print("Enter Symbol: ");
        symbol = in.nextLine();

        for(int r = 0; r < rows; r++) {
            for(int c = 0; c < columns; c++)
                System.out.print(symbol);
            System.out.println();
        }

        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                matrix[i][j] = i + j;
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

            
        in.close();
    }
}
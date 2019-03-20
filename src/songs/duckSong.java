package songs;

import java.util.Scanner;


public class duckSong {

    public static void main(String[] args) {
        duckSong ducks = new duckSong();
        ducks.duckSing();
    }

    private void duckSing() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("How many ducks?");
        int ducks = myScanner.nextInt();

        if (ducks == 0) {
            System.out.println("No ducks? - that's a shame, I can't sing my song!");
        }
        if (ducks < 0) {
            System.out.println("Please be sensible, no negative ducks allowed");
        }
        String word = "ducks";
        if ( ducks == 1) {
            word = "duck";
        }

        if (ducks < 100) {
            for (int i = ducks; i > 0; i--) {

                System.out.println(i + " little "+ word +" went swimming one day");
                System.out.println("Over the hill and far away");
                System.out.println("Mother duck said, 'Quack quack quack quack'");

                if (ducks > 2) {
                    if ( i > 1 ) {
                        if ( (i-1) == 1) {
                            word = "duck";
                        }
                        System.out.println("And only " + (i - 1) + " little "+ word + " came back!");
                    }
                    else
                    {
                        System.out.println("And all her "+ducks +" little ducks came back!");
                    }
                }
                if (ducks == 2){
                    System.out.println("And both her ducks came back!");
                }
                if (ducks == 1){
                    System.out.println("And her lonely little duck came back!");
                }

            }
        }
        else
        {
            System.out.println("I'm not singing that much!");
        }

    }
}

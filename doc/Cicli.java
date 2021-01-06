package cicli;

import java.util.Scanner;

public class Cicli {

    // holla
    public static int myScelta(Scanner input) {
        System.out.println("Un pannino costa 1.5euro , una pastina 1 euro");

        int oneortwo = 0;
        do {

            System.out.println("Inserire 1 per una PANINO\nInserire 2 per un PASTINA");
            oneortwo = input.nextInt();
        } while (oneortwo > 3);
        return oneortwo;
    }

    // holla
    public static int myPaninoMore(Scanner input) {

        int kk = 0;
        do {
            System.out.println("Vuoi comprare ancora un PANINO o no");
            System.out.println("Inserire 1 per prendere ancora uno\nInserire 2 per non prendere piu panini");
            kk = input.nextInt();

        } while (kk > 3);
        return kk;
    }

    public static int myPastinaMore(Scanner input) {

        int kk = 0;
        do {
            System.out.println("Vuoi comprare ancora una PASTINA o no");
            System.out.println("Inserire 1 per prendere ancora uno\nInserire 2 per non prendere piu pastine");
            kk = input.nextInt();

        } while (kk > 3);
        return kk;
    }

    //start
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Inserire la qunaita di denari di Mario");
        double soldi = input.nextDouble();
        int panini = 0, pastine = 0;
        int pp = 0, pmp = 0, kk = 0, mpm = 0;
        pp = myScelta(input);

        if (pp == 1) {
            double panino = 1.5;
            soldi = soldi - panino;
            panini++;
            System.out.println("Hai ancora " + soldi + " euro");
            mpm = myPaninoMore(input);
            while (mpm == 1) {
                soldi = soldi - panino;
                System.out.println("Hai ancora " + soldi + " euro");
                panini++;
                mpm = myPaninoMore(input);

            }
            if (mpm == 2) {
                
                pp = myScelta(input);
                if (pp == 2) {
                    mpm = 0;
                }
                if (pp == 1) {
                    mpm = 1;
                }
            }

        }
        if (pp == 2) {
            double pastina = 1.0;
            soldi = soldi - pastina;

            pastine++;
            System.out.println("Hai ancora " + soldi + " euro");
            pmp = myPastinaMore(input);
            while (pmp == 1) {

                soldi = soldi - pastina;
                System.out.println("Hai ancora " + soldi + " euro");
                pastine++;
                pmp = myPastinaMore(input);

            }
            if (pmp == 2) {

                pp = myScelta(input);
                if (pp == 2) {
                    pmp = 0;
                }
                if (pp == 1) {
                    pmp = 1;
                }
            }

        }

    }

}

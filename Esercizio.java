import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;

// Classe principale, con metodo main
class Esercizio {
    
    private static Scanner in = new Scanner(System.in);

    public static void main(String args[]) throws Exception {

        String nomeFileLettura, nomeFileScrittura, riga;

        System.out.print("Inserire il nome del file da leggere: ");
        nomeFileLettura = in.next();
        System.out.print("Inserire il nome del file su cui scrivere: ");
        nomeFileScrittura = in.next();

        Scanner infile = new Scanner(new FileReader(nomeFileLettura));
        FileWriter outfile = new FileWriter(new File(nomeFileScrittura));

        do{
            riga = infile.nextLine();
            riga = inverti(riga);
            outfile.write(riga + "\n");
        }while(infile.hasNextLine());
        infile.close();
        outfile.close();
    }

    public static String inverti(String riga){
        String agir = "";

        for(int i = riga.length()-1; i >= 0; i--){
            agir += riga.charAt(i);
        }

        return agir;
    }
}


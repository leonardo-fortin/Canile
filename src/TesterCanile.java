import java.util.ArrayList;

public class TesterCanile {

    private static ArrayList<Cane> cani;

    private static void inizializzaVariabili(){
        cani = new ArrayList<>();
    }

    public static void main(String[] args) {
        stampaDescrizione();
        inizializzaVariabili();
        popola();
    }

    public static void stampaDescrizione(){
        System.out.println("Canile");
    }

    public static void popola(){
        cani.add(new Cane("Oscar", "Labrador"));
        cani.add(new Cane("Neve", "Maltese"));
        cani.add(new Cane("Lucky", "Border Collie"));
    }

}
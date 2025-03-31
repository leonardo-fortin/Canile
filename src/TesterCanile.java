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

        if(cercaCane("Oscar", "Labrador")) System.out.println("Il cane è stato trovato");
        else System.out.println("Il cane non è stato trovato");
    }

    public static void stampaDescrizione(){
        System.out.println("Canile");
    }

    public static void popola(){
        cani.add(new Cane("Oscar", "Labrador"));
        cani.add(new Cane("Neve", "Maltese"));
        cani.add(new Cane("Lucky", "Border Collie"));
    }

    public static boolean cercaCane(String nome, String razza){
        for(Cane cane : cani){
            if(cane.getNome().equals(nome) && cane.getRazza().equals(razza)) return true;
        }
        return false;
    }


}
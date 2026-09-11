package interfaces;

public class MainPatos {
    public static void main(String[] args){
        Pato[] patos =  new Pato[2];
        patos[0] = new Pato("Pepe", 13);
        patos[1] = new Pato("kiki", 9);

        for (Pato pato: patos){
            pato.nadar();
            pato.volar();
            System.out.println(" ");
        }
    }
}

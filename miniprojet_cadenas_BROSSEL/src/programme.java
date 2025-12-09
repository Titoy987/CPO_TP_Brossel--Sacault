public class programme {

    private int[] chiffres = new int[4];

    private int[] codeSecret = new int[4];
    
    private int nbtentative=0;
    

    public programme() {
        for (int i = 0; i < 4; i++) {
            chiffres[i] = 0;
        }

        for (int i = 0; i < 4; i++) {
            codeSecret[i] = (int)(Math.random() * 10);
        }

        System.out.println("CODE SECRET = " +
                codeSecret[0] + "" + codeSecret[1] + "" +
                codeSecret[2] + "" + codeSecret[3]);
    }

    public void incrementer(int index) {
        if (index < 0 || index >= chiffres.length) return;
        chiffres[index]++;
        if (chiffres[index] > 9) {
            chiffres[index] = 0;
        }
    }
   
    public void decrementer(int index) {
        if (index < 0 || index >= chiffres.length) return;
        chiffres[index]--;
        if (chiffres[index] < 0) {
            chiffres[index] = 9;
        }
    }

    public int getChiffre(int index) {
        if (index < 0 || index >= chiffres.length) return 0;
        return chiffres[index];
    }

    public int[] tester() {
        int exact = 0;
        int haut  = 0;
        int bas   = 0;
        int victoire =0;
        boolean[] dejaCompte = new boolean[10];

        for (int i = 0; i < 4; i++) {
            int c =chiffres[i];
            
            if (dejaCompte[c]) continue;
            if (c == codeSecret[0]|| 
                c == codeSecret[1]||
                c == codeSecret[2]||
                c == codeSecret[3]) {
                exact++;
                dejaCompte[c] = true;
            } else if (chiffres[i] > codeSecret[0]|| 
                       chiffres[i] > codeSecret[1]||
                       chiffres[i] > codeSecret[2]||
                       chiffres[i] > codeSecret[3]) {
                haut++;
            } else {
                bas++;
            }
        }
        if (exact == 4){
                ++victoire;
            }
        return new int[]{ exact, haut, bas, victoire};
    }
    public int tentative(){
        if (nbtentative < 5){
            return ++nbtentative;
        }
        else{
            return 100;
        }
    }
    public void reset(){
        nbtentative = 0;
        
        for(int i =0; i<4; i++){
            codeSecret[i] = (int)(Math.random()*10);
        }
        for (int i = 0; i<4; i++){
            chiffres[i] = 0;
        }
    }
}
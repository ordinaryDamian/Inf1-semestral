//Velice dobre treba pouzit k JPanelu ku grid boxu
//pridat a isnpirovat sa

public class Matica {
    private Obdlznik[][] matica;

    public Matica(int m, int n) {
        //m je riadok
        this.matica = new Obdlznik[m][];
        for(int i = 0; i < this.matica.length; i++) {
            this.matica[i] = new Obdlznik[n];
            //n su stlpce, vsetky rovnako dlhe
            for(int j = 0; j < this.matica[i].length; j++) {
                this.matica[i][j] = new Obdlznik();
                this.matica[i][j].zmenPolohu(5 + (j * 47), 5 + (i * 47));
                this.matica[i][j].zmenStrany(45, 45);
            }
        }
        //na i posuvam riadky y suradnica, na j posuvam stlpce x suradnica
    }

    public void zobraz() {
        for(int i = 0; i < this.matica.length; i++) {
            for(int j = 0; j < this.matica[i].length; j++) 
                this.matica[i][j].zobraz();
        }
    }
    
    public void vyberSuradnice(int x, int y) {
        Obdlznik najdeny = null;
        for(int i = 0; i < this.matica.length; i++) {
            for(int j = 0; j < this.matica[i].length; j++) {
                if (this.matica[i][j].obsahujeBod(x, y)) {
                    najdeny = this.matica[i][j];
                    break;
                }
            }
        }
        
        if (najdeny != null) 
            najdeny.zmenFarbu("blue");
    }
}

import java.util.Scanner;

public static void main(Strinf[] args) {
    
    class Televisao{
        int canal;
        int volume;

        private Televisao(int canal, int volume){
            this.canal = canal;
            this.volume = volume;
        }

        void imprimeStatus(){
            System.out.println("Canal: "+canal);
            System.out.print("Volume: "+volume);
        }
    }

    class controleRemoto(){

        Televisao t;

        void alteraVolume(int comando){
            if (comando <= 0){
                t.volume = t.volume - comando;
            }else{
                t.volume = t.volume + comando;
            }
        }

        void alteraCanal(int comando){
            if (comando <= 0){
                t.canal = t.canal - comando;
            }else{
                t.canal = t.canal + comando;
            }
        }

        void setarCanal(int comando){
            t.canal = comando;
        }

    }
}
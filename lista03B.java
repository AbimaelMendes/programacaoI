import java.util.Scanner;

public static void main(String[] args) {


    class Agenda(){
        Pessoa p[] = new Pessoa[10];

        public Agenda(){
            this.p = new Pessoa();
        }
        void armazenaPessoa(String nome, Data data, float altura ){
            Pessoa p = new Pessoa();
            Data d = new Data();
            p.nome = nome;
            p.nascimento.dia = d.dia;
            p.nascimento.mes = d.mes;
            p.nascimento.ano = d.ano;
            p.altura = altura;
        }

        void removePessoa(String nome){
            for (i = 0; i <10; i++){
                if(p.nome[i].equals(nome)){
                    p.nome = 0;
                    p.nascimento.dia = 0;
                    p.nascimento.mes = 0;
                    p.nascimento.ano = 0;
                    p.altura = 0;
                    
                }
            }
        }

        int buscaPessoa(String nome){
            for (i = 0; i <10; i++){
                if(p.nome[i].equals(nome)){
                    return i;
                }
            }
        }

        void imprimeAgenda(){
            for (i = 0; i < 10; i++){
                System.out.println("Nome: "+p.nome[i]);
                System.out.println("dia: "+p.nascimento.dia[i]);
                System.out.println("Mês: "+p.nascimento.mes[i]);
                System.out.println("Ano: "+p.nascimento.ano[i]);
                System.out.println("dia: "+p.altura[i]);
                System.out.print("=====================================");

            }
        }

        void imprimePessoa(int index){
            System.out.println("Nome: "+p.nome[index]);
            System.out.println("dia: "+p.nascimento.dia[index]);
            System.out.println("Mês: "+p.nascimento.mes[imdex]);
            System.out.println("Ano: "+p.nascimento.ano[index]);
            System.out.println("dia: "+p.altura[index]);
        }
    }

    class Pessoa(){
        String nome;
        Data nascimento;
        float altura;
        float peso;

        public Pessoa(String nome, Data nascimento, float altura, float peso){
            this.nome = nome;
            this.altuta = altura;
            this.peso = peso;
            this.nascimento = new Data(); 
        }
    }

    Class Data(){
        int dia;
        int ano;
        int mes;
    }
}
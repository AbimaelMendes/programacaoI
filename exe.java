import java.util.Scanner;

public class Exe{

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        public class Exe1{
            System.out.println("Programação I/n");
            System.out.println("    - Professor: João/n");
            System.out.println("    - Aluno: Abimael/n");
            System.out.println("    - Objetivo:/n");
            System.out.println("        O objetivo dessa disciplina é compreender
             os conceitos fundamentais do..../n");
            System.out.println("   - Turno: vespertino/n");
        }

        public class Exe2{

            int a,b;
            a = sc.nextInt();
            b = sc.nextInt();
            int soma= a+b;
            System.out.println("Soma: "+soma);

            double c,d;
            c = sc.nextDouble();
            d = sc.nextDouble();
            double soma2 = c+d;
            System.out.println("Soma: "+soma2)
        }

        public class Exe3{
            for(int i=1; i <= 10; i++){
                System.out.println(i+" X 5 = "+i*5);
            }

        }

        public class Exe4{
            for(int i =1; i <= 10; i++){
                System.out.println(i+" X 6 = "+i*6+"       "+i+" X 2 = "+i*2);
            }
        }

        public class Exe5{
            for(int i = 1; i<=100; i++){
                System.out.print(i+" Java ");
                int j = 1;
                for(; j <= i; j++){
                    System.out.print("atrapalham ");
                }
                System.out.println("muita gente!");    

            }
        }

        public class Exe6{
            int ano = sc.nextInt();
            int idade = 2021 - ano;
            System.out.println(idade);
        }

        public class Exe7{
            int cont =0;
            for (int i =1; i <= 15; i++){
                int j=2;
                for(j;j <=15;j++){
                    if(i % j == 0){
                        cont++;
                    }
                }
                if(cont == 2){
                    System.out.print(i);
                }
            }
        }
        public class Exe8{
            int cont =0;
            for (int i =100; i <= 200; i++){
                int j=2;
                for(j;j <=200;j++){
                    if(i % j == 0){
                        cont++;
                    }
                }
                if(cont == 2){
                    System.out.print(i);
                }
            }
        }
    }
}    
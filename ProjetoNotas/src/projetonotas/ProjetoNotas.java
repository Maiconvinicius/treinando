package projetonotas;

import java.util.Scanner;

public class ProjetoNotas {
    
    public static void main(String[] args) {
      Notas medias = new Notas();               

        System.out.println("==================");

        System.out.println("Informe as notas: ");       

        Scanner entrada = new Scanner(System.in);

        System.out.print("\n 1ª Nota: ");

        medias.nota1 = entrada.nextFloat();

        System.out.print("\n 2ª Nota: ");

        medias.nota2 = entrada.nextFloat();

        System.out.print("\n 3ª Nota: ");

        medias.nota3 = entrada.nextFloat();       

        System.out.println("==================");               

        medias.calculaMedia();

        medias.mostraMedia();          

    } 

}

package projetonotas;

public class Notas {
    
       float nota1, nota2, nota3, media;      

    public float calculaMedia(){
     //media = (nota1 + nota2 + nota3) / 3; MEDIA COM AS 3 NOTAS
         
        if (nota1 < nota2 && nota1 < nota3) {

            media = (nota2 + nota3) / 2;

            //menor = nota1; EXCLUIDA
        } else if (nota2 < nota3) {

            media = (nota1 + nota3) / 2;
            //menor = nota2; EXCLUIDA

        } else {

            media = (nota1 + nota2) / 2;
            //menor = nota3; EXCLUIDA
        }
        return media;
      }

    void mostraMedia(){

        System.out.println("==================");

        System.out.println("A média é: " + media);

        System.out.println("==================");

    }

}


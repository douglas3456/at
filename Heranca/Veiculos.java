package Heranca;

import java.util.Scanner;

public class Veiculos{

   String Cor;
   String Proprietario;
   String Placa;
   String Tipo;
    
   public void setCor(String cor){
    Cor=cor;
   }
   public void setProprietario(String proprietario){
    Proprietario=proprietario;
   }
   public void setPlaca (String placa){
    Placa=placa;
   }
   public void setTipo(String tipo){
    Tipo=tipo;
   }
   
   public String getCor(){
    return Cor;
   }
   public String getProprietario(){
    return Proprietario;
   }
   public String getPlaca(){
    return Placa;
   }
   public String getTipo(){
    return Tipo;
   }
   public String Dados(){
    return getProprietario()+"- "+getCor()+"-"+getPlaca()+"-"+getTipo();
}

public void Salvar(){
    Scanner ler = new Scanner(System.in);

    System.out.println("Quem é o proprietario?");
    setProprietario( ler.next() ); 

    System.out.println("qual a cor do veiculo?");
    setCor(ler.next() );

    System.out.println("Qual o numero da placa?");
    setPlaca( ler.next() );

    System.out.println("Qual o tipo do veiculo?");
    setTipo( ler.next() );

}
   

}

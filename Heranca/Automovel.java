package Heranca;

import java.util.Scanner;

public class Automovel extends Veiculos {

    String Marca;
    String Modelo;
    int Ano;
    int NumPortas;

    public void setMarca(String marca){
        Marca=marca;
    }
    public void setModelo(String modelo){
        Modelo=modelo;
    }
    public void setAno(int ano){
        Ano=ano;
    }
    public void setNumPortas(int portas){
        NumPortas=portas;
    }
    public String getMarca(){
        return Marca;
    }
    public String getModelo(){
        return Modelo;
    }
    public int getAno(){
        return Ano;
    }
    public int getNumPortas(){
        return NumPortas;
    }
    public String Dados(){
        return getProprietario()+"- "+getCor()+"-"+getPlaca()+"-"+getTipo()+"-"+getMarca()+"-"+getModelo()+"-"+getAno()+"-"+getNumPortas();
    }

    public void Salvar(){
        
        super.Salvar();
        
        Scanner ler = new Scanner(System.in);
    
        System.out.println("Qual é a marca do automovel");
        Marca= ler.next(); 
    
        System.out.println("qual é o Modelo?");
        Modelo=ler.next();
    
        System.out.println("Qual é o ano ?");
        Ano=ler.nextInt();
    
        System.out.println("Quantas porta");
        NumPortas= ler.nextInt();
    
    }
       
    
    }

    


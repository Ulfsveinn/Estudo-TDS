package com.mycompany.colecao;
public class Aluno extends Pessoa {
    
    private int matricula;
    private double nota1;
    private double nota2;
    private double nota3;
    private static int auxMat=0;
    public Aluno( String nome, String endereco, int idade, double nota1, double nota2, double nota3) {
        super(nome, endereco, idade);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
       this.matricula=++auxMat;
    }
    
    public static int auxMat(){
        return auxMat;
    }
            
    public int getMatricula() {
        return matricula;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }
    
    private String AprovadoOuReprovado(double notafinal){
        
        if(notafinal>=7){
            return "Aprovado";
            
            
        }else{
            return "Reprovado";
        }
    }
    
     private double CalculoMedia(){
       return ((nota1+nota2+nota3)/3);
     }
 
    @Override
    public String dados(){
    String res=super.dados();
    res+=("\nMatricula: "+getMatricula()+
          "\nNota 1: "+getNota1()+
          "\nNota 2: "+getNota2()+
          "\nNota 3: "+getNota3()+
          "\nMedia final :"+CalculoMedia()+
          "\nO aluno foi: "+AprovadoOuReprovado(CalculoMedia()));
          res+=("\n---------------------------------------------------------------------");

        return res;
    }
       
   }
    


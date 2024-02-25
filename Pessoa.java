public class Pessoa {
    double altura;
    double Peso ;
    String nome;
    boolean status;
    int ano;
    
    
    void mostrardados(){
           System.out.println("me chamo:"+ this.nome); 
           System.out.println("minha altura é de :"+ this.altura); 
           System.out.println("meu peso é:"+ this.Peso); 
           System.out.println("tenho:"+ this.ano+"anos");
           System.out.println("eu grito "+this.status); 
           System.out.println(this.status); 
           
    }

  void vivo(){

    this.status = true; 
  }



}

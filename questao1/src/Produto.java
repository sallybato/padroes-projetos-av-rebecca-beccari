public abstract class Produto {

   public abstract void juros();
   public abstract String exibirrelatorio();

    
   public String gerarResumo(){
    return "Modalidade: " + modalidade +  
    "\n Cliente: " + nome +
    "\n Juros do primeiro mês: " + juros + "\n Documentos exigidos: " + listardocumentos();
   }
}
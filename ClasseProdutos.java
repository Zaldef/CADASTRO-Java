public class ClasseProdutos {
    private static int proximoId = 1;
    private String descricao;
    private int id;
    private double valor;
    private int quantidade = 0;
    
        public ClasseProdutos(String descricao, double valor){
            this.descricao = descricao;
            this.valor = valor;
            
            // Atribui o valor do atributo id ao atributo proximoId
            this.id = proximoId; 
            proximoId++;

            // Quantidade de produtos criados
            quantidade++;
        }
        public String getDescricao(){
            return descricao;
        }
        public int getId(){
            return id;
        }
        public double getValor(){
            return valor;
        }
        public int getQuantidade(){
            return quantidade;
        }
        
        // Funções do tipo set não possui retorno. Portanto, são void's.
        public void setDescricao(String descricao){
            this.descricao = descricao;
        }
        public void setId(int id){
            this.id = id;
        }
        public void setValor(double valor){
            this.valor = valor;
        }
        public String toString(){
            return "\n\tInformacao do Produto " + id +": \n" + "Descricao: " + descricao + "\n" + "Valor: R$" + valor + "\n";
        }
    
    
}
public static void main(Strin[] args) {
    class var{
        public int valor;
        public String nome;
    }

    class Dicionario{
        public static Var tabela[];

        Var getVariavel(String nome){
            for(i = 0; i < tabela[].length; i++){
                if(tabela[i].nome.equals(nome)){
                    return tabela[i]
                }else{
                    return NULL;
                }
            }
        }
    }
}
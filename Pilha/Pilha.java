public class Pilha {
    
    // Atributos
    private static final int TAM_DEFAULT = 100;
    private int topoPilha;
    private int elementos[];
    
    // Construtores
    public Pilha(int tamanho) {
        this.elementos = new int[tamanho]; //this é opcional, nesse caso.
        this.topoPilha = -1; 
    }
    
    public Pilha() {
        this(TAM_DEFAULT);
    }
    
    // Métodos
    public boolean isEmpty() {
        return this.topoPilha == -1;
        /* isso basicamente faz:
        if (this.topoPilha == -1) {
            return true;
        } 
        else {
            return false;
        }
        */
    }
    
    public boolean isFull() {
        return this.topoPilha == elementos.length - 1;
    }
    
    public void push(int e) throws Exception { //inserir elemento
        if (!this.isFull()) {
            /*
            topoPilha++; 
            this.elementos[topoPilha] = e;
            */
           // ou apenas: 
            this.elementos[++topoPilha] = e;
        }
        else {
            throw new Exception("Overflow - Estouro de pilha.");
        }
    }
    
    public int pop() throws Exception { // remover elemento
        if (!this.isEmpty()) {
            int temp = this.elementos[topoPilha];
            topoPilha--;
            return temp;
        }
        else {
            throw new Exception("Underflow - Esvaziamento de pilha.");
        }
    }
    
    public int topo() throws Exception {
        if (!this.isEmpty()) {
            return this.elementos[topoPilha];
        }
        else {
            throw new Exception("Underflow - Esvaziamento de pilha.");
        }
    }
    
    public int sizeElements() { 
        return topoPilha + 1;
    }
}
/*
 Pilha insere elementos e percorre de trás pra frente. Assim como a conversão de decimal para binário
 que consiste em dividir o decimal por 2 até que o quociente seja 0, em seguida, considera-se os restos
 do menor pro maior 
*/
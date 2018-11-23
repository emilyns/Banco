
package banco;

/**
 *
 * @author Emily Nascimento
 */
public class Conta {
     //encapsulado - quando somente metodos da sua classe raliza operações sobre ele, porque a variavel é privada
    String usuario; 
    private String senha;
    private double saldo;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
    
    public void depositar (double valor){
    this.saldo = this.saldo + valor;
        System.out.println("Saldo atual: "+this.saldo);
    
    }
    
    public void sacar(double valor){
        
        if (this.saldo > valor){
            this.saldo = this.saldo - valor;
            System.out.println("Operação realizada com sucesso! ");
    
        }
    }
    
    public double visualizar(){
    return this.saldo;
    }
    
    
}

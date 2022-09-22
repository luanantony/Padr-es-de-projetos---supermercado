package supermercado;

public class Produto {
    private float preco;

    public Produto(float preco){
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void calculaPreco(Horario hora, Horario dia){
        if(hora.getHora()>=20 && hora.getHora()<24){
            System.out.println("\n**********GANHOU DESCONTO**********");
            preco = preco - (preco * 0.10f);
        }

        else{
            if(dia.getDia().equals("Sabado") || dia.getDia().equals("sabado") || dia.getDia().equals("Domingo") || dia.getDia().equals("domingo")){
                System.out.println("\n**********GANHOU DESCONTO**********");
                preco = preco - (preco * 0.10f);
            }
        }
    }
}

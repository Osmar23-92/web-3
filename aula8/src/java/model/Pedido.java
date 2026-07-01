package model;


public class Pedido {
    private int id;
    private String tamanho;
    private String[] acomp;
    private String colher;
    private String entrega;
    private double valor;
    
    public Pedido(){};

    public Pedido(String tamanho, String[] acomp, String colher, String entrega) {
        this.tamanho = tamanho;
        this.acomp = acomp;
        this.colher = colher;
        this.entrega = entrega;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String[] getAcomp() {
        return acomp;
    }

    public void setAcomp(String[] acomp) {
        this.acomp = acomp;
    }

    public String getColher() {
        return colher;
    }

    public void setColher(String colher) {
        this.colher = colher;
    }

    public String getEntrega() {
        return entrega;
    }

    public void setEntrega(String entrega) {
        this.entrega = entrega;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Pedido{" + "id=" + id + 
                ", tamanho=" + tamanho + 
                ", acomp=" + acomp + 
                ", colher=" + colher + 
                ", entrega=" + entrega + 
                ", valor=" + valor + 
                '}';
    }
    
    
}


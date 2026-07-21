package agendamento;

import java.util.Date;


public class Agendamento {
    private int idAgendamento; 
    private int idCliente;
    private int idPet;
    private String tipoAgendamento;
    private Date data;
    private String descricao;
    
   public Agendamento(){}

    public Agendamento(int idAgendamento, int idCliente, int idPet, String tipoAgendamento, Date data, String descricao) {
        this.idAgendamento = idAgendamento;
        this.idCliente = idCliente;
        this.idPet = idPet;
        this.tipoAgendamento = tipoAgendamento;
        this.data = data;
        this.descricao = descricao;
    }

    public int getIdAgendamento() {
        return idAgendamento;
    }

    public void setIdAgendamento(int idAgendamento) {
        this.idAgendamento = idAgendamento;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdPet() {
        return idPet;
    }

    public void setIdPet(int idPet) {
        this.idPet = idPet;
    }

    public String getTipoAgendamento() {
        return tipoAgendamento;
    }

    public void setTipoAgendamento(String tipoAgendamento) {
        this.tipoAgendamento = tipoAgendamento;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Agendamento{" +
                "idAgendamento=" + idAgendamento +
                ", idCliente=" + idCliente +
                ", idPet=" + idPet +
                ", tipoAgendamento=" + tipoAgendamento +
                ", data=" + data +
                ", descricao=" + descricao +
                '}';
    }
    
    
    
}

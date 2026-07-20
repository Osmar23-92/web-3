package model;


public class Agendamento {
    private int idAgendamento;
    private int idUsuario;
    private String dataAgendamento;
    private String descAgendamento;
    
    public Agendamento(){}

    public Agendamento(int idAgendamento, int idUsuario, String dataAgendamento, String descAgendamento) {
        this.idAgendamento = idAgendamento;
        this.idUsuario = idUsuario;
        this.dataAgendamento = dataAgendamento;
        this.descAgendamento = descAgendamento;
    }

    public int getIdAgendamento() {
        return idAgendamento;
    }

    public void setIdAgendamento(int idAgendamento) {
        this.idAgendamento = idAgendamento;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getDataAgendamento() {
        return dataAgendamento;
    }

    public void setDataAgendamento(String dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }

    public String getDescAgendamento() {
        return descAgendamento;
    }

    public void setDescAgendamento(String descAgendamento) {
        this.descAgendamento = descAgendamento;
    }

    @Override
    public String toString() {
        return "Agendamento{" +
                "idAgendamento=" + idAgendamento +
                ", idUsuario=" + idUsuario +
                ", dataAgendamento=" + dataAgendamento +
                ", descAgendamento=" + descAgendamento +
                '}';
    }
    
    
}

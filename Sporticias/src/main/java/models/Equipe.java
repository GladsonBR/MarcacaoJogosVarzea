package models;

import javax.persistence.*;

@Entity
@Table(name="time")
public class Equipe {
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nomeTime;
    private String corUniforme;
    private String login;
    private String password;
    private String horario;

    private int idCampo;

    public Equipe(String nomeTime, String corUniforme, String login, String password, String horario) {
        this.nomeTime = nomeTime;
        this.corUniforme = corUniforme;
        this.login = login;
        this.password = password;
        this.horario = horario;
    }

    public String getNomeTime () {
        return nomeTime;
    }

    public void setNomeTime ( String nomeTime ) {
        this.nomeTime = nomeTime;
    }

    public long getId () {
        return id;
    }

    public void setId ( long id ) {
        this.id = id;
    }

    public String getCorUniforme () {
        return corUniforme;
    }

    public void setCorUniforme ( String corUniforme ) {
        this.corUniforme = corUniforme;
    }

    public String getHorario () {
        return horario;
    }

    public void setHorario ( String horario ) {
        this.horario = horario;
    }
    public String getLogin () {
        return login;
    }

    public void setLoggin ( String loggin ) {
        this.login = loggin;
    }

    public String getPassword () {
        return password;
    }

    public void setPassword ( String password ) {
        this.password = password;
    }


    public int getIdCampo() {
        return idCampo;
    }

    public void setIdCampo(int idCampo) {
        this.idCampo = idCampo;
    }
}

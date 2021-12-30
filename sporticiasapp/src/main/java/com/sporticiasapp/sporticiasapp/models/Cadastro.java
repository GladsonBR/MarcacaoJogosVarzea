package com.sporticiasapp.sporticiasapp.models;

import javax.persistence.*;

@Entity
public class Cadastro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nomeTime;
    private String corUniforme;

    private String loggin;

    private String password;
    private String horario;

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
    public String getLoggin () {
        return loggin;
    }

    public void setLoggin ( String loggin ) {
        this.loggin = loggin;
    }

    public String getPassword () {
        return password;
    }

    public void setPassword ( String password ) {
        this.password = password;
    }
}

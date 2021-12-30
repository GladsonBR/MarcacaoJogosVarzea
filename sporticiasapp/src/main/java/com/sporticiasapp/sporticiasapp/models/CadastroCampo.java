package com.sporticiasapp.sporticiasapp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CadastroCampo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    private String Cnpj;
    private String NomeCampo;
    private String Endereco;
    private String TipoCampo;
    private String Iluminacao;

    public long getId () {
        return Id;
    }

    public void setId ( long id ) {
        Id = id;
    }

    public String getCnpj () {
        return Cnpj;
    }

    public void setCnpj ( String cnpj ) {
        Cnpj = cnpj;
    }

    public String getNomeCampo () {
        return NomeCampo;
    }

    public void setNomeCampo ( String nomeCampo ) {
        NomeCampo = nomeCampo;
    }

    public String getEndereco () {
        return Endereco;
    }

    public void setEndereco ( String endereco ) {
        Endereco = endereco;
    }

    public String getTipoCampo () {
        return TipoCampo;
    }

    public void setTipoCampo ( String tipoCampo ) {
        TipoCampo = tipoCampo;
    }

    public String getIluminacao () {
        return Iluminacao;
    }

    public void setIluminacao ( String iluminacao ) {
        Iluminacao = iluminacao;
    }


}

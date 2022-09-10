package models;

import javax.persistence.*;

@Entity
@Table(name="campo")
public class Campo {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String cnpj;
    private String nomeCampo;
    private String endereco;
    private String tipoCampo;
    private String iluminacao;


    public Campo(String cnpj, String nomeCampo, String endereco, String tipoCampo, String iluminacao) {
        this.cnpj = cnpj;
        this.nomeCampo = nomeCampo;
        this.endereco = endereco;
        this.tipoCampo = tipoCampo;
        this.iluminacao = iluminacao;
    }

    public long getId() {
        return id;
    }

    
    public void setId(long id) {
        this.id = id;
    }

    
    public String getCnpj() {
        return cnpj;
    }

   
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

   
    public String getNomeCampo() {
        return nomeCampo;
    }

   
    public void setNomeCampo(String nomeCampo) {
        this.nomeCampo = nomeCampo;
    }

   
    public String getEndereco() {
        return endereco;
    }

  
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    
    public String getTipoCampo() {
        return tipoCampo;
    }

   
    public void setTipoCampo(String tipoCampo) {
        this.tipoCampo = tipoCampo;
    }

   
    public String getIluminacao() {
        return iluminacao;
    }

   
    public void setIluminacao(String iluminacao) {
        this.iluminacao = iluminacao;
    }

}

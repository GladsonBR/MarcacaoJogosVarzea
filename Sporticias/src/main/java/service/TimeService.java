package service;

import dao.ConnectionDao;
import models.Campo;
import models.Equipe;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class TimeService extends HttpServlet{
    private ConnectionDao conn;
    private  String msg= "";

    public void doGet(HttpServletRequest request, HttpServletResponse response){
        try{
            request.setAttribute("msg", msg);
            request.getRequestDispatcher("WEB-INF/views/formCadastro.jsp").forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response){
       String nomeTime = request.getParameter("nomeTime");
       String coruniforme = request.getParameter("corUniforme");
       String horarioPartida = request.getParameter("horarioJogo");
       String login = request.getParameter("login");
       String senha = request.getParameter("senha");
       String cnpj = request.getParameter("cnpj");
       String nomeCampo=request.getParameter("nomeCampo");
       String endereco = request.getParameter("endereco");
       String tipoCampo = request.getParameter("tipoCampo");
       String iluminacao = request.getParameter("iluminacao");

       Equipe time = new Equipe(nomeTime,coruniforme,horarioPartida,login,senha);
       Campo campo = new Campo(cnpj,nomeCampo,endereco,tipoCampo,iluminacao);

       int idTime = existeTime(nomeTime);
        int idCampo = existeCampo(nomeCampo);
       if(idTime==0) {
           conn.getEm().getTransaction().begin();
           if (idCampo == 0){
               conn.getEm().persist(campo);
                conn.getEm().getTransaction().commit();
               int idNovoCampo = existeCampo(nomeCampo);
               time.setId(idNovoCampo);
            }else{
              time.setIdCampo(idCampo);
           }
           conn.getEm().persist(time);
           conn.getEm().getTransaction().commit();
       }else{
           msg="Usuário ja cadastrado";
           try {
               request.setAttribute("msg", msg);
               request.getRequestDispatcher("WEB-INF/views/formCadastro.jsp").forward(request, response);
           } catch (ServletException e) {
               throw new RuntimeException(e);
           } catch (IOException e) {
               throw new RuntimeException(e);
           }
       }
    }

    public void doPut(HttpServletRequest request, HttpServletResponse response){
        try{
            response.getWriter().write("PutService Funcionando");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void doDelete(HttpServletRequest request, HttpServletResponse response){
        try{
            response.getWriter().write("DeleteService Funcionando");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    private List<Equipe> listaTodos(){
        int i = 1;
        Equipe equipe;
        List<Equipe> listaAllEquipes = new ArrayList<>();
        do {
            equipe = conn.getEm().find(Equipe.class, i);
            if (equipe!=null) {
                listaAllEquipes.add(equipe);
            } else{
                break;
            }
            i++;
        }while (equipe!=null);
        return listaAllEquipes;
    }

    private int existeTime(String nome){
        int i=0;
        List<Equipe> listAllEquipes = listaTodos();
        for (Equipe equipe: listAllEquipes) {
            if (equipe.getNomeTime()==nome){
                i= (int) equipe.getId();
            }
        }
        return i;
    }

    private int existeCampo(String nome){
        int i=0;
        List<Equipe> listAllEquipes = listaTodos();
        for (Equipe equipe: listAllEquipes) {
            if (equipe.getNomeTime()==nome){
                i= (int) equipe.getId();
            }
        }
        return i;
    }
}

package servlet;

import service.CampoService;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/campo")
public class MarcacaoServlet extends HttpServlet{
    private static final long serialVersionUID = 1L;

    private CampoService campoService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        try{
            response.getWriter().write("GetService Funcionando");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //       campoService.doGet(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        campoService.doPost(request, response);
    }

    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        campoService.doPut(request, response);
    }

    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        campoService.doDelete(request, response);
    }


}
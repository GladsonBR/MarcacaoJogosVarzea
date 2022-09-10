package service;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CampoService extends HttpServlet{
    
    private static final long serialVersionUID = 1L;

    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        try{
            response.getWriter().write("GetService Funcionando");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response){
        try{
            response.getWriter().write("PostService Funcionando");
        } catch (IOException e) {
            throw new RuntimeException(e);
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
    
}

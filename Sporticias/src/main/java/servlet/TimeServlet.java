package servlet;

import service.TimeService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/cadastrar")
public class TimeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private TimeService timeService = new TimeService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        timeService.doGet(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response){
        timeService.doPost(request, response);
    }

    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response){
        timeService.doPut(request, response);
    }

    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response){
        timeService.doDelete(request, response);
    }
    
}

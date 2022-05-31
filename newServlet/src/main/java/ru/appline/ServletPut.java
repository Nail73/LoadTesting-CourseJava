package ru.appline;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ru.appline.logic.Model;
import ru.appline.logic.User;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.atomic.AtomicInteger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/put")
public class ServletPut extends HttpServlet {
    Model model = Model.getInstance();
    private AtomicInteger count = new AtomicInteger(5);
    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            request.setCharacterEncoding("UTF-8");
            response.setContentType("application/json; charset=utf-8");
            int id = Integer.parseInt(request.getParameter("id"));

            if (model != null) {
                request.setAttribute("id", id);
                getServletContext().getRequestDispatcher("/put.jsp").forward(request, response);
            } else {
                getServletContext().getRequestDispatcher("/get?id=0").forward(request, response);
            }
        } catch (Exception ex) {
            getServletContext().getRequestDispatcher("/get?id=0").forward(request, response);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            request.setCharacterEncoding("UTF-8");
            response.setContentType("application/json; charset=utf-8");
            PrintWriter pw = response.getWriter();
            int id = Integer.parseInt(request.getParameter("id"));
            String name = request.getParameter("name");
            String surname = request.getParameter("surname");
            double salary = Double.parseDouble(request.getParameter("salary"));
            User user = new User(name, surname, salary);
            model.add(user, id);
            pw.print((gson.toJson(model.getFromList())));
            response.sendRedirect(request.getContextPath() + "/get?id=0");
        } catch (Exception ex) {
            getServletContext().getRequestDispatcher("/put.jsp").forward(request, response);
        }
    }
}




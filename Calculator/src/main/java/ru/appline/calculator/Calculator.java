package ru.appline.calculator;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Calculator")
public class Calculator extends HttpServlet {
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    private static final long serialVersionUID = 7223778025721767631L;

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("application/json; charset=utf-8");
        request.setCharacterEncoding("utf-8");
        PrintWriter out = response.getWriter();
        double firstNum = Double.valueOf(request.getParameter("firstNum"));
        double secondNum = Double.valueOf(request.getParameter("secondNum"));
        String operator = request.getParameter("operator");
        double result = 0;
        if ("+".equals(operator)) {
            result = firstNum + secondNum;
        } else if ("-".equals(operator)) {
            result = firstNum - secondNum;
        } else if ("*".equals(operator)) {
            result = firstNum * secondNum;
        } else if ("/".equals(operator)) {
            result = firstNum / secondNum;
        }

        String json = gson.toJson(firstNum + " " + operator + " " + secondNum + " = " + result);
        out.print(json);
        out.print("<br> <a href='index.jsp'> Возврат </a>");
        out.flush();
        out.close();
    }
}

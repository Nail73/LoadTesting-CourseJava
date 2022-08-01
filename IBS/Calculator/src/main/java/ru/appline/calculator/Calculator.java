package ru.appline.calculator;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import java.io.BufferedReader;
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

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        StringBuffer sb = new StringBuffer();
        String line;

        try {
            BufferedReader reader = request.getReader();
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        JsonObject jsonObject = gson.fromJson(String.valueOf(sb), JsonObject.class);
        String operator = jsonObject.get("math").getAsString();

        response.setContentType("application/json;charset=utf-8");
        PrintWriter pw = response.getWriter();

        if ("+".equals(operator)) {
            double resultPlus = jsonObject.get("a").getAsDouble() + jsonObject.get("b").getAsDouble();
            pw.print(gson.fromJson("{\nresult: " + resultPlus + "\n}", JsonObject.class));
        } else if ("-".equals(operator)) {
            double resultMinus = jsonObject.get("a").getAsDouble() + jsonObject.get("b").getAsDouble();
            pw.print(gson.fromJson("{\n\"result\" : \"" + resultMinus + "\"\n}", JsonObject.class));
        } else if ("*".equals(operator)) {
            double resultMultiplication = jsonObject.get("a").getAsDouble() * jsonObject.get("b").getAsDouble();
            pw.print(gson.fromJson("{\n\"result\" : \"" + resultMultiplication + "\"\n}", JsonObject.class));
        } else if ("/".equals(operator)) {
            double resultDivision = jsonObject.get("a").getAsDouble() / jsonObject.get("b").getAsDouble();
            pw.print(gson.fromJson("{\n\"result\" : \"" + resultDivision + "\"\n}", JsonObject.class));
        } else {
            pw.print(gson.fromJson("{\n\"Ошибка ввода оператора, варианты\" : \"+, -, *, /\"\n}", JsonObject.class));
        }
        pw.print("<br> <a href='index.jsp'> Возврат </a>");
    }
}

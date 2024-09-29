package top.soft.class03response;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @author 24077
 * @description: TODO
 * @date 2024/9/28 14:29
 */
@WebServlet("/ResponseDemo02")
public class ResponseDemo02 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.getRequestDispatcher("/ResponseDemo01?username=zhangsan").forward(req, resp);
//        resp.sendRedirect("/ResponseDemo01?username=zhangsan");
        resp.sendRedirect("https://www.baidu.com/");
    }
}

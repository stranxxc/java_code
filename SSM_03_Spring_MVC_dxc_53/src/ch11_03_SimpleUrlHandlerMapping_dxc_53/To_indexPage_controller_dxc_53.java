package ch11_03_SimpleUrlHandlerMapping_dxc_53;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpRequestHandler;

public class To_indexPage_controller_dxc_53 implements HttpRequestHandler {

    public void handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String to_path = "/index.jsp";
        
        // 在转发之前设置属性（存储到 request 作用域）
        request.setAttribute("userName", "dxc");
        
        RequestDispatcher requestDispatcher = request.getRequestDispatcher(to_path);
        requestDispatcher.forward(request, response);
        return;
    }
}
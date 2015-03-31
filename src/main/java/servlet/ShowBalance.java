package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.CustomerUtils;
import bean.Customer;

@WebServlet("/showBalance")
public class ShowBalance extends HttpServlet {
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
      throws ServletException, IOException {
	  System.out.println("heere");
    String id = request.getParameter("customerID");
    if ((id == null) || (id.trim().equals(""))) {
      id = "<i>missing-id</i>";
    }
    Customer customer = CustomerUtils.getCustomer(id);
    String address;
    if (customer == null) {
      request.setAttribute("id", id);
      address = "/WEB-INF/results/unknown-customer.jsp";
    } else {
      request.setAttribute("customer", customer);
      address = "/WEB-INF/results/show-balance.jsp";
    }
    /*RequestDispatcher dispatcher =
      request.getRequestDispatcher(address);
    dispatcher.forward(request, response);*/
    response.setContentType("plain/text");
    response.getOutputStream().println("Hi Servlet!");
  }
}

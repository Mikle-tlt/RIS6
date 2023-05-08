package example.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.xml.ws.WebServiceRef;
import example.model.Address;
import example.service.AddressService;

import java.io.IOException;
import java.util.List;

@WebServlet("/allAddress")
public class GetAllStreets extends HttpServlet {
    @WebServiceRef
    AddressService addressService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Address> addressList = addressService.getAllStreet();
        req.setAttribute("addressList", addressList);
        req.getRequestDispatcher("getAllStreets.jsp").forward(req, resp);
    }
}

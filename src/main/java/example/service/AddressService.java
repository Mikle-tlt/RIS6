package example.service;

import example.model.Address;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import java.util.List;

@WebService
public interface AddressService {
    @WebMethod
    List<Address> findByName(String name);

    @WebMethod
    List<Address> findByOrganization(String organization);

    @WebMethod
    List<Address> getAllStreet();

    List<Address> findByHouse(int house);
}

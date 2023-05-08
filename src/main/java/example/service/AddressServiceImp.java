package example.service;

import example.model.Address;

import jakarta.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService(endpointInterface = "example.service.AddressService")
public class AddressServiceImp implements AddressService {

    public ArrayList<Address> addresses;

    public AddressServiceImp() {
        addresses = new ArrayList<>();
        addresses.add(new Address(28, "Yakuba Kolasa", "BSUIR"));
        addresses.add(new Address(22, "Yakuba Kolasa", "BNTU"));
        addresses.add(new Address(4, "Petrusya Brovki", "BSUIR"));
        addresses.add(new Address(9, "Gikalo", "BSUIR"));
        addresses.add(new Address(39, "Platonova", "BSUIR"));
        addresses.add(new Address(28, "Gikalo", "Popugaj"));
    }

    @Override
    public List<Address> findByName(String name) {
        List<Address> result = new ArrayList<>();
        for (Address address : addresses) {
            if (address.getName().equals(name)) {
                result.add(address);
            }
        }
        return result;
    }

    @Override
    public List<Address> findByOrganization(String organization) {
        List<Address> result = new ArrayList<>();
        for (Address address : addresses) {
            if (address.getOrganization().equals(organization)) {
                result.add(address);
            }
        }
        return result;
    }

    @Override
    public List<Address> findByHouse(int house) {
        ArrayList<Address> result = new ArrayList<>();
        for (Address address : addresses) {
            if (address.getHouse() == house) {
                result.add(address);
            }
        }
        return result;
    }

    @Override
    public List<Address> getAllStreet() {
        return addresses;
    }
}

package Adaptors;

import Abstracts.ICustomerCheckService;
import Entities.Customer;
import MernisReference.VMWKPSPublicSoap;

import java.util.Locale;

public class MernisServiceAdaptor implements ICustomerCheckService {
    public boolean checkIfRealPerson(Customer customer) throws Exception{
        VMWKPSPublicSoap client = new VMWKPSPublicSoap();
        return client.TCKimlikNoDogrula(Long.valueOf(customer.getNationalityId()), customer.getFirstName().toUpperCase(Locale.ROOT), customer.getLastName().toUpperCase(), customer.getBirthDay());
    }
}
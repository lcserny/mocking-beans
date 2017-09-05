package net.cserny.mockBeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService
{
    private AddressService addressService;

    @Autowired
    public UserServiceImpl(AddressService addressService) {
        this.addressService = addressService;
    }

    public String getUserDetails(String userName) {
        String address = addressService.getAddressForUser(userName);
        return String.format("User %s, %s", userName, address);
    }
}

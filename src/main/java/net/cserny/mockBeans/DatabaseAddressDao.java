package net.cserny.mockBeans;

import org.springframework.stereotype.Repository;

@Repository
public class DatabaseAddressDao implements AddressDao
{
    public String readAddress(String userName) {
        return "Something something";
    }
}

package net.cserny.mockBeans;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ActiveProfiles("AddressService-test")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class AddressServiceTest
{
    @Autowired
    private AddressService addressService;
    @Autowired
    private AddressDao addressDao;

    @Test
    public void getAddressForUser() throws Exception {
        Mockito.when(addressDao.readAddress("john")).thenReturn("Another Something");

        String actualAddress = addressService.getAddressForUser("john");

        Assert.assertEquals("Another Something", actualAddress);
    }
}

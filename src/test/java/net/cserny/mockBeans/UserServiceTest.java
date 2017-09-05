package net.cserny.mockBeans;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ActiveProfiles("UserService-test")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserServiceTest
{
    @Autowired
    private UserService userService;
    @Autowired
    private AddressService addressService;

    @Test
    public void testUserGetDetails() throws Exception {
        String actualDetails = userService.getUserDetails("john");

        Assert.assertEquals("User john, Something something", actualDetails);
        Mockito.verify(addressService).getAddressForUser("john");
    }
}

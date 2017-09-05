package net.cserny.mockBeans;

import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Profile(("AddressService-test"))
@Configuration
public class AddressDaoTestConfiguration
{
    @Bean
    @Primary
    public AddressDao addressDaoMock() {
        return Mockito.mock(AddressDao.class);
    }
}

package com.gyo.customer;

import com.gyo.customer.entities.Customer;
import com.gyo.customer.repo.ClientRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerApplicationTests {

    @Autowired
    private ClientRepository clientRepository;

    @Test
    public void pruebaCrearCliente(){
        Customer customer= new Customer();
        customer.setName("Gyo");
        customer.setEmail("gyorules@gmail.com");
        clientRepository.save(customer);
    }
    @Test
    public void pruebaBuscarCliente(){
        Customer customer=  clientRepository.findOne(1L);
        System.out.println("\n\n\n\n\n>>>>>>>>>>>>>"+customer+"<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n\n\n\n\n\n");
    }@Test
    public void pruebaActualizarCliente(){
        Customer customer=  clientRepository.findOne(1L);
        customer.setEmail("gyocommands@hotmail.com");
        clientRepository.save(customer);
    }

    @Test
    public void pruebaEliminarCliente(){
        clientRepository.delete(1L);
    }


}

package co.com.sofka.sofkaservice;

import co.com.sofka.model.person.Person;
import co.com.sofka.model.person.gateways.PersonService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class ApiService implements PersonService {


    @Override
    public Mono < Person > getPerson ( String id ) {
        return Mono.just ( Person.builder ( ).id ( id ).name ( "Sofka" ).apellido ( "University" ).edad ( 10 ).direccion ( "Calle 11" ).build ( ) );
    }


}
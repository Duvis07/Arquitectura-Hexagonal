package co.com.sofka.sofkaservice;

import co.com.sofka.model.person.Person;
import co.com.sofka.model.person.gateways.PersonService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class ApiService implements PersonService {


    @Override
    public Mono < Person > getPerson ( String id ) {
        return Mono.just ( Person.builder ( ).id ( id ).name ( "Juan" ).balance ( "100" ).build ( ) );
    }

    @Override
    public Mono < Float > getBalance ( String id ) {
        return Mono.just ( 100f );
    }
}
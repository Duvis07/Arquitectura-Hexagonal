package co.com.sofka.model.person.gateways;

import co.com.sofka.model.person.Person;
import reactor.core.publisher.Mono;

public interface PersonService {

    Mono<Person> getPerson(String id);

}

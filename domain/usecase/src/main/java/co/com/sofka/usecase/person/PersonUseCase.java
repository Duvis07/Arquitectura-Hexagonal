package co.com.sofka.usecase.person;

import co.com.sofka.model.person.Person;
import co.com.sofka.model.person.gateways.PersonService;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class PersonUseCase {


    private final PersonService personService;


    public Mono< Person > getPerson(String id){
        return personService.getPerson(id);

    }


    public Mono< Float > getBalance(String id){
        return personService.getBalance(id);
    }



}

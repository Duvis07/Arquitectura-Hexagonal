package co.com.sofka.model.person;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class Person {

    private String id;
    private String name;
    private String balance;


}

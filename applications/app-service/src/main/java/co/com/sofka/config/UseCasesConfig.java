package co.com.sofka.config;

import co.com.sofka.model.person.gateways.PersonService;
import co.com.sofka.usecase.person.PersonUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackages = "co.com.sofka.usecase",
        includeFilters = {
                @ComponentScan.Filter(type = FilterType.REGEX, pattern = "^.+UseCase$")
        },
        useDefaultFilters = false)
public class UseCasesConfig {

        @Bean
        public PersonUseCase getPersonUseCase( PersonService personService){
                return new PersonUseCase(personService);

        }



}

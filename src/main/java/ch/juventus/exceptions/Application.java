package ch.juventus.exceptions;

public class Application {

    public static void main(String[] args) {

        PersonRepository personRepository = new PersonRepository();

        try {
            personRepository.findById(42);
        } catch (PersonNotFoundException e) {
            System.err.println(e.getMessage());
        }

        personRepository.addPerson(null);

    }

}

package _07_abstract_factory;

public interface BikeFactory {

    Handlebars createHandlebars();
    Pedals createPedals();
    Tire createTire();

}

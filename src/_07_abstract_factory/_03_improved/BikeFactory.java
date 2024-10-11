package _07_abstract_factory._03_improved;

public interface BikeFactory {

    Handlebars createHandlebars();
    Pedals createPedals();
    Tire createTire();

}

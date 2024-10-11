package _07_abstract_factory._03_improved;

public class RoadBikeFactory implements BikeFactory {
    @Override
    public Handlebars createHandlebars() {
        return new RoadBikeHandlebars();
    }

    @Override
    public Pedals createPedals() {
        return new RoadBikePedals();
    }

    @Override
    public Tire createTire() {
        return new RoadBikeTire();
    }
}

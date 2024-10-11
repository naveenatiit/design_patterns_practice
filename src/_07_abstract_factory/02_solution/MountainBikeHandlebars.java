package _07_abstract_factory;

public class MountainBikeHandlebars implements Handlebars {
    @Override
    public String getType() {
        return "FLAT";
    }
}

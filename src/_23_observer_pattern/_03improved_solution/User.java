package _23_observer_pattern._03improved_solution;

import java.beans.PropertyChangeSupport;

public class User {

    private String status;
    private PropertyChangeSupport support = new PropertyChangeSupport(this);

    public void setStatus(String status) {
        support.firePropertyChange("status", this.status, status);
        this.status = status;
    }

    public void addPropertyChangeListener(Newsfeed newsfeed) {
        support.addPropertyChangeListener(newsfeed);
    }
}

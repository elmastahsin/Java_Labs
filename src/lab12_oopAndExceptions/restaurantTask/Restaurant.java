package lab12_oopAndExceptions.restaurantTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

    private String ownername, location;
    private double numberOfStars;
    private final ArrayList<Server> servers;
    private final ArrayList<Chef> chefs;

    public Restaurant(String ownername, String location, double numberOfStars) {
        setOwnername(ownername);
        setLocation(location);
        setNumberOfStars(numberOfStars);
        servers = new ArrayList<>();
        chefs = new ArrayList<>();
    }

    public ArrayList<Server> getServers() {
        return servers;
    }

    public ArrayList<Chef> getChefs() {
        return chefs;
    }

    public String getOwnername() {
        return ownername;
    }

    public void setOwnername(String ownername) {
        this.ownername = ownername;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getNumberOfStars() {
        return numberOfStars;
    }

    public void setNumberOfStars(double numberOfStars) {
        if (numberOfStars < 0 || numberOfStars > 5) {
            throw new IllegalArgumentException("Number of stars must be between 0 ~ 5");
        }

        this.numberOfStars = numberOfStars;
    }

    public void hireServer(Server server) {
        if (server == null) {
            throw new NullPointerException("Server Object cannot be null");
        }
        servers.add(server);
    }

    public void hireServer(Server[] servers) {
        for (Server each : servers) {
            if (each == null) {
                throw new NullPointerException("Server Object cannot be null");
            }
        }
        this.servers.addAll(Arrays.asList(servers));
    }

    public void hireChef(Chef chef) {
        if (chef == null) {
            throw new NullPointerException("Chef Object cannot be null");
        }
        chefs.add(chef);
    }

    public void hireChef(Chef[] chefs) {
        for (Chef each : chefs) {
            if (each == null) {
                throw new NullPointerException("Chef Object cannot be null");
            }
        }
        this.chefs.addAll(Arrays.asList(chefs));
    }

    public void terminateChef(String id) {
        chefs.removeIf(p -> p.getId().equalsIgnoreCase(id));
    }

    public void terminateServer(String id) {
        servers.removeIf(p -> p.getId().equalsIgnoreCase(id));
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "ownername='" + ownername + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", number of servers=" + servers.size() +
                ", number of chefs=" + chefs.size() +
                '}';
    }

}

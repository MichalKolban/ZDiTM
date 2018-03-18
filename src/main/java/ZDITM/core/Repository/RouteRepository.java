package ZDITM.core.Repository;

import ZDITM.core.model.Route;

import java.util.ArrayList;
import java.util.List;

public class RouteRepository implements FeedRepository<Route> {

    private final List<Route> routeList = new ArrayList<>();

    public void insert(Route feed) {routeList.add(feed);}

    public void delete(Route feed) {routeList.remove(feed);}

    @Override
    public void delete(String id) {

    }

    @Override
    public void update(Route feed) {

    }

    @Override
    public String add(Route feed) {
        return null;
    }

    @Override
    public List<Route> getAll() {
        return null;
    }
}

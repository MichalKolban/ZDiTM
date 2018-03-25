package ZDITM.core.Repository;

import ZDITM.core.model.Trip;

import java.util.ArrayList;
import java.util.List;

public class TripRepository implements FeedRepository<Trip> {

    private final List<Trip> tripList = new ArrayList<>();

    public void insert(Trip feed) {tripList.add(feed);}

    public void delete(Trip feed) {tripList.remove(feed);}

    @Override
    public void delete(String id) {

    }

    @Override
    public void update(Trip feed) {

    }

    @Override
    public String add(Trip feed) {
        return null;
    }

    @Override
    public List<Trip> getAll() {
        return tripList;
    }
}

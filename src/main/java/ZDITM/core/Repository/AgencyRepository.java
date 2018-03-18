package ZDITM.core.Repository;

import ZDITM.core.model.Agency;

import java.util.ArrayList;
import java.util.List;

public class AgencyRepository implements FeedRepository<Agency> {

    private final List<Agency> agencyList = new ArrayList<>();

    public void insert(Agency feed) {agencyList.add(feed);}

    public void delete(Agency feed) {agencyList.remove(feed);}

    @Override
    public void delete(String id) {

    }

    @Override
    public void update(Agency feed) {

    }

    @Override
    public String add(Agency feed) {
        return null;
    }

    public List<Agency> getAll(){ return agencyList;}

}

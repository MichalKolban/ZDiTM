package ZDITM.Repository;

import ZDITM.model.FeedModel;

import java.util.List;

public interface FeedRepository<T extends  FeedModel> {

        void insert(T feed);

        void delete(T feed);

        void delete (String id);

        void update(T feed);

        String add (T feed);

        List<T> getAll();
    }


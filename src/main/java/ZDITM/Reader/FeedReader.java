package ZDITM.Reader;

import ZDITM.model.FeedModel;

public interface FeedReader<T extends FeedModel> {
    void read();

    String getFileDir();

}

package ZDITM.core.Reader;

import ZDITM.core.model.FeedModel;

public interface FeedReader<T extends FeedModel> {
    void read();

    String getFileDir();

}

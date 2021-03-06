package ZDITM.core.parser;

import ZDITM.core.model.FeedModel;

public interface FeedParser<T extends FeedModel> {

    public static final String DATA_DELIMITIER = ",";

    T parseTo(String feedInfo);

}

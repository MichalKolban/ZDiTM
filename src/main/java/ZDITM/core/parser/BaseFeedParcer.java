package ZDITM.core.parser;

import ZDITM.core.model.FeedModel;

public abstract class BaseFeedParcer<T extends FeedModel> implements FeedParser {

    protected String[] splitFeedInfo;

    public BaseFeedParcer(){
        super();
    }

    public FeedModel parseTo(String feedInfo) {
        splitFeedInfo = feedInfo.split(FeedParser.DATA_DELIMITIER, -1);
        return null;
    }

}

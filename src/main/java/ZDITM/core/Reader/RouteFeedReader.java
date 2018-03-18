package ZDITM.core.Reader;

import ZDITM.core.Repository.FeedRepository;
import ZDITM.core.model.Route;
import ZDITM.core.parser.FeedParser;

public class RouteFeedReader extends BaseFeedReader<Route> {

    public RouteFeedReader(FeedParser<Route> parser, FeedRepository<Route> repository){
        super(parser, repository);
    }

    @Override
    public String getFileDir() {
        return "./resources/routes.txt";
    }
}

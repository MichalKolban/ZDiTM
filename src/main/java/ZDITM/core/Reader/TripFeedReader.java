package ZDITM.core.Reader;

import ZDITM.core.Repository.FeedRepository;
import ZDITM.core.model.Trip;
import ZDITM.core.parser.BaseFeedParcer;
import ZDITM.core.parser.FeedParser;

public class TripFeedReader extends BaseFeedReader<Trip> {

    public TripFeedReader(FeedParser<Trip> parser, FeedRepository<Trip> repository){
        super( parser, repository);
    }

    @Override
    public String getFileDir() {
        return "./resources/trips.txt";
    }
}

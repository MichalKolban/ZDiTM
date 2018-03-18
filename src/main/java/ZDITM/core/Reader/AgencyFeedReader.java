package ZDITM.core.Reader;

import ZDITM.core.Repository.FeedRepository;
import ZDITM.core.model.Agency;
import ZDITM.core.parser.FeedParser;

public class AgencyFeedReader extends BaseFeedReader<Agency> {

    public AgencyFeedReader(FeedParser<Agency> parser, FeedRepository<Agency> repository) {
        super(parser,repository);
    }

    @Override
    public String getFileDir() {
        return "./resources/agency.txt";
    }
}

package ZDITM.Reader;

import ZDITM.Repository.FeedRepository;
import ZDITM.model.Agency;
import ZDITM.parser.FeedParser;

public class AgencyFeedReader extends BaseFeedReader<Agency> {

    public AgencyFeedReader(FeedParser<Agency> parser, FeedRepository<Agency> repository){
        super(parser,repository);
    }

    @Override
    public String getFileDir() {
        return "./resources/agency.txt";
    }
}

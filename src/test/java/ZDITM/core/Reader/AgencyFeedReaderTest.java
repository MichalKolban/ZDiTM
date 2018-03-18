package ZDITM.core.Reader;

import ZDITM.core.Reader.AgencyFeedReader;
import ZDITM.core.Reader.FeedReader;
import ZDITM.core.Repository.AgencyRepository;
import ZDITM.core.Repository.FeedRepository;
import ZDITM.core.model.Agency;
import ZDITM.core.parser.AgencyParser;
import ZDITM.core.parser.FeedParser;
import org.junit.Before;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class AgencyFeedReaderTest{

    private FeedRepository<Agency> repository;
    private FeedParser<Agency> agencyParser;
    private FeedReader<Agency> agencyFeedReader;

    @Before
    public void setUp() throws Exception{
        repository = new AgencyRepository();
        agencyParser = new AgencyParser();
        agencyFeedReader = new AgencyFeedReader(agencyParser, repository);
    }

    @org.junit.Test
    public void testParseAgency(){

        //given

        //when
        agencyFeedReader.read();
        List<Agency> list = repository.getAll();

        //then
        assertTrue(!list.isEmpty());
        assertEquals(1, list.size());
    }
}

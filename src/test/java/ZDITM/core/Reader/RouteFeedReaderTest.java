package ZDITM.core.Reader;

import ZDITM.core.Repository.FeedRepository;
import ZDITM.core.Repository.RouteRepository;
import ZDITM.core.model.Route;
import ZDITM.core.parser.FeedParser;
import ZDITM.core.parser.RouteParser;
import org.junit.Before;

import java.util.List;

import static org.junit.Assert.*;

public class RouteFeedReaderTest {

    private FeedRepository<Route> repository;
    private FeedParser<Route> routeParser;
    private FeedReader<Route> routeFeedReader;

    @Before
    public void setUp() throws Exception{
        repository = new RouteRepository();
        routeParser = new RouteParser();
        routeFeedReader = new RouteFeedReader(routeParser, repository);
    }

    public void testParseRoute(){

        //given

        //when
        routeFeedReader.read();
        List<Route> list = repository.getAll();

        //then
        assertTrue(!list.isEmpty());
        assertEquals(1,list.size());
    }


}
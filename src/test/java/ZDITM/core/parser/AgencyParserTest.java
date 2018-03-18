package ZDITM.core.parser;

import ZDITM.core.model.Agency;
import org.junit.Before;
import org.junit.Test;

public class AgencyParserTest {

    private static final String TEST_LINE = "ZDiTM Szczecin,http://www.zditm.szczecin.pl,Europe/Warsaw,pl,91 480 04 03";
    private FeedParser<Agency> agencyParser;
    private Agency agency;

    @Before
    public void setUp() throws Exception{
        agencyParser = new AgencyParser();
        agency = new Agency("ZDiTM Szczecin" ,"http://www.zditm.szczecin.pl","Europe/Warsaw","pl","91 480 04 03");
    }

    @Test
    public void testParseAgency(){
        //given
        Agency testAgency;

        //when
        testAgency = agencyParser.parseTo(TEST_LINE);

        //then
        assertEquals(testAgency.getAgencyName(),agency.getAgencyName());
        assertEquals(testAgency.getAgencyUrl(),agency.getAgencyUrl());
        assertEquals(testAgency.getAgencyTimezone(),agency.getAgencyTimezone());
        assertEquals(testAgency.getAgencyLang(),agency.getAgencyLang());
        assertEquals(testAgency.getAgencyPhone(),agency.getAgencyPhone());
    }
}
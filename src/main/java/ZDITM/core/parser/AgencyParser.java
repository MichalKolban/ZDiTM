package ZDITM.core.parser;

import ZDITM.core.model.Agency;
import ZDITM.core.model.FeedModel;

public class AgencyParser extends BaseFeedParcer<Agency> {

    private static final int AGENCY_NAME_COLUMN = 0;
    private static final int AGENCY_URL_COLUMN = 1;
    private static final int AGENCY_TIMEZONE_COLUMN = 2;
    private static final int AGENCY_LANG_COLUMN = 3;
    private static final int AGENCY_PHONE_COLUMN = 4;

    @Override
    public FeedModel parseTo(String feedInfo) {
        super.parseTo(feedInfo);
        Agency agency = new Agency();
        agency.setAgencyName(splitFeedInfo[AGENCY_NAME_COLUMN]);
        agency.setAgencyUrl(splitFeedInfo[AGENCY_URL_COLUMN]);
        agency.setAgencyTimezone(splitFeedInfo[AGENCY_TIMEZONE_COLUMN]);
        agency.setAgencyLang(splitFeedInfo[AGENCY_LANG_COLUMN]);
        agency.setAgencyPhone(splitFeedInfo[AGENCY_PHONE_COLUMN]);
        return agency;
    }
}

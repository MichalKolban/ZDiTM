package ZDITM.module;

import ZDITM.core.Repository.AgencyRepository;
import ZDITM.core.Repository.FeedRepository;
import ZDITM.core.Repository.RouteRepository;
import ZDITM.core.model.Agency;
import ZDITM.core.model.Route;

public class RepositoryModule {

    private static FeedRepository<Agency> agencyRepository;

    public static FeedRepository<Agency> provideAgencyRepository() {
        if (agencyRepository == null) {
            agencyRepository = new AgencyRepository();
        }
        return agencyRepository;
    }


    private static FeedRepository<Route> routeRepository;

    public static FeedRepository<Route> provideRouteRepository(){
        if(routeRepository == null){
            routeRepository = new RouteRepository();
        }
        return routeRepository;
    }
}

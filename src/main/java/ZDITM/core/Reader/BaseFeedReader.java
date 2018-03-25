package ZDITM.core.Reader;

import ZDITM.core.Repository.FeedRepository;
import ZDITM.core.model.FeedModel;
import ZDITM.core.parser.FeedParser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public abstract class BaseFeedReader <T extends FeedModel> implements FeedReader<T> {

    private final FeedParser<T> parser;
    private final FeedRepository<T> repository;

    public BaseFeedReader(FeedParser<T> parser, FeedRepository<T> repository) {
        this.parser = parser;
        this.repository = repository;
    }

    @Override
    public void read() {
        try {
            Files.lines(Paths.get(getFileDir())).skip(1).forEach(
                    line -> repository.insert(parser.parseTo(line))
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


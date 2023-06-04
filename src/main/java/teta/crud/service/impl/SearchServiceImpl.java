package teta.crud.service.impl;

import lombok.AllArgsConstructor;
import net.jcip.annotations.ThreadSafe;
import org.springframework.stereotype.Service;
import teta.crud.dto.SearchDTO;
import teta.crud.service.SearchService;
import teta.crud.service.Searcher;

import java.util.List;

@Service
@AllArgsConstructor
@ThreadSafe
public class SearchServiceImpl<T> implements SearchService {

    private final List<Searcher<?>> searchers;

    @Override
    public Searcher<?> getSearcher(SearchDTO searchDto) {
        return searchers.stream()
                .filter(searcher -> searcher.isValid(searchDto))
                .findFirst()
                .orElse(null);
    }

}

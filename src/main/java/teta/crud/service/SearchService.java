package teta.crud.service;

import teta.crud.dto.SearchDTO;

public interface SearchService {
    Searcher<?> getSearcher(SearchDTO searchDto);
}

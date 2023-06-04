package teta.crud.service;

import teta.crud.dto.SearchDTO;

/**
 * Search Service
 */
public interface SearchService {
    Searcher<?> getSearcher(SearchDTO searchDto);
}

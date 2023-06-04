package teta.crud.service;

import teta.crud.dto.SearchDTO;

/**
 * Searcher interface
 */
public interface Searcher<T> {
    boolean isValid(SearchDTO searchDto);

    T findBy(SearchDTO searchDto);

}
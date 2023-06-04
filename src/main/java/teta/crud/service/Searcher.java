package teta.crud.service;

import teta.crud.dto.SearchDTO;

public interface Searcher<T> {
    boolean isValid(SearchDTO searchDto);

    T findBy(SearchDTO searchDto);

}
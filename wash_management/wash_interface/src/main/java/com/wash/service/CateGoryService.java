package com.wash.service;

import com.wash.domain.WashCategory;

import java.util.List;

public interface CateGoryService {

        List<WashCategory> queryCateGorys();

        List<WashCategory> queryCateGorysById(Long id);
}

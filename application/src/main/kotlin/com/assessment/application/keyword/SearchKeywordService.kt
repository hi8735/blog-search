package com.assessment.application.keyword

import com.assessment.domain.keyword.SearchKeyword
import com.assessment.domain.keyword.SearchKeywordRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class SearchKeywordService (
    private val searchKeywordRepository: SearchKeywordRepository
) {
    fun countKeyword(keyword: String) {
        val searchKeyword = searchKeywordRepository.findByKeyword(keyword)
            ?: SearchKeyword.create(keyword = keyword)

        searchKeyword.searched()
        searchKeywordRepository.save(searchKeyword)
    }
}
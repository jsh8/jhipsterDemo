package io.github.jhipster.demo.repository.search;

import io.github.jhipster.demo.domain.Country;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the Country entity.
 */
public interface CountrySearchRepository extends ElasticsearchRepository<Country, Long> {
}

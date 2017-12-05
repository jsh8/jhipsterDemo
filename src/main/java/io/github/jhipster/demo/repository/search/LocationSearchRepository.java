package io.github.jhipster.demo.repository.search;

import io.github.jhipster.demo.domain.Location;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the Location entity.
 */
public interface LocationSearchRepository extends ElasticsearchRepository<Location, Long> {
}

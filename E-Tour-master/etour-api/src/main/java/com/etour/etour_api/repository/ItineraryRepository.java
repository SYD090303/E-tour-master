package com.etour.etour_api.repository;

import com.etour.etour_api.entity.ItineraryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @version 1.0
 * @project etour-api
 * @since 27-01-2025
 */

@Repository
public interface ItineraryRepository extends JpaRepository<ItineraryEntity, Long> {
}

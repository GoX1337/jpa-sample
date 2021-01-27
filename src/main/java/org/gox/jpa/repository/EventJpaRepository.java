package org.gox.jpa.repository;

import org.gox.jpa.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventJpaRepository extends JpaRepository<Event, Long> {
}

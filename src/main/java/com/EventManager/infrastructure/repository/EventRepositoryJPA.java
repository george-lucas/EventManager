package com.EventManager.infrastructure.repository;

import com.EventManager.infrastructure.persistence.entity.EventEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepositoryJPA extends JpaRepository<EventEntity, Long> {

}

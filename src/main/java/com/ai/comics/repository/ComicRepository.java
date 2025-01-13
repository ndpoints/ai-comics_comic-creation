package com.ai.comics.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ai.comics.entity.ComicEntity;

@Repository
public interface ComicRepository extends JpaRepository<ComicEntity, Integer> {
}
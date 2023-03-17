package com.xxavierr404.dreambuildr.repositories;

import com.xxavierr404.dreambuildr.models.Videocard;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Spring Репозиторий видеокарт
 */
@Repository
public interface VideocardRepository extends CrudRepository<Videocard, Long> {
    /**
     * Метод поиска по id
     * @param from - Левая граница
     * @param to - Правая граница
     * @return Список видеокарт
     */
    List<Videocard> findAllByIdBetween(Long from, Long to);
}

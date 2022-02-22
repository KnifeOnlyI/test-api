package fr.koi.testapi.mapper;

import java.util.List;
import java.util.Set;

/**
 * Base mapper
 *
 * @param <E> Entity type
 * @param <D> DTO type
 */
public interface BaseMapper<E, D> {
    /**
     * DTO to entity
     *
     * @param dto The DTO
     *
     * @return The entity
     */
    E dtoToEntity(D dto);

    /**
     * Entity to DTO
     *
     * @param entity The entity
     *
     * @return The DTO
     */
    D entityToDTO(E entity);

    /**
     * DTOs to entities
     *
     * @param dtos The DTOs
     *
     * @return The entities
     */
    List<E> dtoListToEntityList(List<D> dtos);

    /**
     * Entities to DTOs
     *
     * @param entities The entities
     *
     * @return The DTOs
     */
    List<D> entityListToDTOList(List<E> entities);

    /**
     * DTOs to entities
     *
     * @param dtos The DTOs
     *
     * @return The entities
     */
    Set<E> dtoSetToEntitySet(Set<D> dtos);

    /**
     * Entities to DTOs
     *
     * @param entities The entities
     *
     * @return The DTOs
     */
    Set<D> entitySetToDTO(Set<E> entities);
}

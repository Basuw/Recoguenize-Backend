package recoguenize.com.backend.mapper.common;

/**
 * Interface to use when mapping a dto to an entity or an entity to a dto.
 * 
 * @param D
 *          The dto type.
 * @param E
 *          The entity type.      
 */
public interface RecoguenizeMapper<D, E> {

    /**
     * Map an entity to a dto.
     * 
     * @param entity
     *          The enetity.
     * @return
     *          The dto.
     */
    public D toDto(E entity);

    /**
     * Map a dto to an entity.
     * 
     * @param dto
     *          The dto.
     * @return
     *          The entity.
     */
    public E toEntity(D dto);
}

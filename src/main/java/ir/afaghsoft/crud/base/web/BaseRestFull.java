package ir.afaghsoft.crud.base.web;

import ir.afaghsoft.crud.base.BaseDTO;
import ir.afaghsoft.crud.base.BaseEntity;
import ir.afaghsoft.crud.base.mapper.BaseMapper;
import ir.afaghsoft.crud.base.service.BaseService;
import ir.afaghsoft.crud.exception.BadInputRunTimeException;
import org.springframework.http.ResponseEntity;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public class BaseRestFull<E extends BaseEntity<PK>,
        D extends BaseDTO<PK>, PK extends Serializable,
        S extends BaseService<E, PK>, M extends BaseMapper<E, D>> {

    private final M mapper;

    private final S service;

    public BaseRestFull(M mapper, S service) {
        this.mapper = mapper;
        this.service = service;
    }


    // Get All
    public ResponseEntity<List<D>> getAll() {

        return ResponseEntity.ok(
                mapper.convertListEntityToListDTO(
                        service.findAllNotSecure()
                )
        );
    }

    // find by id

    public ResponseEntity<D> findById(PK id) {

        Optional<E> optionalE = service.findById(id);

        return optionalE.map(
                e -> ResponseEntity.ok(
                        mapper.convertDTOToEntity(e)
                )
        ).orElseThrow(() -> new BadInputRunTimeException("Entity Not found..."));
    }


    public ResponseEntity<Void> deleteById(PK id) {
        service.deleteById(id);
        return ResponseEntity.ok().build();
    }


    public ResponseEntity<D> save(D d) {
        if (d.getId() != null) {
            return ResponseEntity.badRequest().build();
        }

        E entity = service.saveNotSecure(
                mapper.convertEntityToDTO(d)
        );

        return ResponseEntity.ok(
                mapper.convertDTOToEntity(entity)
        );
    }


    public ResponseEntity<D> update(D d) {
        if (d.getId() == null) {
            return ResponseEntity.badRequest().build();
        }

        E entity = mapper.convertEntityToDTO(d);
        entity.setId(d.getId());
        E updateEntity = service.saveNotSecure(
                entity
        );

        return ResponseEntity.ok(
                mapper.convertDTOToEntity(updateEntity)
        );
    }


}

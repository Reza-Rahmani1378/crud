package ir.afaghsoft.crud.base.service;

import ir.afaghsoft.crud.base.BaseEntity;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface BaseService<E extends BaseEntity<PK>, PK extends Serializable> {

    E saveNotSecure(E e);

    List<E> saveAllNotSecure(Collection<E> collection);

    Optional<E> findById(PK id);

    List<E> findAllNotSecure();

    void deleteById(PK id);


}

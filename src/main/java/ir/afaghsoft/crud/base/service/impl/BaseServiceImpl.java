package ir.afaghsoft.crud.base.service.impl;

import ir.afaghsoft.crud.base.BaseEntity;
import ir.afaghsoft.crud.base.service.BaseService;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class BaseServiceImpl<E extends BaseEntity<PK>, PK extends Serializable, R extends JpaRepository<E, PK>>
        implements BaseService<E, PK> {

    private final R repository;

    public BaseServiceImpl(R repository) {
        this.repository = repository;
    }

    @Override
    public E saveNotSecure(E e) {
        return repository.save(e);
    }

    @Override
    public List<E> saveAllNotSecure(Collection<E> collection) {
        return repository.saveAll(collection);
    }

    @Override
    public Optional<E> findById(PK id) {
        return repository.findById(id);
    }

    @Override
    public List<E> findAllNotSecure() {
        return repository.findAll();
    }

    @Override
    public void deleteById(PK id) {
        repository.deleteById(id);
    }
}

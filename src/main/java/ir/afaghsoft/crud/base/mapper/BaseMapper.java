package ir.afaghsoft.crud.base.mapper;

import java.util.List;

public interface BaseMapper<E, D> {

    E convertEntityToDTO(D d);

    D convertDTOToEntity(E e);

    List<D> convertListEntityToListDTO(List<E> eList);

    List<E> convertListDTOToListEntity(List<D> dList);
}

package devsearch.common.utils.mapper;

public interface Mapper {
    public <D> D map(Object source, Class<D> destinationType);
}

package devsearch.common.utils.mapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;

public class StrictMapperImpl implements Mapper {

    private ModelMapper modelMapper;

    public StrictMapperImpl() {
	modelMapper = new ModelMapper();
	modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
    }

    public <D> D map(Object source, Class<D> destinationType) {
	return modelMapper.map(source, destinationType);
    }
}

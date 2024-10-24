package reproducer;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(builder = @Mapper.Builder(disableBuilder = true))
interface ABMapper {
    @Mapping(target = "id", constant = "321")
    B map(A a);
    A map(B b);
}

package reproducer;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
interface ABMapper {
    @Mapping(target = "id", constant = "321")
    B map(A a);
    A map(B b);
}

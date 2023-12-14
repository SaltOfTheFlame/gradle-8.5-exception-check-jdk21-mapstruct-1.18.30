package reproducer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class B extends A implements Serializable {

    @Serial
    private static final long serialVersionUID = -1079357918022637158L;

    private int id;
}

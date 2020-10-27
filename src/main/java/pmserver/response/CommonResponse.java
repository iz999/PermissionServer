package pmserver.response;

import lombok.*;
import java.util.List;

@Getter 
@Setter
@NoArgsConstructor
public class CommonResponse<T> {
	private T data;
    private List<String> errors;
}

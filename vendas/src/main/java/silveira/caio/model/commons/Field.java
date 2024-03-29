package silveira.caio.model.commons;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Field {

	private String id;
	private Integer row;
	private Integer order;
	private String title;
	private String type;
	private String styleClass;
	private String mask;
	private Boolean readonly;
}

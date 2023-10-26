package silveira.caio.model.order.repository.entity.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderDTO {

	
	private Long id;
	private LocalDateTime date;
	private PaymentDTO payment;
	private String clientName;
}

package it.dedagroup.project_cea.dto.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//TODO Implementare le validation di Apartment
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddApartmentDto {
	@Min(value = 1)
	@NotNull(message = "Insert a value in field unit number")
	private int unitNumber;
	@Min(value = 1)
	@NotNull(message = "Insert a value in field floor number")
	private int floorNumber;
	@Min(value = 1)
	@NotNull(message = "Insert a value in field customer id")
	private int id_customer;
	@Min(value = 1)
	@NotNull(message = "Insert a value in field condominium id")
	private int id_condominium;
}

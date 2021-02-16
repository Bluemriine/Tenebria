package com.bluemriine.tenebria;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.io.Serializable;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@EqualsAndHashCode
public class ImportResultatConfrontationMembre implements Serializable {

	private static final long serialVersionUID = -1L;

	@NotNull
	private String pseudo;

	@NotNull
	private Integer defWin;

	@NotNull
	private Integer defDraw;

	@NotNull
	private Integer defLoose;

	@NotNull
	private Integer atkWin;

	@NotNull
	private Integer atkDraw;

	@NotNull
	private Integer atkLoose;

	@Null
	private Integer contributionOff;

	@Null
	private Integer contributionDef;
}


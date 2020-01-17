package com.diego.IoC.interfaces.espana;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.diego.IoC.interfaces.Iva;


@Component
@Qualifier("espana")
public class Espana implements Iva{

	@Override
	public double getIva() {
		return 0.21;
	}

}

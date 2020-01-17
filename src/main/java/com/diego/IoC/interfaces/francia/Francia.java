package com.diego.IoC.interfaces.francia;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.diego.IoC.interfaces.Iva;


@Component
@Qualifier("francia")
public class Francia implements Iva{

	@Override
	public double getIva() {

		return 0.25;
	}

}

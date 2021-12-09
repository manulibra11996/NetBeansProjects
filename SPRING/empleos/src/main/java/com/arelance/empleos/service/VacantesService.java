package com.arelance.empleos.service;

import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.arelance.empleosmodelo.Vacante;

@Service
public class VacantesService implements IVacantesServices {
	private List<Vacante> vacantes ;
public VacantesService() {
	vacantes = getVacantes();
}
	@Override
	public List<Vacante> listarVacantes() {
		return vacantes;
	}

	@SuppressWarnings("finally")
	private  List<Vacante> getVacantes() {
		List<Vacante> vacantes = new LinkedList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy");
		try {
			Vacante v1 = new Vacante();
			v1.setId(1);
			v1.setNombre("nombre1");
			v1.setDescripcion("descripcion 1");
			v1.setSalario(19000.0);
			v1.setFecha(sdf.parse("23-08-2022"));
			v1.setDestacado(0);
			v1.setImagen("empresa1.png");
			vacantes.add(v1);

			Vacante v2 = new Vacante();
			v2.setId(2);
			v2.setNombre("nombre 2");
			v2.setDescripcion("descripcion 2");
			v2.setSalario(18000.0);
			v2.setFecha(sdf.parse("15-09-2022"));
			v2.setImagen("empresa3.png");
			v2.setDestacado(1);
			vacantes.add(v2);

			Vacante v3 = new Vacante();
			v3.setId(3);
			v3.setNombre("nombre 3");
			v3.setDescripcion("descripcion 3");
			v3.setSalario(19000.0);
			v3.setFecha(sdf.parse("04-01-2023"));
			v3.setDestacado(1);
			vacantes.add(v3);
		} catch (Exception e) {
			throw e;
		} finally {
			return vacantes;
		}
	}

	@Override
	public Vacante buscarPorID(Integer idVacante) {
		Vacante vacante = null;
		for(Vacante vacanteItem:vacantes) {
			if(vacanteItem.getId()==idVacante) {
				vacante=vacanteItem;
				break;
			}
		}
		return vacante;
	}

	@Override
	public boolean altaVacante(Vacante vacante) {
		
		return this.vacantes.add(vacante);
	}
	@Override
	public boolean bajaVacante(Vacante vacante) {
		
		return this.vacantes.remove(vacante);
	}
	
}

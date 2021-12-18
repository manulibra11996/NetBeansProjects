package Services;

import java.util.List;

import org.springframework.stereotype.Service;

import Beans.Vacante;

@Service
public class VacantesServices implements IVacantesServices{
	
	private List<Vacante> vacantes;
	public VacantesServices() {
		vacantes = getVacantes();
	}

	public  List<Vacante> getVacantes(){
		return vacantes;
	}
	
	@Override
	public List<Vacante> listaVacantes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean IyectarVacante(Vacante vacante) {
		return false;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ModificarVacante(Vacante vacante) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void EliminarVacante(Vacante vacante) {
		// TODO Auto-generated method stub
		
	}

}

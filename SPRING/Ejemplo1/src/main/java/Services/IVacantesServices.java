package Services;

import java.util.List;

import Beans.Vacante;

public interface IVacantesServices {

	public List<Vacante> listaVacantes();
	public boolean IyectarVacante(Vacante vacante);
	public void ModificarVacante(Vacante vacante);
	public void EliminarVacante(Vacante vacante);
}

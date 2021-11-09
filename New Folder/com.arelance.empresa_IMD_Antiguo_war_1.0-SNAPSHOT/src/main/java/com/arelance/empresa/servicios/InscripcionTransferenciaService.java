/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.servicios;

import com.arelance.empresa.imd.domain.Inscripciontransferencia;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author usuar
 */
@Local
public interface InscripcionTransferenciaService {

    public List<Inscripciontransferencia> obtener();

    public void guardar(Inscripciontransferencia inscripciontransferencia);

    public void modificar(Inscripciontransferencia inscripciontransferencia);

    public void eliminar(Inscripciontransferencia inscripciontransferencia);
}

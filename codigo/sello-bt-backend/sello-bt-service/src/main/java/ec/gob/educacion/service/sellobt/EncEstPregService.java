package ec.gob.educacion.service.sellobt;

import java.util.List;
import ec.gob.educacion.sellobt.dto.EncuEstPregDTO;

/**
 * Interfaz para Derespuesta
 * 
 * @author Belen Changoluisa
 *
 */
public interface EncEstPregService {
	
	/**
	 * Permite buscar un derespuesta
	 * 
	 * @return listar pregunta
	 * @author Belen Changoluisa
	 */
	List<EncuEstPregDTO> listarEstudianteEncuentaPregunta(long penTipoPregunta, long estCodigo);
	


}

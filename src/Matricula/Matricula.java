package Matricula;

import java.util.Date;
import java.util.List;
public class Matricula {
    private int codigo;
    private Date fechaMatricula;
    private float importeFinal;
    private String curso;
    private List<Asignatura> asignaturas;

    public void addAsignatura(Asignatura asignatura) {
        // añadir asignatura a la lista de asignaturas
    }

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Date getFechaMatricula() {
		return fechaMatricula;
	}

	public void setFechaMatricula(Date fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}

	public float getImporteFinal() {
		return importeFinal;
	}

	public void setImporteFinal(float importeFinal) {
		this.importeFinal = importeFinal;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public List<Asignatura> getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(List<Asignatura> asignaturas) {
		this.asignaturas = asignaturas;
	}

    
}

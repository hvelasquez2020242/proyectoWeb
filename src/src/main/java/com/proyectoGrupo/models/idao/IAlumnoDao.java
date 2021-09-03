/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectoGrupo.models.idao;

import com.proyectoGrupo.models.domain.Alumno;
import java.util.List;

/**
 *
 * @author Hugo Daniel Velasquez Patzan Codigo Tecnico IN5BV
 * @date 30-ago-2021
 * @time 16:16:31
 */
public interface IAlumnoDao {

    public List<Alumno> listar();
<<<<<<< HEAD

    public Alumno encontrar(Alumno alumno);

    public int insertar(Alumno alumno);

    public int actualizar(Alumno alumno);

=======
    public Alumno encontrar(Alumno alumno);
    public int insertar(Alumno alumno);
    public int actualizar(Alumno alumno);
>>>>>>> cc3ac25e090acec462cbb0fc14283259921bb458
    public int eliminar(Alumno alumno);

}

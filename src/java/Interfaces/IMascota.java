/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Entidades.Mascota;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author SINQUIA
 */
public interface IMascota {

    public abstract boolean guardarMascota(Mascota mascota);
    public abstract ArrayList<Mascota> listarMascotas();
    public abstract boolean actualizarMascota(Session session,Mascota mascota);
    public abstract boolean eliminarMascota(Mascota mascota);
    public abstract ArrayList<Mascota> listPastor(Session sesion);
    public abstract ArrayList<Mascota> listSANDOR(Session sesion);
    public abstract Integer listCount(Session sesion);
    



}

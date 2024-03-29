/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import DAO.MascotaDao;
import Entidades.Mascota;
import Utilitarios.HibernateUtil;
import java.util.ArrayList;
import org.hibernate.Session;

/**
 *
 * @author SINQUIA
 */
public class Ejemplo05 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        // Listar de la base de datos la información de las mascotas cuyo Nombre sea Sandor: “Sandor”.

        ArrayList<Mascota> lista = new ArrayList<>();

        MascotaDao mascotadao = new MascotaDao();

        Session sesion = HibernateUtil.getSessionFactory().openSession();

        lista = mascotadao.listSANDOR(sesion);
      
        for (Mascota mascota : lista) {

            System.out.println(mascota.getNombreMascota());
        }
    }
}

package org.sebsy.grasps.Services;

import org.sebsy.grasps.Contracts.ITypeReservationService;
import org.sebsy.grasps.beans.TypeReservation;
import org.sebsy.grasps.daos.TypeReservationDao;

public class TypeReservationService implements ITypeReservationService {

    /**
     * DAO permettant d'accéder à la table des types de réservation
     */
    private TypeReservationDao typeReservationDao = new TypeReservationDao();

    @Override
    public TypeReservation extraireTypeReservation(String type) {
        return typeReservationDao.extraireTypeReservation(type);
    }
}

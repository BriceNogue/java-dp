package org.sebsy.grasps.Services;

import org.sebsy.grasps.Contracts.IClientService;
import org.sebsy.grasps.beans.Client;
import org.sebsy.grasps.daos.ClientDao;

public class ClientService implements IClientService {

    /**
     * DAO permettant d'accéder à la table des clients
     */
    private ClientDao clientDao = new ClientDao();

    @Override
    public Client extraireClient(String id) {
        return clientDao.extraireClient(id);
    }
}

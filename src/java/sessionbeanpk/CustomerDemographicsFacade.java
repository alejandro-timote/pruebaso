/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbeanpk;

import entidades.CustomerDemographics;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author alejandrotimote
 */
@Stateless
public class CustomerDemographicsFacade extends AbstractFacade<CustomerDemographics> {

    @PersistenceContext(unitName = "proyectogithubPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CustomerDemographicsFacade() {
        super(CustomerDemographics.class);
    }
    
}

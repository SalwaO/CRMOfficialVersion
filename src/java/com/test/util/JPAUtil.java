package com.test.util;

import com.crm.dao.Entreprisedao;
import com.crm.dao.EntreprisedaoLocal;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 *
 * @author soutamha
 */

@Singleton
@Startup
public class JPAUtil {
    
    @EJB
    private final EntreprisedaoLocal entrepriseDao;
    
    public JPAUtil() {
        
        this.entrepriseDao = new Entreprisedao();
    }
    
    @PostConstruct
    public void initializeDataBase() {
        
        entrepriseDao.ajouterEntreprise();
    }
    
}

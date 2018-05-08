package by.bsuir.pizzeria.dao.users;

import by.bsuir.pizzeria.beans.users.Verificationtoken;
import by.bsuir.pizzeria.dao.AbstractDao;
import org.springframework.stereotype.Repository;

import javax.persistence.NoResultException;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

@Repository
public class VerificationTokenDaoImpl extends AbstractDao<Long, Verificationtoken> implements VerificationTokenDao {

    @Override
    public Verificationtoken getByCode(String token) {
        try{
            //**creating CriteriaBuilder**
            CriteriaBuilder builder = getCriteriaBuilder();
            CriteriaQuery<Verificationtoken> criteria = builder.createQuery(Verificationtoken.class);
            Root<Verificationtoken> codeRoot = criteria.from(Verificationtoken.class);
            criteria.select(codeRoot);

            //**Adding where clause**
            criteria.where(builder.equal(codeRoot.get("token"), token));

            return getEntityManager().createQuery(criteria).getSingleResult();
        }

        catch (NoResultException nre){
            return null;
        }
    }
}

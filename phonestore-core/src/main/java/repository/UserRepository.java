package repository;

import config.HibernateSessionFactory;
import domain.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.io.Serializable;
import java.util.List;

public class UserRepository {

    private SessionFactory sessionFactory;

    public UserRepository() {
        this.sessionFactory = HibernateSessionFactory.INSTANCE.build();
    }

    public void createUser(User user) {
        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(user);
        //autre opération
        tx.commit();
        session.close();
    }

    public User findUser(Long userId) {
        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        User user = session.createQuery("select u " +
                "from User u " +
                "where u.id = :userId", User.class)
                .setParameter("userId", userId)
                .getSingleResult();
        tx.commit();
        session.close();
        return user;
    }

    public List<User> findUsers() {
        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        List<User> users = session.createQuery("select u " +
                "from User u ", User.class)
                .getResultList();
        tx.commit();
        session.close();
        return users;
    }
}

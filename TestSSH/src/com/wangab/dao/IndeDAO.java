package com.wangab.dao;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.wangab.model.Inde;

/**
 * A data access object (DAO) providing persistence and search support for Inde
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.wangab.model.Inde
 * @author MyEclipse Persistence Tools
 */

public class IndeDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(IndeDAO.class);
	// property constants
	public static final String USED = "used";

	protected void initDao() {
		// do nothing
	}

	public void save(Inde transientInstance) {
		log.debug("saving Inde instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Inde persistentInstance) {
		log.debug("deleting Inde instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Inde findById(java.lang.Integer id) {
		log.debug("getting Inde instance with id: " + id);
		try {
			Inde instance = (Inde) getHibernateTemplate().get(
					"com.wangab.model.Inde", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Inde instance) {
		log.debug("finding Inde instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Inde instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Inde as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByUsed(Object used) {
		return findByProperty(USED, used);
	}

	public List findAll() {
		log.debug("finding all Inde instances");
		try {
			String queryString = "from Inde";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Inde merge(Inde detachedInstance) {
		log.debug("merging Inde instance");
		try {
			Inde result = (Inde) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Inde instance) {
		log.debug("attaching dirty Inde instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Inde instance) {
		log.debug("attaching clean Inde instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static IndeDAO getFromApplicationContext(ApplicationContext ctx) {
		return (IndeDAO) ctx.getBean("IndeDAO");
	}
}
package com.ssh.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ssh.entity.UserBaseInfo;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * @author hbd(modify)
 * Dao实现
 */
@Repository("UserBaseInfoDao")
public class UserBaseInfoDaoImpl implements com.ssh.dao.UserBaseInfoDao {

    //    @Autowired
    protected SessionFactory sessionFactory;

    @Resource(name = "sessionFactory")
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

   /* //使用JDBCTemplate查询
    protected JdbcTemplate jdbcTemplate;

    //    @Autowired
    protected DataSource dataSource;

    @Resource(name = "dataSource")
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }*/


    @Override
    public List<UserBaseInfo> findUserBaseInfo() {
//		sql查询
//        String sql = "select id,name from user_base_info ";
//        Query query = sessionFactory.getCurrentSession().createSQLQuery(sql);

        // hql查询
        String hql = "from UserBaseInfo";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        return query.list();

        //使用JdbcTemplate查询
//        RowMapper<UserBaseInfo> rowMapper = new BeanPropertyRowMapper<UserBaseInfo>(UserBaseInfo.class);
//        String hql = "select id,name from user_base_info ";
////        return (List<UserBaseInfo>) new JdbcTemplate(dataSource).queryForObject(hql, rowMapper);
//        return (List<UserBaseInfo>) this.jdbcTemplate.queryForObject(hql, rowMapper);
    }

}

package com.example.deneme.service;

import com.example.deneme.mapper.UserMapper;
import com.example.deneme.model.MaritalStatus;
import com.example.deneme.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.*;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.stereotype.Service;

import java.sql.Types;
import java.util.List;
import java.util.Objects;

@Service
public class UserService implements IUserService {

    @Autowired
    private JdbcTemplate jtm;

    @Override
    public List<User> findAll(){
        String sql = "SELECT * FROM users";
        return jtm.query(sql, new UserMapper());
    }

    @Override
    public User findById(Long id){
        String sql = "SELECT * FROM users WHERE id=?";
        return jtm.queryForObject(sql, new Object[]{id}, new UserMapper());
    }
    
    @Override
    public User create(String name, MaritalStatus status){
        String sql = "INSERT INTO users(name, marital_status) VALUES (?, ?)";

        List<SqlParameter> decParams = List.of(new SqlParameter(Types.VARCHAR, "name"), new SqlParameter(Types.INTEGER, "marital_status"));

        PreparedStatementCreatorFactory pscf = new PreparedStatementCreatorFactory(sql, decParams) {
            {
                setReturnGeneratedKeys(true);
                setGeneratedKeysColumnNames("id");
            }
        };
        // PreparedStatementCreatorFactory is a helper class that creates multiple PreparedStatementCreator objects with different parameters based on an SQL statement
        // and a single set of parameter declarations.

        PreparedStatementCreator psc = pscf.newPreparedStatementCreator(List.of(name, status.ordinal()));
        // The newPreparedStatementCreator returns a new PreparedStatementCreator for the given parameters.

        GeneratedKeyHolder keyHolder = new GeneratedKeyHolder();
        jtm.update(psc, keyHolder);
        // A GeneratedKeyHolder is created and passed with the PreparedStatementCreator to the JdbcTemplate's update method.

        Long uid = Objects.requireNonNull(keyHolder.getKey().longValue());
        // We retrieve the auto-generated key value.

        return findById(uid);
        // The retrieved key value is used to find the newly generated user object that is returned back to the caller.
        
    }

}

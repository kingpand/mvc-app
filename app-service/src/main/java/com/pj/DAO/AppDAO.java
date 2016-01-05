package com.pj.DAO;

import com.pj.model.Author;
import org.springframework.stereotype.Repository;

/**
 * @author pengjin
 * @since  1/4/16 2:01 PM
 * @: <br>
 * <br>
 */
@Repository
public class AppDAO {

   public Author getById(long id) {
        return new Author("1","pj");
    }
}

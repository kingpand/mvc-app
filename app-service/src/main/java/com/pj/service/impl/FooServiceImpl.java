package com.pj.service.impl;

import com.pj.DAO.AppDAO;
import com.pj.model.Author;
import com.pj.service.FooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author pengjin
 * @date 1/4/16 3:24 PM
 * @description: <br>
 * <br>
 */
@Service
public class FooServiceImpl implements FooService {

    @Autowired
    private AppDAO  appDAO;

    public Author getAuthor(long id) {
        return appDAO.getById(id);
    }
}

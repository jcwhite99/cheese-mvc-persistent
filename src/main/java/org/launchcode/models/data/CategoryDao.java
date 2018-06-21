package org.launchcode.models.data;



import org.launchcode.models.Category;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;



import javax.transaction.Transactional;

import java.util.Locale;



/**

 * Created by cwhite on 6/20/2018.

 */

@Repository

@Transactional

public interface CategoryDao extends CrudRepository<Category, Integer> {

}

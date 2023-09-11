package pro.sky.KGstore;


import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
@SessionScope
public class Basket {

    private List<Long> listOfPurchases = new ArrayList<>();


    public void add(Long id) {
        listOfPurchases.add(id);
    }

    public List<Long> get() {
        return Collections.unmodifiableList(listOfPurchases);
    }
}

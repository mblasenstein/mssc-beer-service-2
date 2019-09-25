package guru.springframework.msscbeerservice.web.model;

import org.springframework.data.domain.PageImpl;

import java.io.Serializable;
import java.util.List;

/**
 * Created by jt on 2019-05-12.
 */
public class BeerPagedList extends PageImpl<BeerDto> implements Serializable {

    public BeerPagedList(List<BeerDto> content) {
        super(content);
    }
}

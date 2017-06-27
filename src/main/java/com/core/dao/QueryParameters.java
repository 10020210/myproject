package com.core.dao;

import java.util.Collection;

import javax.persistence.Query;

//import org.springframework.data.mongodb.core.query.Criteria;

public class QueryParameters {

    private final Object[][] queryParams;

    public QueryParameters(final Object[][] params) {
        this.queryParams = params;
    }

    public void fill(final Query query) {
        if (this.queryParams != null) {
            for (final Object[] params : this.queryParams) {
                query.setParameter(String.valueOf(params[0]), params[1]);
            }
        }
    }

    // TODO - This further needs to be improvised for various conditional combinations
    /**
    public Criteria getCriteria() {
        Criteria criteria = null;
        if (this.queryParams == null) {
            return criteria;
        }
        boolean firstKey = true;
        String paramName = null;
        Object paramValue = null;
        for (final Object[] params : this.queryParams) {
            paramName = String.valueOf(params[0]);
            paramValue = params[1];
            if (firstKey) {
                criteria = Criteria.where(paramName);
                firstKey = false;
            } else {
                criteria = criteria.and(paramName);
            }
            if (Collection.class.isAssignableFrom(paramValue.getClass())) {
                criteria = criteria.in((Collection<?>) paramValue);
            } else {
                QueryOperator queryOperator = QueryOperator.EQUALS;
                if (params.length == 3) {
                    queryOperator = (QueryOperator) params[2];
                }
                switch (queryOperator) {
                case EQUALS:
                    criteria = criteria.is(paramValue);
                    break;
                case NOT_EQUALS:
                    criteria = criteria.ne(paramValue);
                    break;
                case GREATER_THAN:
                    criteria = criteria.gt(paramValue);
                    break;
                case GREATER_THAN_OR_EQUALS:
                    criteria = criteria.gte(paramValue);
                    break;
                case LESS_THAN:
                    criteria = criteria.lt(paramValue);
                    break;
                case LESS_THAN_OR_EQUALS:
                    criteria = criteria.lte(paramValue);
                    break;
                }
            }
        }
        return criteria;
    } */
}

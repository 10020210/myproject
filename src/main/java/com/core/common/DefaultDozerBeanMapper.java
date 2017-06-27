package com.core.common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.dozer.DozerBeanMapper;

public class DefaultDozerBeanMapper extends DozerBeanMapper {
    private static final DefaultDozerBeanMapper MAPPER = new DefaultDozerBeanMapper();

    public static DefaultDozerBeanMapper getInstance() {
        return MAPPER;
    }

    public <O, D> Set<D> mapAsSet(final Collection<O> source, final Class<D> destType) {
        final Set<D> dest = new HashSet<>();
        this.tranform(source, dest, destType);
        return dest;
    }

    public <O, D> List<D> mapAsList(final Collection<O> source, final Class<D> destType) {
        final List<D> dest = new ArrayList<>();
        this.tranform(source, dest, destType);
        return dest;
    }

    private <O, D> void tranform(final Collection<O> source, final Collection<D> dest, final Class<D> destType) {
        for (final O element : source) {
            if (element == null) {
                continue;
            }
            dest.add(this.map(element, destType));
        }
    }

}

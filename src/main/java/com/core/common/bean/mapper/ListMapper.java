package com.core.common.bean.mapper;

import java.util.ArrayList;
import java.util.List;

import org.dozer.Mapper;

public class ListMapper {
    public static <O, D> List<D> map(final Mapper mapper, final List<O> source, final Class<D> destType) {

        final List<D> dest = new ArrayList<D>();

        for (final O element : source) {
            if (element == null) {
                continue;
            }
            dest.add(mapper.map(element, destType));
        }

        return dest;
    }
}

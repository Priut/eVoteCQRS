package com.licenta.cqrs.core.queries;

import com.licenta.cqrs.core.domain.BaseEntity;

import java.util.List;

@FunctionalInterface
public interface QueryHandlerMethod<T extends BaseQuery>{
    List<BaseEntity> handle(T entity);
}
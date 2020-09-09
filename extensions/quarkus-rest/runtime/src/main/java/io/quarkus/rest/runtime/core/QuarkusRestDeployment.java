package io.quarkus.rest.runtime.core;

import io.quarkus.rest.runtime.core.serialization.EntityWriter;
import io.quarkus.rest.runtime.handlers.RestHandler;

public class QuarkusRestDeployment {
    private final ExceptionMapping exceptionMapping;
    private final ContextResolvers contextResolvers;
    private final Serialisers serialisers;
    private final RestHandler[] abortHandlerChain;
    private final EntityWriter dynamicEntityWriter;

    public QuarkusRestDeployment(ExceptionMapping exceptionMapping, ContextResolvers contextResolvers, Serialisers serialisers,
            RestHandler[] abortHandlerChain,
            EntityWriter dynamicEntityWriter) {
        this.exceptionMapping = exceptionMapping;
        this.contextResolvers = contextResolvers;
        this.serialisers = serialisers;
        this.abortHandlerChain = abortHandlerChain;
        this.dynamicEntityWriter = dynamicEntityWriter;
    }

    public ExceptionMapping getExceptionMapping() {
        return exceptionMapping;
    }

    public ContextResolvers getContextResolvers() {
        return contextResolvers;
    }

    public Serialisers getSerialisers() {
        return serialisers;
    }

    public RestHandler[] getAbortHandlerChain() {
        return abortHandlerChain;
    }

    public EntityWriter getDynamicEntityWriter() {
        return dynamicEntityWriter;
    }
}
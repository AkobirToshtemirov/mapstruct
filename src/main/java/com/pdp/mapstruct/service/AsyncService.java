package com.pdp.mapstruct.service;

import org.springframework.scheduling.annotation.Async;
import java.util.concurrent.CompletableFuture;

public interface AsyncService {

    @Async
    CompletableFuture<Void> asyncCrudOperation();
}

package io.github.bhuwanupadhyay.cmis;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

public interface CmisHandler {

    Mono<ServerResponse> listDocument(ServerRequest request);

    Mono<ServerResponse> getDocument(ServerRequest request);

    Mono<ServerResponse> createDocument(ServerRequest request);

    @Data
    @AllArgsConstructor
    class CreateDocumentResponse {

        private String objectId;

    }

    class DocumentResponse {

    }

}

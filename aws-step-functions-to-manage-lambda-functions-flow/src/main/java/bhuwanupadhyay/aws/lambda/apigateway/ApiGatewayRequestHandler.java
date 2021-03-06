package bhuwanupadhyay.aws.lambda.apigateway;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import lombok.SneakyThrows;
import org.apache.commons.lang3.exception.ExceptionUtils;

import java.lang.reflect.ParameterizedType;

public abstract class ApiGatewayRequestHandler<T> implements RequestHandler<ApiGatewayRequest, ApiGatewayResponse> {

    @Override
    public ApiGatewayResponse handleRequest(ApiGatewayRequest input, Context context) {
        try {
            return this.handleReq(toRequestIfNoVoidType(input), context.getLogger());
        } catch (Exception e) {
            return ApiGatewayResponse.serverError(ExceptionUtils.getStackTrace(e));
        }
    }

    protected abstract ApiGatewayResponse handleReq(T request, LambdaLogger log);

    private T toRequestIfNoVoidType(ApiGatewayRequest input) {
        final Class<T> bodyType = getBodyType();
        return !bodyType.equals(Void.class) ? input.toBody(bodyType) : null;
    }

    @SuppressWarnings("unchecked")
    @SneakyThrows
    private Class<T> getBodyType() {
        String typeName = ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0].getTypeName();
        return (Class<T>) Class.forName(typeName);
    }

}

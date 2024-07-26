public interface IAsyncPostMethod2 {
    // Asynchronously sends a POST request
    CompletableFuture<Response> sendPostRequestAsync(String url, String payload);

    // Handles the response from the asynchronous POST request
    void handleResponse(Response response);
}

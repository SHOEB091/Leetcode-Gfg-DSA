package MultiThreading;

import java.util.concurrent.CompletableFuture;

/*
CompletableFuture (easy):
- runAsync(...)        -> run something in background (no result).
- supplyAsync(...)     -> run something in background and return a value.
- thenApply(fn)        -> transform the result.
- thenAccept(consumer) -> use/print the result (no new result).
- thenCombine(f2, fn)  -> combine results of two futures.
- exceptionally(fn)    -> handle errors and return a fallback.
- join()               -> wait and get (throws no checked exception).
*/

public class CompletableFutureEasy {
    public static void main(String[] args) {

        // 1) Fire-and-forget: just do a task in background (no result)
        // Example: "send an email"
        CompletableFuture<Void> emailTask = CompletableFuture.runAsync(() -> {
            sleep(300);
            System.out.println("Email sent by: " + Thread.currentThread().getName());
        });
        emailTask.join(); // wait until email is "sent"

        // 2) Get a result from background and transform it
        // Example: fetch price -> apply discount -> print
        CompletableFuture<Integer> price =
                CompletableFuture.supplyAsync(() -> {
                    sleep(200);
                    return 100; // fetched price
                });

        CompletableFuture<Integer> discounted =
                price.thenApply(p -> p - 10); // apply a flat 10 discount

        discounted.thenAccept(p ->
                System.out.println("Final price after discount: " + p)
        ).join(); // wait until printed

        // 3) Combine two independent results
        // Example: get cost of item and shipping in parallel, then add
        CompletableFuture<Integer> itemCost =
                CompletableFuture.supplyAsync(() -> { sleep(150); return 250; });

        CompletableFuture<Integer> shippingCost =
                CompletableFuture.supplyAsync(() -> { sleep(250); return 50; });

        int total = itemCost.thenCombine(shippingCost, (a, b) -> a + b).join();
        System.out.println("Total (item + shipping): " + total);

        // 4) Error handling (exceptionally)
        // Example: a failing background task -> return fallback value
        CompletableFuture<Object> risky =
                CompletableFuture.supplyAsync(() -> {
                    sleep(100);
                    throw new RuntimeException("Server down");
                }).exceptionally(ex -> {
                    System.out.println("Handled error: " + ex.getMessage());
                    return -1; // fallback value
                });

        System.out.println("Risky result (with fallback): " + risky.join());

        // Tip: To wait for many tasks together, use CompletableFuture.allOf(f1, f2, ...)
        // allOf returns a future you can join to wait for all to finish.
    }

    private static void sleep(long ms) {
        try { Thread.sleep(ms); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
    }
}
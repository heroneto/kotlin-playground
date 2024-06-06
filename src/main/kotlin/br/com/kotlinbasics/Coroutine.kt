import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

suspend fun fetchStockPrice(): Double {
    delay(1000) // Simulate API call delay
    return Math.random() * 100
}

fun main() = runBlocking {
    // Create a Chanel to hold stock prices
    val stockPrices = Channel<Double>()

    // Launch a coroutine to fetch prices every second
    launch {
        while (isActive) {
            val price = fetchStockPrice()
            stockPrices.send(price)
            delay(1000)
        }
    }

    // Launch a coroutine to consume and display prices
    launch {
        for (price in stockPrices) {
            println("Current Stock Price: $$price")
        }
    }

    delay(Long.MAX_VALUE)
}
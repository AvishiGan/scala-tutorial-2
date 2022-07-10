object Q5_b extends App{
    // Calculate the number of attendees by giving the ticket price
    // Attendees = 120 + (15 - Ticket price)/5 * 20
    def attendees(price: Int): Int = 120 + (15 - price)/5 * 20

    // Calculate the revenue by giving the ticket price
    // Revenue = Attendees * Price
    def revenue(price: Int): Int = attendees(price) * price

    // Calculate the cost by giving the ticket price
    // Cost = 500 + 3 * Attendees
    def cost(price: Int): Int = 500 + 3 * attendees(price)

    // Calculate the profit by giving the ticket price
    // Profit =  Revenue - Cost
    def profit(price: Int): Int = revenue(price) - cost(price)

    printf(profit(5), profit(10), profit(15), profit(20), profit(25), profit(30), profit(35), profit(40))
}

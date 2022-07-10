object Q5_a extends App{
    // Salary wage = Wage hours * 250
    def wage(hours: Int): Int = hours * 250

    // Salary OT = OT hours * 85
    def ot(hours: Int): Int = hours * 85

    // Income = Wage + OT
    def income(h1: Int, h2: Int): Int = wage(h1) + ot(h2)

    // Tax = Income * 0.12
    def tax(income: Int): Double = income * 0.12

    // Take home = Income - Tax
    def takeHome(h1: Int, h2: Int): Double = income(h1, h2) - tax(income(h1, h2))

    printf("Income = %d\n", income(40, 30))

    printf("Take Home = %.2f", takeHome(40, 30))
}

// printf:
// Helpful in writing format strings 
// Also places extra arguments
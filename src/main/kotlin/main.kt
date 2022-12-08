fun main(){
    var amount: Double = 5000.0
    val minCommission: Double = 35.0
    var commission: Double
    var commissionPercent: Float = 0.75f
    commission = amount*commissionPercent/100
    if (commission < minCommission) {
        commission = minCommission
    }
    println(commission)
}
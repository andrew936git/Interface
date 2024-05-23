class System112(
    private val name: String = "Единая служба экстренных вызовов",
    private val phone: String = "112"): EmergencyServices(name, phone), Printable {

    override fun servicesActivities(): String {
        return "Предназначен для обеспечения оказания экстренной помощи " +
                "населению при угрозах жизни и здоровью"
    }

    override fun objectInfo() {
        println("Служба $name, номер вызова $phone, ${servicesActivities()} ")
    }
}
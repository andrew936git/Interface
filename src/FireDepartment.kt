class FireDepartment(
    private val name: String = "Пожарная охрана",
    private val phone: String = "101"):EmergencyServices(name, phone), Printable {

    override fun servicesActivities(): String {
        return "Разведка места пожара, аварийно-спасательные работы, " +
                "связанные с тушением пожаров, " +
                "ликвидация горения и специальные работы"
    }

    override fun objectInfo() {
        println("Служба $name, номер вызова $phone, ${servicesActivities()}")
    }
}
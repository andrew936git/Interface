abstract class EmergencyServices(
    private var name: String,
    private var phone: String
) {
    abstract fun servicesActivities(): String
}
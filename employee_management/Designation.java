package objectOriented.employee_management;

enum Designation {
    JUNIOR,
    MID,
    SENIOR,
    LEAD;

    public Designation nextLevel() {
        int nextOrdinal = this.ordinal() + 1;
        if (nextOrdinal < Designation.values().length) {
            return Designation.values()[nextOrdinal];
        }
        return null;
    }
}

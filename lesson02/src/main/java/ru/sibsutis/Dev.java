package ru.sibsutis;

class Dev extends User implements CSV {

    private String department;

    public Dev(String name, String email, String department) {
        super(name, email);
        this.department = department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toCSV() {
        String nm = getName();
        String ml = getEmail();
        return nm + ";" + ml + ";" + this.department;
    }

    @Override
    public void formCSV(String str) {
        String[] array = str.split(";");
        this.setName(array[1]);
        this.setEmail(array[2]);
        this.setDepartment(array[3]);
    }




}

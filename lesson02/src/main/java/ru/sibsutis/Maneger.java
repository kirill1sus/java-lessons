package ru.sibsutis;

 class Maneger extends User implements CSV{

     private String number;

     public Maneger(String name, String email, String number) {
         super(name, email);
         this.number = number;
     }

     public String getNumber() {
         return number;
     }

     public void setNumber(String ID) {
         this.number = ID;
     }

     @Override
     public String toCSV() {
         String nm = getName();
         String ml = getEmail();
         return nm + ";" + ml + ";" + this.number;
     }

     @Override
     public void formCSV(String str) {
         String[] array = str.split(";");
         this.setName(array[1]);
         this.setEmail(array[2]);
         this.setNumber(array[3]);
     }
 }

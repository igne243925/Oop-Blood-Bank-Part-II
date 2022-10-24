class BloodData{
    private String bloodType;
    private String rhFactor;

    public BloodData(){
        bloodType = "O";
        rhFactor = "+";
    }

    public void setBloodType(String bt){
    this.bloodType = bt;   
    }
    
    public void setRhFactor(String rf){
        this.rhFactor = rf;
    }
    
    public String getBloodType(){
        return bloodType;
    }
    
    public String getRhFactor(){
        return rhFactor;
    }
    
    public void display(){
        System.out.println(bloodType+rhFactor+" is added to the blood bank.");
    }
}
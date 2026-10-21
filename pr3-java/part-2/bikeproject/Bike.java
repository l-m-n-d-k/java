package bikeproject;

public class Bike implements BikeParts {

    private String handleBars, frame, tyres, seatType;
    private int numGears;

    public Bike(){
    }

    public Bike(String handleBars, String frame, String tyres, String seatType, int numGears) {
        this.handleBars = handleBars;
        this.frame = frame;
        this.tyres = tyres;
        this.seatType = seatType;
        this.numGears = numGears;
    }

    public String getMake() { return MAKE; }

    public String getHandleBars() { return handleBars; }
    public void setHandleBars(String newValue) { handleBars = newValue; }

    public String getFrame() { return frame; }
    public void setFrame(String newValue) { frame = newValue; }

    public String getTyres() { return tyres; }
    public void setTyres(String newValue) { tyres = newValue; }

    public String getSeatType() { return seatType; }
    public void setSeatType(String newValue) { seatType = newValue; }

    public int getNumGears() { return numGears; }
    public void setNumGears(int newValue) { numGears = newValue; }

    public void printDescription()
    {
        System.out.println("\n" + this.getMake() + "\n"
                          + "This bike has " + this.handleBars + " handlebars on a "
                          + this.frame + " frame with " + this.numGears + " gears."
                          + "\nIt has a " + this.seatType + " seat with " + this.tyres + " tyres.");
    }

}

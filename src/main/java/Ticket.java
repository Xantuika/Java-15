public class Ticket implements Comparable<Ticket> {
    private int id;
    private int price;
    private String departureAirport;
    private String arrivalAirport;
    private int travelTime;

    public Ticket(int id, int price, String departureAirport, String arrivalAirport, int travelTime) {
        this.id = id;
        this.price = price;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.travelTime = travelTime;
    }

   // public Ticket() {
   // }

    //public int getId() {
       // return id;
  //  }

    //public void setId(int id) {
       // this.id = id;
   // }

    public int getPrice() {
        return price;
    }

   // public void setPrice(int cost) {
       // this.price = cost;
   // }

    public String getDepartureAirport() {
        return departureAirport;
    }

    //public void setDepartureAirport(String departureAirport) {
    //    this.departureAirport = departureAirport;
   // }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    //public void setArrivalAirport(String arrivalAirport) {
      //  this.arrivalAirport = arrivalAirport;
    //}

   // public int getTravelTime() {
     //   return travelTime;
   // }

    //public void setTravelTime(int travelTime) {
     //   this.travelTime = travelTime;
   // }

    @Override
    public int compareTo(Ticket o) {
        if (this.price > o.getPrice()) {
            return 1;
        } else if (this.price < o.getPrice()) {
            return -1;
        } else {
            return 0;
        }
    }
}

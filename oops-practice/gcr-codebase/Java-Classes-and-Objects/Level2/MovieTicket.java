class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    void book(String name, int seat, double p) {
        movieName = name;
        seatNumber = seat;
        price = p;
    }

    void display() {
        System.out.println(movieName);
        System.out.println(seatNumber);
        System.out.println(price);
    }

    public static void main(String[] args) {
        MovieTicket m = new MovieTicket();
        m.book("Avatar", 12, 250);
        m.display();
    }
}
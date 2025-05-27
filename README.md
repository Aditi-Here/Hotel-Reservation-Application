# Hotel Reservation Application

A full-stack hotel reservation system built with Java and Spring Boot, designed to manage hotel bookings, customer information, and payment processing efficiently.

## Features

* **Room Reservation Management**: Create, update, and cancel room bookings seamlessly.
* **Customer Management**: Store and manage customer details securely.
* **Payment Processing**: Handle payments and maintain transaction records.
* **Owner Management**: Manage hotel owner information and associated properties.
* **RESTful API Endpoints**: Interact with the system through well-defined API endpoints.

## Technologies Used

* **Backend**: Java, Spring Boot
* **Database**: MySQL
* **Build Tool**: Maven([GitHub][1])

## Project Structure

* `src/` – Contains the main application source code.
* `create table.sql` – SQL script to set up the necessary database tables.
* `owner table.sql` – SQL script for the owner information table.
* `payment table.sql` – SQL script for the payment transactions table.
* `reservationBookingTable.sql` – SQL script for the reservation bookings table.
* `End point details.txt` – Documentation of available API endpoints.
* `pom.xml` – Maven configuration file.([GitHub][1], [GitHub][2])

## Getting Started

### Prerequisites

* Java Development Kit (JDK) 8 or higher
* MySQL Server
* Maven([GitHub][1], [GitHub][2], [YouTube][3])

### Installation

1. **Clone the repository**:

   ```bash
   git clone https://github.com/Aditi-Here/Hotel-Reservation-Application.git
   cd Hotel-Reservation-Application
   ```



2. **Set up the database**:

   * Create a new MySQL database.
   * Run the SQL scripts in the following order to create the necessary tables:

     * `create table.sql`
     * `owner table.sql`
     * `payment table.sql`
     * `reservationBookingTable.sql`

3. **Configure application properties**:

   * Update the `application.properties` file with your MySQL database credentials and other configurations.

4. **Build and run the application**:

   ```bash
   mvn spring-boot:run
   ```



## API Endpoints

Refer to the `End point details.txt` file for a comprehensive list of available API endpoints and their usage.

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request for any enhancements or bug fixes.

## License

This project is open-source and available under the [MIT License](LICENSE).



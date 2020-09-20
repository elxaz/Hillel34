Feature: For Hillel Task 34

  Scenario:
  I as a customer can search a previously used car by a followed categories:
    By type of body:
      Sedan;
      Hatchback;
      Compartment;
    By country:
      Russia;
    By cost:
      From $1000 to $10000;
    Possible bargaining;
    Region:
      Odessa
      Kiev
    Fuel:
      Diesel;
      Patrol;
      Gasoline;
      Electric;
    Transmission:
      Mechanical;
      Automatic;
    Type of drive:
      Full;
      Front-Wheel Drive;
      Back-Wheel Drive;
    Sorting:
      Cheaper to;

    Given I access main page "https://auto.ria.com/"
    When I click at Advanced Search
    Given Advanced Search
    When I choose followed categories
    And Click at search button
    Given List of cars by followed categories
    When I click to the first car of the list
    Then I can see its page

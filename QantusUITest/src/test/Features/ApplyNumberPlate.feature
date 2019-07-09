Feature: Apply for a Number Plate in your preferred RTA

  Scenario Outline: Navigate to the RTA website, search for "Apply for a number plate" and search for preferred Suburb
    Given I navigate to the <URL>
    When I click on find location link
    And I Land on Find a Service NSW Location Page
    And I Enter the suburb as <Suburb>
   Then I should see the Available service center as <ServiceCenter>
    Examples:
    | URL															| Suburb 		                   | ServiceCenter 								|
    | https://www.service.nsw.gov.au/ | Sydney 2000                  | Marrickville Service Centre |
    | https://www.service.nsw.gov.au/ | Sydney Domestic Airport 2020|Rockdale Service Centre|
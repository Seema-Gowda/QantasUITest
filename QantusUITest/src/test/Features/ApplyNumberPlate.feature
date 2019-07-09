Feature: Apply for a Number Plate in your preferred RTA

  Scenario Outline: Navigate to the RTA website, search for "Apply for a number plate" and search for preferred Suburb
    Given I navigate to the <URL>
    When I search for <SearchString>
    And I Navigate to the searched page
    And I Click on locate us Button
    And I Land on Find a Service NSW Location Page
    And I Enter the suburb as <Suburb>
   Then I should see the Available service center as <ServiceCenter>
    Examples:
    | URL															| SearchString 						 | Suburb 		 | ServiceCenter 								s|
    | https://www.service.nsw.gov.au/ | Apply for a number plate | Sydney 2000 | Marrickville Service Centre |
    | https://www.service.nsw.gov.au/ | Apply for a number plate |Sydney Domestic Airport 2020|Rockdale Service Centre|
#Autor : Alexander Echeverry Torres
@Stories
Feature: Academy Choucair
  As a user, I want to learn how to automate in screenplay at the Chocair Academy width the automation course
  @scenario1
  Scenario: Search for a automation course
    Given than Alexander wants to learn automation at the academy Choucair
    | strUser    | strPassword    |
    | 1152437776 | Choucair2021*  |
    When he search for the course on the Choucair Academy platform
    | strCourse          |
    | Foundation Express |
    Then he finds the course called
    | strCourse          |
    | Foundation Express |

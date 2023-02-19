@HillelHome
Feature: Check text of Hillel Home page elements
  Scenario Outline: Check text of navigation elements
    When I open page "https://dnipro.ithillel.ua/"
    Then Check title "<ELEMENT>"
    Examples:
      | ELEMENT          |
      | Школа            |
      | Курси            |
      | Працевлаштування |
      | Блог             |
      | Контакти         |


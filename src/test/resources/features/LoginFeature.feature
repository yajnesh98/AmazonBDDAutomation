Feature: Login

  @LoginTC_01
  Scenario: TC-01: Login to Amazon portal
    Given Launch the browser using amazon url
    Then Amazon web page is displayed
    And Check search tab is displayed
    When User enter "Mobile" in search tab
    Then Verify and click on Search Icon
    When User clicked "IQOO" phone

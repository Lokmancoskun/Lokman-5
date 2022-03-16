@UILogin
Feature: passwordsegment

  Scenario Outline: user sees as password is required to be at least 4 characters
#    //Background: user is on the home page
    Given user is on the logIn page
    Given user clicks the logIn dropdown
    And user clicks on the signIn button
    And user provides the userName as "<userName>"
    And user provides the passWord as "<passWord>"
    And user clicks on remember button
    And user clicks on the signInButton
    And user clicks on user segment
    And user clicks on Password
    And user provides the currentPassword as "<currentPassword>"
    And user provides the invalid two letters one digit newPassword as "<newPassword>"
    And user provides the invalid two letters one digit newPasswordConfirmation as "<newPasswordConfirmation>"
    And user clicks on the save button
    Then there should be displayed Your password is required to be at least four characters.
    Examples: user info
      |userName|passWord| currentPassword|newPassword|newPasswordConfirmation|
      |sunu    |1234571|    1234571    |   LK1       |    LK1      |

  Scenario Outline: user sees as password is required to be at least 4 characters

    And user clicks on user segment
    And user clicks on Password
    And user provides the currentPassword as "<currentPassword>"
    And user provides the invalid one capital letter one small letter one digit newPassword as "<newPassword>"
    And user provides the invalid one capital letter one small letter one digit newPasswordConfirmation as "<newPasswordConfirmation>"
    And user clicks on the save button
    Then there should be displayed Your password is required to be at least four characters.
    Examples: user info
      |userName|passWord| currentPassword|newPassword|newPasswordConfirmation|
      |sunu    |1234571|    1234571   |   Lk1       |    Lk1      |


  Scenario Outline: user sees as password is required to be at least 4 characters
#    //Background: user is on the home page
#    Given user is on the logIn page
#    Given user clicks the logIn dropdown
#    And user clicks on the signIn button
#    And user provides the userName as "<userName>"
#    And user provides the passWord as "<passWord>"
#    And user clicks on remember button
#    And user clicks on the signInButton
    And user clicks on user segment
    And user clicks on Password
    And user provides the currentPassword as "<currentPassword>"
    And user provides the invalid one capital letter one small letter one special char newPassword as "<newPassword>"
    And user provides the invalid one capital letter one small letter one special char newPasswordConfirmation as "<newPasswordConfirmation>"
    And user clicks on the save button
    Then there should be displayed Your password is required to be at least four characters.
    Examples: user info
      |userName|passWord| currentPassword|newPassword|newPasswordConfirmation|
      |sunu    |1234571|   1234571    |   Lk!       |    Lk!      |

  Scenario Outline:user should be able to renew password
#    Given user is on the logIn page
#    Given user clicks the logIn dropdown
#    And user clicks on the signIn button
#    And user provides the userName as "<userName>"
#    And user provides the passWord as "<passWord>"
#    And user clicks on remember button
#    And user clicks on the signInButton
    And user clicks on user segment
    And user clicks on Password
    And user provides the currentPassword as "<currentPassword>"
    And user provides the newPassword as "<newPassword>"
    And user provides the newPasswordConfirmation as "<newPasswordConfirmation>"
    And user clicks on the save button
    Then user verifies password changed successfully
 #   Then user signs out
    Examples: user info
      |userName|passWord| currentPassword|newPassword|newPasswordConfirmation|
      |sunu    |1234571|   1234571   |  LKmn27!        |   LKmn27!         |


  Scenario Outline: user sees positive result but password strength looks one red color
#    //Background: user is on the home page
#    Given user is on the logIn page
#    Given user clicks the logIn dropdown
#    And user clicks on the signIn button
#    And user provides the userName as "<userName>"
#    And user provides the passWord as "<passWord>"
#    And user clicks on remember button
#    And user clicks on the signInButton
    And user clicks on user segment
    And user clicks on Password
    And user provides the currentPassword as "<currentPassword>"
    And user provides the all capital letters as newPassword as "<newPassword>"
    And user provides the all capital letters as newPasswordConfirmation as "<newPasswordConfirmation>"
    And user clicks on the save button
    Then there should be displayed Password changed.
    Examples: user info
      |userName|passWord| currentPassword|newPassword|newPasswordConfirmation|
      |sunu    |LKmn27! |  LKmn27!      |   LKMNCSK      |    LKMNCSK      |


  Scenario Outline: user sees positive result but password strength looks one red color
#    //Background: user is on the home page
#    Given user is on the logIn page
#    Given user clicks the logIn dropdown
#    And user clicks on the signIn button
#    And user provides the userName as "<userName>"
#    And user provides the passWord as "<passWord>"
#    And user clicks on remember button
#    And user clicks on the signInButton
    And user clicks on user segment
    And user clicks on Password
    And user provides the currentPassword as "<currentPassword>"
    And user provides the all digits as newPassword as "<newPassword>"
    And user provides the all digits as newPasswordConfirmation as "<newPasswordConfirmation>"
    And user clicks on the save button
    Then there should be displayed Password changed.
    Examples: user info
      |userName|passWord| currentPassword|newPassword|newPasswordConfirmation|
      |sunu    |LKMNCSK|    LKMNCSK  |   1234572      |    1234572      |



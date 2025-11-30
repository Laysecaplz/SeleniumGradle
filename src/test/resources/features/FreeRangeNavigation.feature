Feature: Navigation bar
 To see the subpages
 Without logging in
 I can click the navigation bar links
 
   # Scenario: I can access the subpages through the navigation bar 
   # Given I navigate to www.freerangetesters.com 

  # Scenario Outline: I can access the subpages through the navigation bar
   #     Given I navigate to www.freerangetesters.com
    #    When I go to <section> using the navigation bar
     #   Examples:
      #      | section    |
       #     | Cursos     |
        #    | Recursos   |
         #  | Udemy      |
          #  | Mentorías  |
           # | Talleres |
 
   #Scenario: Courses are presented correctly to potential customers
   #     Given I navigate to www.freerangetesters.com
    #    When I go to Cursos using the navigation bar
     #   And select Introducción al Testing
      #  And select button comprar ahora

      Scenario: Users can select a plan when signing up
        Given I navigate to www.freerangetesters.com
        When I select Elegir Plan

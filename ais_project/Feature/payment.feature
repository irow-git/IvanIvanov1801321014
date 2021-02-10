Feature: Покупка чрез дебитна/кредитна карта

  Scenario Outline: Покупка чрез дебитна/кредитна карта
    Given Потребителят отваря екрана за покупка чрез дебитна/кредитна карта
    When Въведе номер на картата "<number>"
    And Въведе срок на годност "<expDate>"
    And Въведе име на карта "<cardHolder>"
    And Въведе CVV "<CVV>"
    And Натискане на бутон купи
    Then Въжда съобщение "<message>"

    Examples: 
      | number  									| expDate | cardHolder  | CVV | message         |
      | 4213 3123 5434 4123 3123  | 5.2021  | IVANIVANOV  | 092 | Успешна покупка |
			| 4213 3123 5434 4123 3125  | 5.2020  | IVANIVANOV  | 092 | Недостатъчни средства или грешни данни|
			|                           | 5.2021  | IVANIVANOV  | 092 | Липсващ номер на картата |
			| 4213 3123 5434 4123 3123  |         | IVANIVANOV  | 092 | Липсващ срок на годност |
			| 4213 3123 5434 4123 3123  | 5.2021  |						  | 092 | Липсващо име на карта |
			| 4213 3123 5434 4123 3123  | 5.2021  |	IVANIVANOV	|     | Липсващо CVV |

public class JUnitPart2 {
/*  Тест, помеченный @Ignore, не выполнится. Лучше это не использовать так как разработчики часто
* используют когда тест у них валится, после чего забывают о нем. Один проваленный тест не позволяет
* пройти другим тестам.
*   Вместо класса Assert можно использовать Assume c похожими названиями методов. Если проверка верна -
* тест пройден, если не верна - тест игнорируется.
*
* Аннотации для вспомогательных методов:
    * @BeforeClass - запускается только один раз при запуске теста (static).
    * @Before - запускается перед каждым тестовым методом.
    * @After - запускается после каждого метода.
    * @AfterClass - запускается после того, как отработали все тестовые методы (static).
    *
* Жизненный цикл тестирующего класса:
*  1. При запуске каждого тестового метода создается экземпляр тестового класса. Аннотация @BeforeClass
* помечает вспомогательный метод, который запускается только один раз, то есть этот метод статический -
* принадлежит всему классу, а не объекту класса. Он запускается не каждый раз для каждого тестового
* метода. Он запускается один раз для тестового класса.
*  2. Вспомогательный метод помеченный @Before запускается для каждого объекта (тестового метода) тестового класса.
*  3. После запускается тест метод помеченный @Test.
*  4. Вспомогательный метод помеченный @After запускается для каждого объекта (тестового метода) после тестового метода.
*  5. @AfterClass также помечает вспомогательный метод статическим, запускается после выполнения всех тестовых методов
*       единожды */
}

抽象工厂：在factoryMethod当中，工厂中除了有生产对象的工厂方法外还有自己的业务逻辑，
扩展的方式只能是通过继承该类来扩展，而在abstractFactory当中，将该工厂方法抽象
出一个接口，包含有生产对象的工厂方法，将自己的业务逻辑剔除出去放到一个调用的A类
当中，这样做的好处是避免了通过继承来扩展工厂方法，而是采用组合的方式来实现。
所以还需要说出使用继承和使用接口的区别。
其实就是将AB两个类拆成了AIB三个，不在使用继承的方式，而是采用组合的方式。

<<<<<<< HEAD
# Java设计模式

## 一、设计模式七大原则

#### 1、单一职责原则

- 介绍：
  ```text
  对于类来说，每个类都应该只负责一个职责。如果A类负责两个不同的职责：职责1，职责2，当职责1的需求变更要改变A时，可能造成职责2执行错误，所以需要将类A的粒度分解。

- 降低类的复杂度，一个类只负责一个功能
- 提高类的可读性，可维护性
- 降低变更引起的风险
- 通常情况下，我们应当遵守单一职责原则，只能逻辑足够简单，才可以在代码级违反单一职责原则，只有类中的方法足够少，可以才方法级别保持单一职责原则。

#### 2、接口隔离原则
- 将接口拆分为独立的几个接口，这里我们拆分为3个，
- 类A和类C分别于他们需要的接口建立关系
- 也就是采用接口隔离原则
#### 3、依赖倒转原则
- 高层模块不应该依赖低层模块，二者都应该依赖其抽象
- 抽象不应该依赖其细节，细节应该依赖抽象
- 依赖倒转的中心思想的面向接口编程
- 依赖倒转原则是基于这样的设计理念，相对于细节的多变性，抽象的对象要稳定的多，
- java中抽象的是指接口或者抽象类，细节就是具体的实现类
- 使用接口或者抽象类的目的是制定好规范，而不涉及任何具体的操作，把展现细节的任务交给他们的实现类来做
- 注意
  - 低层模块尽量都要有抽象类或接口，或者都有，程序稳定性更好
  - 变量的声明类型尽量是抽象类或者接口。这样我们的变量引用和实际对象间，就存在一个缓存区，利于程序扩展和优化
  - 遵循里氏替换原则
#### 4、里氏替换原则
- 这条原则是针对继承关系的，它强调子类型必须能够替换掉其父类型，并且调用者不需要知道实际使用的是子类型还是父类型，程序能够正确运行。
- 子类必须实现父类的所有抽象方法，不能删除、修改、增加父类的方法，也不能改变父类方法的返回值类型和方法签名的参数类型
- 子类可以有自己的方法和属性
- 子类中的方法应该与父类中的方法有相同的预期后置条件（post-conditions），即方法的执行结果应该符合其描述的结果
- 子类中的方法不能抛出异常，也不能抛出超出父类方法范围的异常。
#### 5、开闭原则
  - 简单来说，开闭原则要求软件设计应该是可以扩展的，但是不应该修改现有的代码。这样做能够使软件更易于维护、扩展和升级，并且可以减少因为修改代码而引入新问题的风险
  - 抽象化：使用接口或抽象类等抽象化的方式，将具体的实现和抽象分离，并且将抽象设计得足够通用，以便能够适应未来的需求变化。
  - 封装变化：将不同的变化隔离开来，确保每个变化只影响相应的模块。这样做可以减少变化的影响范围，并且可以提高代码的内聚性。
  - 利用多态：利用多态性来实现开闭原则，即将变化的实现部分抽象成接口或抽象类，而将具体的实现放在实现子类中，通过面向父类编程，可以让程序更易于扩展和升级。
#### 6、迪米特原则

#### 7、合成复用原则


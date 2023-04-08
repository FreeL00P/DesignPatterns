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
- 为了遵守迪米特法则，我们需要：
  - 将对象的设计和实现尽可能简单，避免出现类之间交互过于复杂的情况。
  - 抽象出适当的接口，尽量减少对象之间直接的依赖关系，而是通过接口进行交互。
  - 将每个对象的职责尽可能的分离，使得每个对象只关注自己的核心任务，而不需要了解依赖对象的具体实现。
  - 在设计过程中，保持代码的清晰简洁，让代码易于理解和维护。
- 迪米特法则的核心思想是“减少耦合性，增加内聚性”，即在一个系统中，对象之间的交互应该尽可能简单，不需要了解太多其他对象的内部实现。也就是说，一个对象应该对其他对象了解得最少。
- 迪米特法则可以有效的减少代码的耦合性，提高代码的内聚性和可维护性。同时，它也能够促进面向对象设计中的单一职责原则和开闭原则的实践。
#### 7、合成复用原则
- 合成复用原则的核心思想是“优先使用对象组合，而不是继承关系来实现代码的重用”。
- 为了遵循合成复用原则，我们需要：
  - 尽量使用对象组合来构建复杂的对象，而不是使用类继承。
  - 在设计时优先考虑对象间的组合关系，而不是类之间的继承关系。
  - 在需要重用某些功能的时候，尽量使用对象组合来实现，而不是通过类的继承。
  - 设计类时尽量保持职责单一，每个类负责一项任务，而不是实现多项任务。
  - 通过使用合成复用原则，可以大大提高代码的可维护性、复用性和扩展性，同时减少代码的耦合性和依赖性。此外，还可以避免由于类继承关系过于复杂而导致的代码难以理解和维护的问题。
## 二、设计模式类型
#### 1. 创建型模式
- 单例模式 - 抽象工厂模式 - 原型模式
- 建造者模式 - 工厂模式
#### 2. 结构型模式
- 适配器模式 - 桥接模式 - 装饰模式
- 组合模式 - 外观模式 - 享元模式
- 代理模式
#### 3. 行为型模式
- 模板方法模式 - 命令模式 - 访问者模式
- 迭代器模式 - 观察者模式 - 中介者模式
- 备忘录模式- 解释器模式 - 状态模式 
- 策略模式 - 责任链模式
## 三、 设计模式
### 1、单例模式
- 饿汉式
  ```
  饿汉式是一种比较简单的单例模式实现方式，其核心思想是在类加载的时候就创建并初始化唯一的实例，
  避免了多线程环境下可能出现的线程安全问题。
  在某些情况下可能会导致资源浪费，即如果 INSTANCE 并未被使用到，
  但是它却会在类加载时被创建出来并占用一定的内存空间。
  ```
  - 静态变量实现
  
    ```java
    public class Singleton {
      private static Singleton INSTANCE = new Singleton();
    
      private Singleton() {}
      
      public static Singleton getInstance() {
          return INSTANCE;
      }
    }
    ```
  
  - 静态代码块形式
  
    ```java
    public class Singleton {
        private static final Singleton INSTANCE;
    
        static {
            INSTANCE = new Singleton();
        }
    
        private Singleton() {}
    
        public static Singleton getInstance() {
            return INSTANCE;
        }
    }
    ```
  - 枚举式
  
    ```java
    public enum Singleton {
        INSTANCE;
    }
    ```

- 懒汉式

  ```text
  其核心思想是在需要获取实例时才进行对象的实例化。相比于饿汉式，懒汉式的实现需要注意多线		程环境下的线程安全问题。
  在懒汉式的实现过程中，可以使用一个私有的静态变量来存储该实例，但是不进行初始化，直到第一次使用该实例时再进行初始化，
  并返回该实例的引用。为了确保多线程环境下的线程安全问题，可以使用 synchronized 关键字或者双重检测锁来实现线程安全的访问。
  ```

  - 线程不安全的懒汉式  

    ```java
    /*
    在第一次使用时才进行实例化，但是没有考虑多线程下的并发问题，有可能会导致多个线程在同一时刻创建多个实例。如果并发访问情况下极容易出现线程安全问题，因此不推荐使用。
    */
    public class Singleton {
        private static Singleton instance;
    	
        private Singleton() {}
    
        public static Singleton getInstance() {
            if (instance == null) {
                instance = new Singleton();
            }
            return instance;
        }
    }
    ```

  - 线程安全的懒汉式

    ```java
    /*
    线程安全的懒汉式指的是，使用双重检查锁（Double-Check Locking，DCL）的方式，即在保证线程安全的前提下，尽量避免不必要的锁竞争和实例化操作。
    */
    public class Singleton {
        private volatile static Singleton instance;
    
        private Singleton() {}
    
        public static Singleton getInstance() {
            if (instance == null) {
                synchronized (Singleton.class) {
                    if (instance == null) {
                        instance = new Singleton();
                    }
                }
            }
            return instance;
        }
    }
    ```

  - 内部类懒汉式

    ```java
    /*
    使用内部类的方式实现线程安全的懒汉式单例模式。在内部类中创建单例对象进行初始化，通过静态内部类的特性来保证线程安全和唯一性。
    */
    public class Singleton {
    
        private Singleton() {}
    
        private static class SingletonHolder {
            private static final Singleton INSTANCE = new Singleton();
        }
    
        public static Singleton getInstance() {
            return SingletonHolder.INSTANCE;
        }
    }
    
    ```

    无论使用哪种方式，懒汉式单例模式都是在第一次使用时才进行实例化，避免了在类加载时就创建单例对象所带来的性能问题。但是需要注意，第一种方式并不能保证线程安全，因此不推荐使用。其他两种方式能够保证线程安全且高效，因此推荐使用。

### 简单工厂模式

```java
/*
在简单工厂模式中，包含一个工厂类 Factory，该类负责创建对应产品的对象。工厂类中通常会包括一个静态方法，该方法根据不同的参数生成不同的产品实例。这样，客户端只需要知道产品的类型，而不需要关心产品的创建过程。
*/ 
public interface Product {
    void use();
}

public class ConcreteProduct1 implements Product {
    @Override
    public void use() {
        System.out.println("Product 1 used.");
    }
}

public class ConcreteProduct2 implements Product {
    @Override
    public void use() {
        System.out.println("Product 2 used.");
    }
}

public class SimpleFactory {
    public static Product createProduct(int type) {
        switch (type) {
            case 1 :
                return new ConcreteProduct1();
            case 2 :
                return new ConcreteProduct2();
            default :
                throw new IllegalArgumentException("Invalid product type.");
        }
    }
}

public class Client {
    public static void main(String[] args) {
        Product product = SimpleFactory.createProduct(1);
        product.use();
    }
}
```

简单工厂模式的主要特点是通过一个工厂方法来创建对象，而不是通过类的构造器。

- 使用简单工厂模式的优点在于：
  - 客户端代码与产品对象的创建过程分离，降低耦合度。
  - 在新增产品时，仅需适当修改工厂类即可，无需修改客户端代码，提高系统的可扩展性。
  - 通过创建工厂方法，可以将对象创建的粒度进行统一管理，提高系统的可维护性。
- 简单工厂模式的缺点在于：
  - 当新增产品时，需要修改工厂类的代码，不符合开闭原则。
  - 工厂类会承担较多的职责，有可能会变得复杂

### 工厂方法模式

- 工厂方法模式是一种创建型设计模式，它提供了一种创建对象的方法，将对象的创建委托给其子类来完成。借助工厂方法模式，我们可以将对象的创建和使用分开，从而降低系统耦合度

  ```java
  /*
  在工厂方法模式中，我们定义一个抽象的工厂类，其中包含一个创建产品的抽象方法。
  */
  
  public abstract class OrderPizza {
      //定义一个抽象方法，createPizza,让各个子类自己实现
      abstract Pizza createPizza(String orderType);
      public OrderPizza(){
          String orderType;//订购披萨的类型
          do {
              orderType = getType();
              Pizza pizza = createPizza(orderType);
              //输出披萨制作工厂
              pizza.prepare();
              pizza.bake();
              pizza.cut();
              pizza.box();
          }while(true);
  
      }
      public String getType(){
          try{
              BufferedReader strIn = new BufferedReader(new InputStreamReader(System.in));
              System.out.println("披萨种类:");
              return strIn.readLine();
          }catch (Exception e){
              e.printStackTrace();
              return "";
          }
      }
  }
  /*
  具体的产品由工厂的子类来创建，每个工厂子类都实现了抽象工厂类中的抽象方法，用于创建相应的产品
  */
  public class BJOrderPizza extends OrderPizza{
      @Override
      Pizza createPizza(String orderType) {
          System.out.println("制作北京披萨");
          Pizza pizza=null;
          if(orderType.equals("cheese")){
              pizza=new BJCheesePizza();
          }else if(orderType.equals("pepper")){
              pizza=new BJPepperPizza();
          }
          return pizza;
      }
  }
  
  public class LDOrderPizza extends OrderPizza{
      @Override
      Pizza createPizza(String orderType) {
          System.out.println("制作伦敦披萨");
          Pizza pizza=null;
          if(orderType.equals("cheese")){
              pizza=new LDCheesePizza();
          }else if(orderType.equals("pepper")){
              pizza=new LDPepperPizza();
          }
          return pizza;
      }
  }
  public class PizzaStore {
      public static void main(String[] args) {
          //创建北京口味的各种pizza
          String location =new Scanner(System.in).next();
          if (location.equals("bj")) {
              new BJOrderPizza();
          }else if (location.equals("ld")){
              new LDOrderPizza();
          }
  
      }
  }
  ```

- 这种设计模式能够实现代码的可扩展性，当我们需要新增一种产品时，只需要增加相应的产品子类及其工厂子类即可，对现有代码不会造成影响。

- 工厂方法模式的优点包括封装了对象的创建，使得客户端无需关心对象的具体创建过程，增加了系统的灵活性和可扩展性，同时降低了系统的耦合程度。
- 不足之处是如果工厂类较多，会导致代码复杂度增加。此外，由于工厂方法模式使用了继承来完成对象的创建，因此会增加系统的类的个数和结构的复杂度。

### 抽象工厂模式

- 抽象工厂模式是一种创建型设计模式，它提供了一个接口，让客户端能够创建一系列相关或依赖对象，而无需指定它们的具体类。抽象工厂模式是工厂方法模式的一种变体，它使用一组相关的工厂来创建对象，这些工厂被称为“抽象工厂”。

- 在抽象工厂模式中，抽象工厂定义了一个接口，用于创建一组相关对象，而具体工厂则实现这个接口，并创建具体的对象。每个工厂都可以创建一组相似的对象，但这些对象可能在不同的上下文中使用，因此它们具有不同的具体表现形式。

- 使用抽象工厂模式可以隐藏对象的具体实现细节，只披露接口，从而简化代码，提高系统的可扩展性和灵活性。

  ```java
  public interface AbsFactory {
      //让下面的工厂子类来具体实现
      Pizza createPizza(String orderType);
  }
  public class BJFactory implements AbsFactory{
      @Override
      public Pizza createPizza(String orderType) {
          System.out.println("制作北京披萨");
          Pizza pizza=null;
          if(orderType.equals("cheese")){
              pizza = new BJCheesePizza();
          }else if(orderType.equals("pepper")){
              pizza=new BJPepperPizza();
          }
          return pizza;
      }
  }
  public class LDFactory implements AbsFactory{
      @Override
      public Pizza createPizza(String orderType) {
          System.out.println("制作伦敦披萨");
          Pizza pizza=null;
          if(orderType.equals("cheese")){
              pizza = new LDCheesePizza();
          }else if(orderType.equals("pepper")){
              pizza=new LDPepperPizza();
          }
          return pizza;
      }
  }
  public class OrderPizza {
      AbsFactory absFactory;
  
      public OrderPizza(AbsFactory absFactory) {
          setAbsFactory(absFactory);
      }
  
      private void setAbsFactory(AbsFactory absFactory) {
          Pizza pizza=null;
          String orderType ="";
          this.absFactory=absFactory;
          do {
              orderType=this.getType();
              pizza=absFactory.createPizza(orderType);
              if (pizza!=null){
                  pizza.prepare();
                  pizza.bake();
                  pizza.cut();
                  pizza.box();
              }
          }while (true);
      }
      public String getType(){
          try{
              BufferedReader strIn = new BufferedReader(new InputStreamReader(System.in));
              System.out.println("披萨种类:");
              return strIn.readLine();
          }catch (Exception e){
              e.printStackTrace();
              return "";
          }
      }
  }
  
  ```


### 工厂模式小结

简单工厂模式、工厂方法模式和抽象工厂模式都是创建型设计模式，它们的主要特点如下：

- **简单工厂模式**

简单工厂模式是一种将对象的创建与使用分离的设计模式，它是一种静态工厂，即工厂类中都是静态方法。简单工厂模式只有一个具体工厂类，并且只能创建一种产品，但是可以通过使用不同的参数创建出不同的具体产品。

- **工厂方法模式**

工厂方法模式是一种将对象的创建与使用分离的设计模式，基本思想是定义一个工厂接口，然后让具体工厂类实现这个接口，从而实现对产品的创建。工厂方法模式是允许有多个具体工厂类的工厂模式，每个具体工厂只生产一种产品。

- **抽象工厂模式**

抽象工厂模式是一种能够生产不同产品族的工厂模式，其基本思想是定义一个抽象工厂接口，然后在不同的具体工厂中实现这个接口，从而实现对不同产品族的创建。抽象工厂是允许有多个具体工厂类的工厂模式，每个具体工厂可以生产多种产品。

总的来说，简单工厂模式适用于创建单一产品，工厂方法模式适用于创建多个具体产品，抽象工厂模式适用于创建不同产品族。选择哪个模式要根据具体需求和实现情况来考虑。

### 原型模式

- 深拷贝和浅拷贝

  - 浅拷贝是指将一个对象复制到一个新的对象中，两者的基本数据类型的值相同，但是对于引用类型，两者对应的变量指向的是同一个引用对象，对其中一个的改变会影响另一个。
  - 深拷贝是指将一个对象复制到一个新的对象中，不仅两者的基本数据类型的值相同，而且引用类型的变量也指向了新的引用对象，两者互不干扰。

- 浅拷贝 默认的clone()方法就是浅拷贝

- 深拷贝

  - 方法1 使用clone方法

  ```java
  //深拷贝 
      @Override
      protected Object clone() throws CloneNotSupportedException {
          Object deep=null;
          try {
              //这里完成对基本（数据类型）属性的克隆
              deep = super.clone();
              //对引用类型的属性进行单独处理
              DeepProtoType deepProtoType=(DeepProtoType) deep;
              deepProtoType.deepCloneTarget=(DeepCloneableTarget) deepCloneTarget.clone();
  
          }catch (CloneNotSupportedException e){
  
          }
          return super.clone();
      }
  ```

  - 方法2 通过对象序列化实现

    ```java
    public Object deepClone(){
            //创建到流对象
            ByteArrayOutputStream bos=null;
            ObjectOutputStream oos=null;
            ByteArrayInputStream bis=null;
            ObjectInputStream ois=null;
            try {
                //序列化
                bos=new ByteArrayOutputStream();
                oos=new ObjectOutputStream(bos);
                oos.writeObject(this);//当前对象以对象流方式输出
                //反序列化
                bis=new ByteArrayInputStream(bos.toByteArray());
                ois=new ObjectInputStream(bis);
                return (DeepProtoType) ois.readObject();
            }catch (Exception e){
                e.printStackTrace();
                return null;
            }finally {
                try {
                    if (bos != null) bos.close();
                    if (oos != null) oos.close();
                    if (bis != null) bis.close();
                    if (ois != null) ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    ```

    这段代码是实现了通过对象的深拷贝来复制一个对象，具体实现的过程如下：

    1. 创建字节流对象: ByteArrayOutputStream bos, 用于存储序列化后的对象数据；ObjectOutputStream oos, 用于将对象序列化后的数据写入到 bos 中。
    2. 调用 oos.writeObject(this) 将当前对象实例写入到 bos 中，实现了对象的序列化，并存储在 bos 中。
    3. 创建字节输入流对象: ByteArrayInputStream bis, 用于读取反序列化后的数据；ObjectInputStream ois, 用于将序列化后的数据反序列化成对象。
    4. 将 bos 中的数据转变成 bis 所需的格式，并读取 bis 中的数据，将其反序列化成 DeepProtoType 对象。
    5. 将反序列化后的对象返回。

### 建造者模式

- 建造者模式可以让你更容易地构建复杂的对象，而不必关心对象的内部细节。使用该模式可以将对象的创建过程分解成多个步骤，每个步骤负责创建指定的组件或部分。这些部件最终可以组装成一个完整的复杂对象。这样，建造者模式可以使得类的设计更加模块化，易于维护和扩展。例如，您可以使用建造者模式创建汽车对象，可以先创建车轮组件、座椅组件、发动机组件等，然后再将它们组装成一个完整的汽车对象。

- 建造者模式是一种对象创建型设计模式。它允许您创建具有复杂参数构造函数的对象，同时也可以让您使用步骤来创建该对象的过程。该模式允许您创建不同类型的对象，同时避免需要指定其复杂和多参数构造函数的复杂性。建造者模式将对象的创建过程分解为多个简单的步骤，这些步骤逐个执行以创建最终对象。

- 建造者模式通常由以下几个组件组成：

  - Director: 指挥者，负责管理建造过程，即创建对象的顺序和方式。这个角色应该知道哪些步骤来执行，以便正确创建一个完整的对象；
  - Abstract Builder: 建造者接口，定义了将来的具体建造者所应该遵守的约定，以便按照规定的步骤来创建复杂对象；
  - Concrete Builder: 具体建造者，实现建造者接口中的方法以构建和装配产品，该角色负责实际创建对象的任务；
  - Product: 产品，由多个部件组成的复杂对象。产品类不需要知道创建它的细节，只需提供所需的方法即可。

  建造者模式最大的优点在于封装了对象构造过程，让对象的创建和表示分离，并且易于扩展。因此，建造者模式在涉及创建复杂对象的情况下非常有用，例如创建复杂的对象，或者对象包含许多部分或属性。

  ```java
  @Data
  public class House {
      private String basic;
      private String walls;
      private String roofed;
  }
  //抽象的建造者
  public abstract class HouseBuilder {
      protected House house=new House();
      //将建造的流程写好，抽象方法
      public abstract void buildBasic();
      public abstract void buildWalls();
      public abstract void roofed();
      //建造房子
      public House buildHouse(){
          return house;
      }
  }
  public class HighHouseBuilder extends HouseBuilder{
      @Override
      public void buildBasic() {
          System.out.println("给高楼打地基");
      }
  
      @Override
      public void buildWalls() {
          System.out.println("给高楼砌墙");
      }
  
      @Override
      public void roofed() {
          System.out.println("给高楼盖屋顶");
      }
  }
  public class CommonHouseBuilder extends HouseBuilder{
      @Override
      public void buildBasic() {
          System.out.println("给普通房子打地基");
      }
  
      @Override
      public void buildWalls() {
          System.out.println("给普通房子砌墙");
      }
  
      @Override
      public void roofed() {
          System.out.println("给普通房子封顶");
      }
  }
  public class HouseDirector {
      HouseBuilder houseBuilder=null;
  
      public HouseDirector(HouseBuilder houseBuilder) {
          this.houseBuilder = houseBuilder;
      }
  
      public void setHouseBuilder(HouseBuilder houseBuilder) {
          this.houseBuilder = houseBuilder;
      }
      //指挥
      //如何处理建造房子的流程，交给指挥者
      public House constructHouse(){
          houseBuilder.buildBasic();
          houseBuilder.buildWalls();
          houseBuilder.roofed();
          return houseBuilder.buildHouse();
      }
  }
  public class Client {
      public static void main(String[] args) {
          //盖普通房子
          CommonHouseBuilder commonHouseBuilder = new CommonHouseBuilder();
          //准备创建房子的指挥者
          HouseDirector houseDirector = new HouseDirector(commonHouseBuilder);
          //完成盖房子
          House house = houseDirector.constructHouse();
          System.out.println("house = " + house);
      }
  }
  ```

  ![image-20230408224019888](https://freelooptc.oss-cn-shenzhen.aliyuncs.com/image-20230408224019888.png)

# Java设计模式

## 一、设计模式七大原则

#### 1、单一职责原则

- 介绍：
  
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

  其核心思想是在需要获取实例时才进行对象的实例化。相比于饿汉式，懒汉式的实现需要注意多线		程环境下的线程安全问题。
  在懒汉式的实现过程中，可以使用一个私有的静态变量来存储该实例，但是不进行初始化，直到第一次使用该实例时再进行初始化，
  并返回该实例的引用。为了确保多线程环境下的线程安全问题，可以使用 synchronized 关键字或者双重检测锁来实现线程安全的访问。
  
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

### 2、简单工厂模式

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

### 适配器模式

- 类适配器

  - 类适配器是一种适配器设计模式，它可以将一个类（适配器）的接口转换为另一个类（被适配者）的接口，从而使得客户端可以使用被适配者的接口来访问适配器中的功能。在类适配器中，适配器继承自被适配者类，并实现客户端所期望的接口。
  - 类适配器的优势在于：
    1. 可以通过继承被适配者类来复用被适配者的代码和功能。
    2. 客户端可以直接访问被适配者类中的所有方法和属性。
  - 类适配器的缺点在于：
    1. 由于适配器需要继承被适配者类，因此适配器只能适配一个被适配者类，无法适配被适配者类的多个子类。
    2. 适配器与被适配者之间是通过继承关系实现的，因此适配器的实现可能受到被适配者类的限制，而无法灵活地实现客户端所期望的接口。
    3. 在被适配者类中的方法不能够被客户端重写或覆盖，这可能会导致一些问题。

  ```java
  public class Voltage220V {
      public int output220V(){
          int src=220;
          System.out.println("电压="+src+"伏");
          return src;
      }
  }
  public interface IVoltage5V {
      int output5V();
  }
  public class VoltageAdapter extends Voltage220V implements IVoltage5V {
      @Override
      public int output5V() {
          //获取到220V电压
          int srcV = output220V();
          //转成5V
          return srcV/44;
      }
  }
  public class Client {
      public static void main(String[] args) {
          System.out.println("适配器模式");
          Phone phone = new Phone();
          phone.charging(new VoltageAdapter());
      }
  }
  ```

  

- 接口适配器

  - 接口适配器是一种适配器设计模式，它通过在一个适配器中定义一个占位符接口（即接口中的所有方法都没有实现），从而使得客户端只需要实现它所需要的接口方法，而无需实现所有的方法。

  - 接口适配器通常用来解决以下问题：

    1. 当一个接口中定义了多个方法，但是客户端只需要使用其中的部分方法时，使用接口适配器可以避免客户端实现多余的方法。
    2. 当一个接口需要进行修改或扩展时，使用接口适配器可以避免对所有实现该接口类的修改。

  - 与其他适配器不同，接口适配器并不需要持有被适配者的实例或者继承被适配者类，而是通过定义一个占位符接口来实现适配器。客户端只需要实现所需要的接口方法即可

  - 接口适配器的优势在于：

    1. 客户端只需要实现所需要的方法，避免了实现多余的方法，提高了代码的可读性和可维护性。
    2. 当一个接口需要修改时，只需要修改占位符接口，而无需修改所有实现该接口的类。

  - 接口适配器的缺点在于：

    1. 占位符接口的定义可能会比较复杂，需要花费更多的时间和精力。
    2. 如果一个接口中的方法数量较多，使用接口适配器可能会导致占位符接口中方法数量过多，影响代码的可读性。

    ```java
    public interface Interface4 {
        void m1();
        void m2();
        void m3();
        void m4();
    }
    public abstract class AbsAdapter implements Interface4{
        @Override
        public void m1() {
    
        }
    
        @Override
        public void m2() {
    
        }
    
        @Override
        public void m3() {
    
        }
    
        @Override
        public void m4() {
    
        }
    }
    public class Client {
        public static void main(String[] args) {
            AbsAdapter absAdapter= new AbsAdapter() {
                //只需要去覆盖我们需要使用的接口方法
                @Override
                public void m1() {
                    System.out.println("使用了m1方法");
                }
            };
            absAdapter.m1();
        }
    }
    ```

    

- 对象适配器

  - 它使得一个类（适配器）可以将其所持有的另一个类（被适配者）的接口转换为客户端所期望的另一种接口。在对象适配器中，适配器持有被适配者的一个实例，并且将客户端的请求转发给被适配者。

  - 对象适配器的优势在于：

    1. 可以适配多个被适配者类。
    2. 适配器与被适配者之间松耦合，使得适配器可以被更加灵活地重用。

  - 对象适配器的缺点在于：

    1. 客户端只能访问被适配者类中已有的接口，无法访问被适配者类中的其他方法。
    2. 由于适配器需要持有被适配者的实例，因此如果被适配者本身是一个大型或重量级对象，可能会导致内存占用过高。

    ```java
    public class Voltage220V {
        public int output220V(){
            int src=220;
            System.out.println("电压="+src+"伏");
            return src;
        }
    }
    public interface IVoltage5V {
        int output5V();
    }
    public class VoltageAdapter implements IVoltage5V {
        private Voltage220V voltage220V;
    
        public VoltageAdapter(Voltage220V voltage220V) {
            this.voltage220V = voltage220V;
        }
    
        @Override
        public int output5V() {
            int dst=0;
            if(voltage220V!=null){
                System.out.println("使用对象适配器进行转换");
                //获取到220V电压
                int srcV =voltage220V.output220V();
                //转成5V
                dst=srcV/44;
            }
            return dst;
        }
    }
    public class Client {
        public static void main(String[] args) {
            System.out.println("适配器模式");
            Phone phone = new Phone();
            //传入被适配器
            phone.charging(new VoltageAdapter(new Voltage220V()));
        }
    }
    ```


### 桥接模式

- 桥接模式通过将抽象部分和实现部分分离，使得它们可以独立地变化。在桥接模式中，我们使用一个桥接类来连接抽象部分和实现部分，这个桥接类包含了抽象类的引用，以及一个实现类的引用。这样，我们就可以动态地改变抽象部分和实现部分之间的关系。

  ```java
  public interface Brand {
      void open();
      void close();
      void call();
  }
  public abstract class Phone {
      private Brand brand;
  
      public Phone(Brand brand) {
          super();
          this.brand = brand;
      }
  
      protected void open() {
          this.brand.open();
      }
      protected void close() {
          this.brand.close();
      }
      protected void call() {
          this.brand.call();
      }
  }
  public class FoldPhone extends Phone{
      public FoldPhone(Brand brand) {
          super(brand);
      }
      public void open() {
          super.open();
          System.out.println("折叠手机");
      }
      public void close() {
          super.close();
          System.out.println("折叠手机");
      }
      public void call() {
          super.call();
          System.out.println("折叠手机");
      }
  }
  public class UpRightPhone extends Phone{
      public UpRightPhone(Brand brand) {
          super(brand);
      }
  
  
      public void open() {
          super.open();
          System.out.println("直立手机");
      }
      public void close() {
          super.close();
          System.out.println("直立手机");
      }
      public void call() {
          super.call();
          System.out.println("直立手机");
      }
  }
  public class Vivo implements Brand{
      @Override
      public void open() {
          System.out.println("vivo手机开机");
      }
  
      @Override
      public void close() {
          System.out.println("vivo手机关机");
      }
  
      @Override
      public void call() {
          System.out.println("vivo手机打电话");
      }
  }
  public class XIaoMI implements Brand{
      @Override
      public void open() {
          System.out.println("小米手机开机");
      }
  
      @Override
      public void close() {
          System.out.println("小米手机关机");
      }
  
      @Override
      public void call() {
          System.out.println("小米手机打电话");
      }
  }
  public class Client {
      public static void main(String[] args) {
          //获取折叠手机
          Phone foldPhone = new FoldPhone(new XIaoMI());
          foldPhone.open();
          foldPhone.close();
          foldPhone.close();
  
          Phone foldPhone1 = new UpRightPhone(new Vivo());
          foldPhone1.open();
          foldPhone1.call();
          foldPhone1.close();
  
      }
  }
  ```

  ![image-20230410100333803](https://freelooptc.oss-cn-shenzhen.aliyuncs.com/image-20230410100333803.png)

### 装饰器模式

- 装饰器模式是一种结构型设计模式，它允许在运行时动态地新增一些行为到一个对象中，而不需要修改它的源代码。这种设计模式通过将对象封装在装饰器类中，以增加对象的功能和特性，而不需要创建一个新的子类。

- 这种模式适用于：

  - 需要在不修改原始对象源代码的情况下增加对象功能的场景；

  - 需要在运行时为一个对象增加多个行为的场景；

  - 在继承关系中，父类结构固定，但是需要新增一些功能的场景。

- 装饰器模式的实现可以基于类或者基于函数。在基于类实现中，装饰器类通常继承自原始对象的类，然后通过组合方式在运行时为原始对象增加新的职责。在基于函数实现中，装饰器函数接收一个函数作为参数，然后返回一个新的函数，在这个新的函数中增加了新的行为。

  抽象类

  ```java
  public abstract class Drink {
      public String des;
      private float price=0.0f;
      //计算费用的抽象方法
      public abstract  float cost();
  
      public String getDes() {
          return des;
      }
  
      public void setDes(String des) {
          this.des = des;
      }
  
      public float getPrice() {
          return price;
      }
  
      public void setPrice(float price) {
          this.price = price;
      }
  
      @Override
      public String toString() {
          return "Drink{" +
                  "描述='" + des + '\'' +
                  ", 价格=" + price +
                  '}';
      }
  }
  
  ```

  装饰类

  ```java
  public class Decorator extends Drink{
      private Drink obj;
      public Decorator(Drink obj) {
          this.obj = obj;
      }
      @Override
      public float cost() {
          return super.getPrice()+ obj.cost();
      }
  
  
  
      @Override
      public String getDes() {
          return super.des
                  +" "+super.getPrice()
                  +"&&"+obj.getDes();
      }
  }
  ```
  
  品类
  
  ```java
  public class Coffee extends Drink{
      @Override
      public float cost() {
          return super.getPrice();
      }
  
  }
  ```
  
  单品类
  
  ```javav
  public class ShortBlack extends Coffee{
      public ShortBlack() {
          this.setDes("ShortBlack");
          this.setPrice(4.0f);
      }
  }
  public class LongBlack extends Coffee {
      public LongBlack() {
          this.setDes("美式咖啡");
          this.setPrice(5.0f);
      }
  }
  ```
  
  装饰类
  
  ```java
  public class Soy extends Decorator{
      public Soy(Drink obj) {
          super(obj);
          setDes("豆浆");
          setPrice(1.5f);
      }
  }
  public class Milk extends Decorator{
      public Milk(Drink obj) {
          super(obj);
          setDes("牛奶");
          setPrice(2.0f);
      }
  }
  public class Espresso extends Coffee{
      public Espresso(){
          this.setDes("意大利咖啡");
          this.setPrice(6.0f);
      }
  }
  ```
  
  客户端
  
  ```
  public class CoffeeBar {
      public static void main(String[] args) {
          //1.点一份longBlack
          Drink order = new LongBlack();
          System.out.println("order = " +order.getDes()+ order.cost());
          //2.加入一份牛奶
          order=new Milk(order);
          System.out.println("order = "+order.getDes() + order.cost());
          //3.加入一份巧克力
          order=new Chocolate(order);
          System.out.println("order = " +order.getDes()+ order.cost());
      }
  }
  ```

​		![image-20230410120740431](https://freelooptc.oss-cn-shenzhen.aliyuncs.com/image-20230410120740431.png)

### 组合模式

- 组合模式是一种常用的结构型设计模式，它通过将对象组合成树状结构，可以让客户端以统一的方式处理单个对象和组合对象。这种模式可以让我们更加灵活地构建层级结构，以及处理层级结构中的对象，让结构更清晰，代码更易于理解。

- 组合模式适用于以下情况：

  - 需要构建层级结构的场景，如文件系统、组织架构等；

  - 希望客户端能够以一种统一的方式处理单个对象和组合对象的场景；

  - 希望在层级结构中增加或者删除某个对象时，对其他对象没有影响。

- 在组合模式中，有两种对象类型：组合对象和叶子对象。组合对象包含其他组合对象或者叶子对象，叶子对象没有子对象，可以被当做基本对象来处理。组合对象和叶子对象都实现了相同的接口，可以在客户端以一种统一的方式来使用。

```java
//接口类
public abstract class OrganizationComponent {
    private String name;
    private String des;
    protected void add(OrganizationComponent organizationComponent){
        throw new UnsupportedOperationException();
    }
    protected void remove(OrganizationComponent organizationComponent){
        throw new UnsupportedOperationException();
    }
    //方法print
    protected abstract void print();

    public OrganizationComponent(String name, String des) {
        super();
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
//组合对象
public class University extends OrganizationComponent{

    List<OrganizationComponent> organizationComponents=new ArrayList<>();
    public University(String name, String des) {
        super(name, des);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }
    //print()方法就是输出University包含的学院
    @Override
    protected void print() {
        System.out.println("=========="+this.getName()+"==========");
        //打印出
        for (OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.print();
        }
    }

}
//组合对象
public class Collage extends OrganizationComponent{
    //这个list中存放的是Department
    List<OrganizationComponent> organizationComponents=new ArrayList<>();

    public Collage(String name, String des) {
        super(name, des);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }
    //print()方法就是输出University包含的学院
    @Override
    protected void print() {
        System.out.println("=========="+this.getName()+"==========");
        //打印出
        for (OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.print();
        }
    }
}
//叶子节点
public class Department extends OrganizationComponent{

    public Department(String name, String des) {
        super(name, des);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    protected void print() {
        System.out.println(this.getName());
    }
}
```

运行程序

```java
public class Client {
    public static void main(String[] args) {
        //从大到小创建对象
        OrganizationComponent university = new University("湖南工厂学院", "学校");
        OrganizationComponent collage = new Collage("计算机学院", "计算机");
        OrganizationComponent collage1 = new Collage("化学学院", "化学");
        OrganizationComponent collage2 = new Collage("数学学院", "数学");
        collage.add(new Department("软件工程", "软工"));
        collage.add(new Department("计算机科学与技术", "码农"));
        collage.add( new Department("计算机网络", "网工"));
        university.add(collage);
        university.add(collage1);
        university.add(collage2);
        university.print();
    }
}
```

运行结果

```text
==========湖南工厂学院==========
==========计算机学院==========
软件工程
计算机科学与技术
计算机网络
==========化学学院==========
==========数学学院==========
```

### 外观模式

- 外观模式对外屏蔽了子系统的细节，因此外观模式降低了客户端对子系统的使用的复杂性

- 外观模式对客户端与子系统之间的耦合关系，让子系统内部更易维护和扩展

- 通过合理的使用外观模式，可以帮我们更好的划分访问的层次

- 当系统需要分层设计时，可以考虑使用外观模式

- 在维护一个遗留的大系统时，可能这个系统已经变得非常难以维护和扩展，此时可以考虑为新系统开发一个外观类，来提供遗留系统的比较清晰简单的接口，让新系统与外观类交互，提高复用性

- 不能过多的或者不合理的使用外观模式，使用外观模式好，还是直接调用模块好，要以让系统更加有层次，有利于维护为目的

  ```java
  // 子系统A
  class SystemA {
      public void operationA() {
          System.out.println("SystemA operation");
      }
  }
  
  // 子系统B
  class SystemB {
      public void operationB() {
          System.out.println("SystemB operation");
      }
  }
  
  // 外观类
  class Facade {
      private SystemA systemA;
      private SystemB systemB;
      
      public Facade() {
          systemA = new SystemA();
          systemB = new SystemB();
      }
  
      public void operate() {
          systemA.operationA();
          systemB.operationB();
      }
  }
  
  // 客户端
  public class Client {
      public static void main(String[] args) {
          Facade facade = new Facade();
          facade.operate();
      }
  }
  
  ```

  在上述示例中，`SystemA` 和 `SystemB` 是两个复杂的子系统，客户端需要了解内部实现才能操作。而 `Facade` 类则是一个外观，封装了 `SystemA` 和 `SystemB` 的操作，在客户端调用时只需要操作 `Facade` 类，无需关心内部细节。这种设计能够提高代码的灵活性和可维护性，同时也能提高客户端的操作便捷性

### 享元模式

- 享表示共享，元表示对象

- 系统中有大量对象，这些对象消耗大量内存，并且对象的状态大部分可以外部化时，我们就可以考虑选用享元模式

- 用唯一标识码判断，如果在内存中有，则返回这个唯一的标识码标识的对象，用HashMap存储

- 享元模式提高了系统的复杂度，需要分离出内部状态和外部状态而外部状态具有固化特性，不应该随着内部状态的改变而改变，这是我们使用享元模式需要注意的地方

- 使用享元模式时，注意划分内部状态和外部状态，并且需要有一个工厂内加以控制

- 享元模式经典的应用场景是需要使用到缓冲池的场景，比如String常量池，数据库连接池。

- 享元模式是一种结构型设计模式，它的主要目的是通过分享对象来尽量减少内存使用量。享元模式将一个对象分成两个部分：内部状态（Intrinsic State）和外部状态（Extrinsic State）。

  内部状态指的是对象的一些固有属性，这些属性可以在对象被创建时进行初始化，一旦初始化后就不会发生改变。因此，所有实例间内部状态相同的对象可以共享同一个存储位置，而不需要每个对象都创建一个存储位置。

  外部状态指的是对象的一些变化属性，这些属性可能在对象创建后会发生改变。因此，不同实例之间的外部状态是不同的，不能共享同一个存储位置。在使用享元模式时，需要将这些外部状态从对象中拆分出来，并作为参数传递给对象的操作方法。

  以围棋游戏为例，棋子的内部状态是其颜色（黑色或白色），而外部状态指的是其位置。在使用享元模式时，可以将所有颜色相同的棋子共享同一个对象，因为它们的内部状态相同，而将不同位置的棋子作为外部状态传递给棋子的操作方法。这样可以大大减少内存使用量。

  ```java
  public abstract class WebSite {
     public abstract void use(User user);
  }
  public class ConcreteWebSite extends WebSite{
      //共享的部分，内部状态
      private String type="";//网站发布的类型
      @Override
      public void use(User user) {
          System.out.println("网站的发布形式为"+type);
          System.out.println("使用者"+user.getUsername());
      }
  
      public ConcreteWebSite(String type) {
          this.type = type;
      }
  }
  public class WebSiteFactory {
      //集合，充当池的作用
      private HashMap<String,ConcreteWebSite> pool=new HashMap();
      //根据网站的类型返回一个网站，如果没有就创建就创建一个网站并放入到池中，并返回
      public WebSite getWebSiteCategory(String type){
          if (!pool.containsKey(type)){
              //创建一个
              pool.put(type,new ConcreteWebSite(type));
          }
          return (WebSite) pool.get(type);
      }
      //获取网站分类总数
      public int getWebSiteCount(){
          return pool.size();
      }
  }
  //享元模式的外部状态
  public class User {
      private String username;
  
      public String getUsername() {
          return username;
      }
  
      public void setUsername(String username) {
          this.username = username;
      }
  
      public User(String username) {
          this.username = username;
      }
  }
  public class Client {
      public static void main(String[] args) {
          //创建一个工厂类
          WebSiteFactory webSiteFactory = new WebSiteFactory();
          //客户要一个以新闻形式发布的网站
          WebSite web1 = webSiteFactory.getWebSiteCategory("news");
          web1.use(new User("cxk"));
          WebSite web2= webSiteFactory.getWebSiteCategory("news");
          web1.use(new User("cxk2"));
          WebSite web3 = webSiteFactory.getWebSiteCategory("news");
          web1.use(new User("cxk3"));
          WebSite web4 = webSiteFactory.getWebSiteCategory("news");
          web1.use(new User("cxk4"));
          //获取webSite大小
          int webSiteCount = webSiteFactory.getWebSiteCount();
          System.out.println("webSiteCount = " + webSiteCount);
      }
  }
  ```

  运行结果

  ```\
  网站的发布形式为news
  使用者cxk
  网站的发布形式为news
  使用者cxk2
  网站的发布形式为news
  使用者cxk3
  网站的发布形式为news
  使用者cxk4
  webSiteCount = 1
  ```


### 代理模式

#### 静态代理模式

- 静态代理是指定义一个代理类去代理一个真实类，使得调用者在使用时无需知道真实类的存在，代理类会在调用真实类方法前后加上一些额外的逻辑处理。

- 静态代理需要针对每个被代理类单独写一个代理类，即使代理逻辑相同，每次都需要重复写代理类，不利于维护和扩展。

- 例如，假设有一个接口 IUserService，定义了一个方法 saveUser，真实类 UserServiceImpl 实现了该接口，我们可以定义一个代理类 UserServiceProxy 去代理 UserServiceImpl，并在代理类中加上一些额外的逻辑，如记录日志、检验参数等，代码如下：

  ```java
  public interface IUserService {
      void saveUser(String name, String pwd);
  }
  
  public class UserServiceImpl implements IUserService{
      @Override
      public void saveUser(String name, String pwd) {
          // 真正的业务逻辑
      }
  }
  
  public class UserServiceProxy implements IUserService{
      private IUserService userService;
   
      public UserServiceProxy(IUserService userService){
          this.userService = userService;
      }
   
      @Override
      public void saveUser(String name, String pwd) {
          System.out.println("保存用户前检验参数...");
          userService.saveUser(name, pwd);
          System.out.println("保存用户后记录日志...");
      }
  }
  ```

  使用时，我们先创建真实类 UserServiceImpl 的实例，再创建代理类 UserServiceProxy 的实例，将真实类实例传入代理类构造方法中，最后调用代理类的 saveUser 方法，代码如下：

  ```java
  IUserService userServiceImpl = new UserServiceImpl();
  IUserService userServiceProxy = new UserServiceProxy(userServiceImpl);
  userServiceProxy.saveUser("Tom", "123456");
  
  ```

  输出：

  ```java
  保存用户前检验参数...
  保存用户...
  保存用户后记录日志...
  ```

  可以看到，调用代理类的 saveUser 方法时，代理类会在调用真实类方法前后加上一些额外的逻辑处理，达到了代理的目的。

#### JDK动态代理

- 相比较于静态代理需要手动编写代理类，JDK动态代理可以在运行时动态生成代理类，不需要手写代理类。JDK动态代理需要有一个接口来声明代理类，所以只能代理有接口的真实类，不能代理没有接口的类。

- JDK动态代理的核心类是 java.lang.reflect.Proxy，它提供了一个静态工厂方法 newProxyInstance，用来创建代理类对象。newProxyInstance 方法需要传入三个参数，分别为：类加载器、代理类需要实现的接口数组、指定的 InvocationHandler 对象。

- InvocationHandler 接口中只有一个方法 invoke，该方法会在代理类调用任意方法时被回调，我们可以在该方法中对真实类方法的调用进行拦截和增强处理。

  ```java
  public interface ITeacherDao {
      void teach();
  }
  public class TeacherDao implements ITeacherDao{
      @Override
      public void teach() {
          System.out.println("老师正在授课中......");
      }
  }
  public class ProxyFactory {
      //维护一个目标对象，Object
      private Object target;
      //通过构造器传入目标对象，初始化
      public ProxyFactory(Object target) {
          this.target = target;
      }
      //给目标对象生成一个代理对象
      public Object getProxyInstance(){
          /**
           * public static Object newProxyInstance(ClassLoader loader,
           *                 Class<?>[] interfaces,
           *                 InvocationHandler h)
           * 1 ClassLoader loader:指当前目标对象使用的类加载器，获取加载器的方法固定
           * 2 Class<>() interface:目标对象实现的接口，使用泛型方法确认实现
           * 3 InvocationHandler h:事件处理器，执行目标方法时，会触发事情处理器方法
           * 会把当前执行的目标对象方法作为一个参数传入
           */
          return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                  target.getClass().getInterfaces(), new InvocationHandler() {
                      @Override
                      public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                          System.out.println("==>JDK代理<==");
                          //反射调用目标对象的方法
                          return method.invoke(target, args);
                      }
                  });
      }
  }
  public class Client {
      public static void main(String[] args) {
          //创建目标对象
          ITeacherDao teacherDao = new TeacherDao();
          //给目标对象创建代理对象
          ProxyFactory proxyFactory = new ProxyFactory(teacherDao);
          ITeacherDao proxyInstance = (ITeacherDao)proxyFactory.getProxyInstance();
          proxyInstance.teach();
      }
  }
  ```

  输出结果

  ```text
  ==>JDK代理<==
  老师正在授课中......
  ```

#### Cglib动态代理

​	优点

- 相对于 JDK 动态代理，它可以代理没有实现接口的类。
- 生成的代理类是目标对象的子类，因此可以重写目标对象的方法，实现代理逻辑。
- CGLIB 库性能比 JDK 动态代理高，因为它使用字节码生成技术直接对目标对象进行操作，而不是通过反射调用目标方法。

​    缺点

- 由于 CGLIB 是直接操作字节码生成代理类，因此可能会有一些类加载方面的问题。

- 由于它是生成子类来实现代理，因此如果目标类被final关键字修饰，CGLIB就无法对其进行代理，会导致代理失败的情况。

  ```java
  public class TeacherDao {
      public void teach(){
          System.out.println("Cglib代理，不需要实现接口");
      }
  }
  public class ProxyFactory implements MethodInterceptor{
      //维护一个目标对象
      private Object target;
      //传入一个被代理的对象
      public ProxyFactory(Object target) {
          this.target = target;
      }
      //返回一个代理对象，目标对象的代理对象
      public Object getProxyInstance(){
          //创建一个工具类
          Enhancer enhancer = new Enhancer();
          //设置父类
          enhancer.setSuperclass(target.getClass());
          //设置回调函数
          enhancer.setCallback(this);
          //创建子类对象，即代理对象
          return enhancer.create();
      }
      // intercept()会调用目标对象的方法
      @Override
      public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
          System.out.println("Cglib代理模式开始");
          Object invoke = method.invoke(target, args);
          System.out.println("Cglib代理提交");
          return invoke;
      }
  }
  public class Client {
      public static void main(String[] args) {
          //创建目标对象
          TeacherDao teacherDao = new TeacherDao();
          //获取代理对象，将目标对象传递给代理对象
          ProxyFactory proxyFactory = new ProxyFactory(teacherDao);
          TeacherDao proxyInstance = (TeacherDao)proxyFactory.getProxyInstance();
          //执行代理对象的方法，触发intercept()方法从而实现对目标对象的调用
          proxyInstance.teach();
      }
  }
  ```

  

### 模板方法模式

- 模板方法模式是一种设计模式，可以让程序员通过定义一些基本算法的步骤，来约束程序员在这些步骤上完成操作。这种模式既不会改变已有的算法步骤，也不会另外编写新的算法，只要在基本算法的步骤上进行扩展就可以了。常常用于处理需要按照一定步骤进行处理的问题。

- 模板方法模式包含以下角色：

  - 抽象模板（Abstract Template）类： 定义了模板方法和一些抽象方法，这些抽象方法由子类来实现。
  - 具体模板（Concrete Template）类： 实现了抽象模板类中定义的抽象方法，完成模板方法中的各个步骤。
  - 客户端（Client）类： 调用模板方法来完成具体的业务逻辑。

- 模板方法模式优点：

  1. 算法骨架是固定的，易于控制和管理；
  2. 扩展性好，具体的实现可以在子类中定义；
  3. 符合开闭原则，代码在使用过程中可以扩展，但不需要修改。

- 模板方法模式缺点：

  1. 模板方法中定义的步骤是固定的，不够灵活。
  2. 如果具体实现类过多，会导致子类数量过于庞大，导致系统复杂度的提高。

  抽象模板

  ```java
  public abstract class SoyaMilk {
      //模板方法，make 模板方法可以做成final，不让子类去覆盖
      final void make(){
          select();
          addCondiment();
          soak();
          beat();
      }
      //选材料
      void select(){
          System.out.println("1选好材料--新鲜黄豆");
      }
      //添加不同的配料，抽象方法
      abstract void addCondiment();
      //浸泡
      void soak(){
          System.out.println("3黄豆和材料开始浸泡");
      }
      void beat(){
          System.out.println("4黄豆和配料放入豆浆机");
      }
  }
  ```

  具体模板

  ```java
  public class RedBeanSoyamilk extends SoyaMilk {
      @Override
      void addCondiment() {
          System.out.println("加入上好的红豆");
      }
  }
  public class PeanutSoyaMilk extends SoyaMilk{
      @Override
      void addCondiment() {
          System.out.println("加入上好的花生");
      }
  }
  ```

  客户端

  ```java
  public class Client {
      public static void main(String[] args) {
          //制作红豆豆浆
          SoyaMilk redBeanSoyamilk = new RedBeanSoyamilk();
          redBeanSoyamilk.make();
          System.out.println("=====");
          SoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
          peanutSoyaMilk.make();
      }
  }
  ```

- 也可以引入钩子函数，它默认不做任何事情，子类可以视情况要不要覆盖

  ```java
  public abstract class SoyaMilk {
      //模板方法，make 模板方法可以做成final，不让子类去覆盖
      final void make(){
          select();
          if(customWant()){
              addCondiment();
          }
          soak();
          beat();
      }
      //选材料
      void select(){
          System.out.println("1选好材料--新鲜黄豆");
      }
      //添加不同的配料，抽象方法
      abstract void addCondiment();
      //浸泡
      void soak(){
          System.out.println("3黄豆和材料开始浸泡");
      }
      void beat(){
          System.out.println("4黄豆和配料放入豆浆机");
      }
      //钩子方法，决定是否需要添加配料
      boolean customWant(){
          return true;
      }
  }
  public class PureSoyaMilk extends SoyaMilk{
  
      @Override
      void addCondiment() {
          //空实现
      }
      //不需要配料 实现钩子方法
      @Override
      boolean customWant() {
          return false;
      }
  }
  ```

  

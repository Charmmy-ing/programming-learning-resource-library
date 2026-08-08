# javanote（ running in JVM）
  - 计算机的存储规则
    - 最小存储单元：字节
      - 一个字节8个bit
    - 任意数据都以二进制存储
  - 标识符（自己起的任何名）
    > 类名，变量名，方法名
    - 起名字的时候尽量用英文
    - 硬性要求，规定
      - 只能由数字，字母，下划线，美元$字符组成
      - 不能以数字开头，不能是关键字，区分大小写
    - 软性命名
      - 大驼峰命名
        > 类名用该方法
        - 一个单词首字母大写，多个单词每个单词开头大写
      - 小驼峰法
        - 一个单词全部小写，多个单词第一个单词小写其它大写
  - 方法
    - 能完成特定任务和操作的代码块
    - 修饰符 返回类型 方法名（形参列表）
    - 有的方法要接数据    有的方法不返回数据
    - 方法可以重载（一个方法名可以有定义在多个方法名上）
    - 无返回值的方法中return可以让方法立刻结束
  - 类型转换
    - 类型范围小的变量可以直接赋值给大范围类型      |||||||大范围类型的数据转为小范围类型的数据要强制类型转换（可能发生数据溢出）
    - 浮点数转换成整数会直接取整数部分，舍弃小数
    - 表达式自动类型转换
      - byte short char直接默认为int参与运算，最后结果以最大范围类型输出（ide整数会被默认为int类型，所以再传形参时可能会与方法中的形参类型冲突报错）
    - 类型转换优先度极高，比运算符+-*/都高，所有转型时记得加（）
  - API 应用程序接口
  - 分支结构
    - if分支
      - 三种分支
        - if（）{}
        - if（）{}else{}
        - if（）{}else if（）{}else if（）{}else……
    - switch分支
      - switch（）{case 单值： break ；    case 单值：     break；……defult：……break}
      - Switch可以对单值进行判断；在单值判断上比if更快（switch运用了树的结构编写可以快速跳到对应值处，不会像if一样一行一行判断，但if更适合对非单值的条件判断）
      - 问题：switch（）里单值只能是byte shart int，不能是double float （浮点数精度不够不能用来判断）long（数据类型太大）
      - 会发生穿透现象（穿透也可以提升分支简便性）
  - 循环结构
    - 两者区别：区别不大，对与知道的循环次数用for；不知道用while
    - for循环
      - for（初始语句；循环条件；迭代语句）{ 循环体语句     }
    - while循环
      - while（循环条件）{重复语句；迭代语句}
    - do while循环
      - do{循环体语句；迭代语句}while（循环条件）；
      - 先执行再判断（用在抢票a方法上，先抢一票再说，不用浪费时间判断条件）
    - 死循环(形式：一种可以一直循环下去的程序)
      - 服务器里等用户注册，可以一直转（一种死循环）
    - 循环嵌套
      - 一般只嵌套两次，否则时间复杂度太大o（n^2);
      - for可以嵌套while
    - 关键字 break continue
      - break：跳出并结束所在循环，或者结束所在switch分支执行（直接结束）
      - continue：用于调出本次执行，直接进入下次循环（跳过这次循环）
  - 程序存储
    - 储存方式：栈，堆，方法，三个区，类放到方法区，new出来的对象放在堆区，变量放到栈区（栈区可以自动清除已经执行的程序），这样方便程序的执行和维护
  - 类的基础模版
    - 构造器
      - 没有返回值声明，名称和类名一致的一种特殊方法叫构造器
      - public 类名（有无参都行）{           }
      - 特点：创建对象这个类时，他会自己立即调用类里的构造器
      - 应用：在创建对象时，可以同时完成对对象成员变量的初始化或者赋值（不用再手动初始化）
      - 类自带无参构造器；当类里有有参构造器时，里面自带的无参构造器会消失，要再用需要自己在类里写一个无参构造器
    - this关键字
      - this就是一个变量，可以用在方法里，来拿到当前对象
      - 那个对象调用这个含义this的方法，this就拿到哪个对象
      - 拿到开辟出来的对象的地址，和对象里的变量值
      - 用来解决变量名称冲突的问题，当（要出现两个相同变量名时（解决（对象变量）成员变量与（方法变量）局部变量冲突问题））this.name与name的含义将不同，以此来达到区分的意义
    - javabean（实体类）
      - 该类中的成员变量一定全部私有化，并提供public修饰的getter/setter方法
      - 类中必须提供一个无参数构造器
      - 作用：将创建他的对象，存储，封装他的数据行业规范化为一个类
      - 应用场景：在功能分层操作中应用，（把不同功能的功能分开为不同的类，防止一个崩了，全崩）
      - 不同类里的数据传输:
    - static关键字
      - static（静态）；可以修饰成员变量，成员方法
        - static修饰变量
          - 成员变量：分为静态变量（加了static修饰的类（这样这个静态的成员变量只属于这个类））和实例变量（实例其实就是对象，没有static修饰属于每个对象）
            - 静态变量（类变量）
              - 应用场景
                - 如果某个数据只需要一份，且希望能被共享（访问，修改），则该数据可以定义为静态变量
                  - 如：想记住字节创建了多少个用户变量
              - 静态变量可以用类名+.来访问，也可以用对象名+.来访问（建议用类名来访问）
                - 静态变量只有一个，对静态变量修改，不管你新建了多少个对象，只要调的是同一个类中的静态变量那么无论对这个变量修改多少次都会变为最后一次修改的值（这体现出了它只有一份的概念，怎么修改都是对这一个静态变量修改）（放在堆内存）
            - 实例变量
              - 实例变量：没有static修饰，属于对象，每个对象只有一份（只能用对象名+.来访问）
                - 实例变量对每个对象都有一个（属于类的每个对象）
              - 每个对象都有一份，数据不相同
        - 注意事项：
          - 1.静态方法中可以直接访问静态成员，不可以直接访问实例成员
          - 2.实例方法中既可以直接访问静态成员，也可以直接访问实例成员
          - 3.实例方法中可以出现this关键字，静态方法中不可以出现this关键字
            - this调对象，静态方法不用对象调用类名调
        - static修饰方法
          - 静态方法
            - 加static
              - 如果这个方法只是为了做一个功能，不用访问对象的功能，则就把他定义成静态方法
                - 可以用来做工具类，可以节约内存，构造器要私有化
          - 实例方法
            - 不加static
              - 如果这个方法是对象的行为，则需要访问对象的数据，就把这个方法定义为实例方法
                - 实例方法会占用内存
          - 类名在同一个类里面可以省略
    - 面向对象的三大特征
      - 封装
        - 封装：把数据和数据的处理放到同一个类里
        - 类就是一种封装（把对象数据和方法封装到一个架子里，方法也是一种封装）
        - 封装的设计要求：合理隐藏，合理暴露
        - 如何合理隐藏：使用private关键字（私有，隐藏）修饰成员变量，就只能在本类中被访问；其它任何地方都不能直接访问（给数据上锁，防止数据被任意修改）
        - 如何合理暴露：使用public关键字修饰的get和set方法合理暴露（该方法可以约束你对数据的修改范围）eg：public void setname（） {}set表示输入，getname表示暴露name（不写get或者set或者该set写get都不能实现方法）
          - getName() 方法
作用：获取（读取）对象的 name 属性值
返回值：返回 name 属性的当前值
用途：允许外部代码读取对象的属性值，而不需要直接访问私有字段
setName() 方法
作用：设置（修改）对象的 name 属性值
参数：接收一个 String 类型的参数，作为新的 name 值
用途：允许外部代码修改对象的属性值，而不需要直接访问私有字段
区别
特性	getName()	setName()
方法类型	getter 方法	setter 方法
返回值	有返回值（返回属性值）	无返回值（void）
参数	无参数	有参数（新的属性值）
操作	读取属性值	修改属性值
方法体	return name;	this.name = name;
为什么需要这些方法？
这涉及到面向对象编程中的封装概念：

数据隐藏：将 name 声明为 private，防止外部代码直接访问
访问控制：通过公共的 getter/setter 方法控制属性的访问
数据验证：可以在 setter 方法中添加验证逻辑（例如，检查输入值是否合法）
代码可维护性：如果将来需要修改属性的实现方式，只需修改 getter/setter 方法，而不需要修改使用这些方法的代码
      - 继承
        - 认识继承
          - 一种父子关系（提高代码重复使用性）
          - extends可以让一个类和另一个类去建立起父子关系；B extends A：A是B的父类
          - 子类可以调用父类的属性方法，变简便
          - 子类可以继承父类的非私有成员，子类对象其实是父类和子类多张设计图共同设计创建出来的对象，所以子类的对象是完整的.
            - 你的代码之所以能够访问private name 属性，是因为：

Teachaes 类继承了 People 类的 setName() 和 getName() 方法
这些方法是 public 的，可以被继承和调用
通过这些方法，你可以间接地访问和修改 People 类中 private 的 name 属性
        - 权限修饰符
          - 就是用来限制类中的成员，能被访问的范围
          - private：只能在当前类访问（在没有解锁时）
          - 没有修饰：本类和本包中访问
          - protected：本类，同一个包中的类，跨包的子孙类中
        - 继承的特点
          - 单继承
            - 一个类只能有一个父类
              - 假设能多继承，会导致调取不同父类的方法产生二异性
          - 多层继承
            - 你的父类可以有一个父类，以此类推
          - 祖宗类（Object）
            - Object可以让功能通用
            - JAVA中的所有类默认都继承或间接或直接Object类，Object·是所有类的祖宗类
          - 就近原则
            - 子类的方法中访问其他成员（方法，变量），依据就近原则先子类再父类，没有就报错。
            - super可以指定访问父类数据this可以防重名调用，
        - 方法重写
          - 当子类觉得父类中某个方法不好时，他可以重写一个方法名称，参数列表一样的方法，去覆盖父类的这个方法，这就是方法重写
            - 注意事项
              - 子类的访问权限要大于等于父类访问权限
              - 要求方法的参数列表和返回值类型与父类方法的参数列表和返回值类型相同（要一模一样）
              - 重写的返回值要小于等于父类类型
              - 私有方法静态方法不能被重写
          - 应用场景
            - 子类重写Object类的toString（）方法，以便返回对象的内容
              - 直接输出对象，会默认输出Object类的toString方法，默认返回对象的地址信息
              - 重写toString方法可以返回对象内容
        - 子类构造器
          - 子类的全部构造器都会先调用父类的构造器，再执行自己的构造器(默认调无参构造器，加super调有参构造器)
            - 先调无参是因为类中默认有super（）存在只是先隐藏类
          - 可以调用父类构造器来完成不同类中的数据的赋值
        - this（……）调用兄弟构造器
          - 注意事项：super()，this（）必须写在构造器第一行，且不能同时出现；
          - this（name，sex）
      - 多态
        - 认识多态
          - 概念	通俗理解
实现类	"填空"的类，把抽象方法补全具体实现
多态	"一个接口，多种实现"，父类引用能指向子类对象
简单说：实现类负责"做什么"，多态负责"怎么调用" 😊
          - 多态前提，有继承，实现关系，存在父类引用子类对象，存在方法重写；
          - 是一种在继承和实现情况下的一种现象，表现为对象多态，行为多态
          - 方法编译看左运行看右
          - 变量编译运行都看左
          - 变量不强调多态性
        - 多态的好处和优点
          - 在多态形势下，右边对象是解耦合的，更便于拓展和维护（像拼积木一样）
          - 父类类型作为参数，可以接收一个子类对象，更灵活（多态下调不了子类独有行为）
        - 多态下的类型转换（实现调用子类独有方法）
          - 自动类型转换：父名 变量名=new 子类（）；
          - 强类型转换：子类 变量名=（子类）父类变量（）；
            - 可以掉子类的独有功能
            - 强转不能随便转，转的对象要和真实类型一样
            - 用instenceof来判断他的真实类型，再来进行转型；
  - print和println的区别
    - 在 Java 中，print 和 println 都是 System.out 类的方法，用于向控制台输出信息，它们的主要区别在于：

1. 换行行为
print()：输出内容后不会自动添加换行符，后续输出会紧跟在当前内容之后
println()：输出内容后会自动添加换行符，后续输出会从新的一行开始
  - 面向对象高级
    - final
      - 认识final
        - final可以用来修饰类方法和变量
          - 修饰类：该类被称为最终类，特点是不能被继承了
            - 工具类（实现功能）没有必要被别的程序继承所有可以用final修饰
          - 修饰方法：该方法被称为最终方法，特点是不能被重写
          - 修饰变量：该变量有且只能被赋值一次（且一定要有赋值）
            - 避免固定值被更改（更安全）
            - final修饰静态成员变量：也是只能赋值一次，且被修饰的变量被称为常量，它能记住一个固定值，并且程序里不能修改，通常这个值被作为系统的配置信息（常量的名称要全部大写多个字母用下划线）
            - final修饰的实例变量（一般没有意义，因为该类会没有意义（不可更改））；
            - final修饰的引用变量的地址不能更改，但内容可以改
      - 常量
        - 常量命名的规范：建议使用大写英文字母，多个单词使用下划线连接起来；
        - 使用了static ，final 修饰的成员变量被称为常量
        - 作用：用来记住系统的配置信息如（项目名称）
        - 不会影响性能，常量在编译时会被宏替换，变成真正的字面量；
    - 单例类（设计模式）（架构师）
      - 设计模式：指的是解决某个问题的最优模式
      - 设计模式有23种
        - 先学习解决了什么问题
        - 再学怎么写
      - 单例设计模式（避免浪费内存）
        - 确保某个类只能创建一个对象
        - 对外只能创建一个对象
        - 饿汉式单例（拿对象时，对象早已经被创立）（第一次创建对象很快）
          - 写法
            - 把类的构造器私有
            - 定义一个静态变量
            - 定义一个类方法，返回对象
            - 防止弄丢：用final修饰；或者私有静态变量
        - 懒汉式单例（用对象时对象才被创立）（第一次拿对象的速度很慢）
          - 写法
            - 定义一个静态变量
            - 私有构造器
            - 提供一个静态方法，保证返回的是同一个对象
    - 枚举类
      - 认识枚举类
        - 写法：修饰符enum枚举类名{名称1，名称2……其它成员……}
          - 第一行只能写枚举对象的名称
          - 名称本质是常量
        - 枚举类都是最终类，不能被继承，枚举类都继承了一个父类
        - 枚举类的构造器都是私有的，枚举类已是一个单例类
        - 枚举类里面自带的方法value
      - 枚举类的常见应用场景
        - 适合做信息的分类和标志（类似移动命令）
        - 通知底层到底该做什么
    - 抽象类
      - 认识抽象类
        - 用abstract修饰的类or方法
          - 抽象方法
            - 抽象方法：没有方法体只有方法签名，没有那个{}
          - 抽象类
            - 修饰符 abstract class类名{   修饰符  abstract 返回值类型 方法名称（形参列表没有{}了）}
        - 注意事项
          - 抽象类不一定有抽象方法，有抽象方法一定有抽象方法
            - 一个类继承为抽象类，如果不重写有方法，就只能成为一个抽象类
          - 抽象类不能创建对象，仅能作为一种特殊的父类，让子类继承
            - 创建了也调不了抽象方法
      - 抽象类的好处
        - 主要是用作父类(用来在继承里方便重写)
        - 设计抽象类就是为了更好的支持多态
        - 理解抽象的含义（比如抽象函数）
        - 代码会变简洁（没有了方法体）
      - 抽象类的好处
        - 主要是用作父类(用来在继承里方便重写)
        - 设计抽象类就是为了更好的支持多态
        - 理解抽象的含义（比如抽象函数）
        - 代码会变简洁（没有了方法体）
      - 模版方法设计模式
        - 建议用final修饰模版方法）（防止模版方法被重写）
        - 提供了某类方法作为完成某类功能的模版，模版方法封装了每个实现步骤，但允许子类提供特定步骤的实现（类似作文模版·）
        - 提升代码复用性，简化子类设计
        - 给了不变的模版，提供需要更改的位置，只对它修改（建立抽象类，再重写）
    - 接口（类）
      - 接口概述
        - 接口不能创建对象（接口是用类实现(implements)的
          - 接口的作用之一就是提供一种规范，让实现类去具体实现，然后通过接口类型来引用这些实现类的对象，从而实现代码的解耦和灵活性。

总结：

接口不能直接实例化（不能 new Driver()）
但可以用接口类型引用实现了该接口的类的对象
        - java提供了关键字interface定义出接口
        - public  interface 接口名{  成员变量；成员方法}
        - JDK8之前接口里只能定义常量（常量一定要初始化值；大写横杠）和抽象方法（接口里的抽象方法可以省略public 和 abstract）
      - 实现
        - class 类名 implement 接口A，接口B{}
        - 接口可以多实现
        - 实现类实现多个接口，必须重写全部接口的抽象方法，否则这个类也必须变成抽象类
        - 实现类可以创建对象了
      - 接口好处
        - 弥补了类单继承的不足，一个类同时可以实现多个接口，使类的角色更多，功能更强大
          - 可以继承一个的类(爸爸)加多个实现接口(干爹)，让一个类有多个角色功能（多态的体现）
        - 让程序可以面向接口编程，只有程序员就可以灵活方便的切换各种业务实现（实现解耦合）
          - 解耦合拼接业务
      - 新增方法
        - 静态（类）方法
          - 调用要用类名来.点来调用
        - 私有方法
          - 要被调用的话应该用接口里别的实例方法来调private修饰
        - 实例（普通）方法
          - 要用default修饰
            - defult  void test1（）{}
      - 接口的注意事项
        - 接口与接口可以多继承，一个接口可以继承多个接口
        - 如果继承的接口中方法签名（int string）发生冲突，则不支持多继承
        - 继承的同名方法优先用父类的方法
          - 要用接口的方法用 接口名.super.方法名来调（中转）
        - 一个类实现多个接口，如果多个接口中存在同名默认方法，可以不报错，你要重写；
      - 抽象类和接口的区别
        - 相同点
          - 都是抽象形式，都可以有抽象方法，都不能创建对象；抽象类可以被子类继承，接口被实现；一个类继承抽象类，或者实现接口，都必须重写完他们的抽象方法，否则自己就要成为抽象类或者报错；都能解耦合支持多态
        - 不同点
          - 抽象类可以定义全部普通成员，接口只能定义常量，抽象方法
          - 抽象类只能被单继承，接口可以被类多实现
          - 类继承抽象类就不能再继承别的类，一个类实现接口还可以继承其它类或者实现别的接口
          - 抽象方法体现模板思想
          - 接口更适合做功能解耦合
    - 代码块
      - 代码块是类的五大成分之一(成员变量，构造器，方法，代码块，内部类)
      - 静态的东西只会加载一份
      - 静态代码块：static{}
        - 特点：类加载时自动执行，由于类只加载一次，所有静态代码块也只会执行一次（优先执行）
        - 作用：完成类的初始化，eg：对静态变量的初始化赋值，对数据初始化便利，避免在重复执行·时被初始化多次
      - 实例代码块：{}
        - 每次创建对象时，执行实例代码块，并在构造器前执行
        - 作用：和构造器一样，都是用来完成对象的初始化；可以初始化对象的实例资源
    - 内部类
      - 成员内部类
        - 如果一个类定义在另一个类的内部，这个类就叫做内部类
          - 某个事物没必要单独设计时使用
        - 格式：public class A{public class B}；
          - 无static修饰的内部类，只能在外部类的实例化对象中调用
        - 创建形式
          - 先外部类的实例化对象，再实例化内部类的对象
        - 访问其他成员的特点
          - 成员内部类，可以直接访问外部类的静态成员，和实例成员
          - 成员内部类的实例方法中，可以直接拿到当寄生的外部类对象，（外部类名.this.）
      - 静态内部类
        - 有static修饰的内部类，属于外部类自己持有
        - 静态内部类无法调用外部类的实例变量
          - 这和new对象的方式有关
          - 创建对象：new 外部类名.内部类名（）
      - 局部内部类
        - 方法里定义类
        - 作用：体现类的特点，没啥用
      - 匿名内部类（很重要！！！！）
        - 认识
          - 是一种特殊的局部内部类
          - 所谓匿名：指的是程序员不需要为这个类声明名字，默认有个隐藏的名字
          - new 类或者接口（）{    类体（方法重写）}
          - 特点：匿名内部类本是一个子类，同时会立即创建一个子类对象（既是一个子类，也是一个子类对象，不用额外的构造一个子类对象）
          - 作用：用于更方便创建一个子类对象（他的使用本身会自己创建一个类，类名叫测试名+$+数次）
        - 常见使用形式
          - 通常作为一个（对象参数）传输给方法
        - 应用场景
          - （登录键回应）调用别人提供的方法实现需求时，这个方法正好可以让我们传输一个匿名内部类对象给其使用
          - 使用comparator接口的匿名内部类实现对数组的排序
            - Arrays.sort(students,new Comparator<Student>()
        {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()-o2.getAge();
            }
        });返回正整数则左边大于右边，返回负数则返回负数
      - 函数式编程
        - 此“函数”类似于数学中的函数，只要输入的数据一致返回的结果也是一致的
        - Lambda
          - 认识lambda
            - 用于替代某些（只能替代函数式接口的匿名内部类）匿名内部类对象，从而让程序更简洁，可读性更好
              - 函数式接口（用@funcationlinterface注解来确保接口只有一个）
                - 有且只有一个抽象方法的接口
            - 形式：（被重写方法的形参列表）->{被重写方法的方法体代码}
          - 实际实例
            - 用lambda简化comparator接口的匿名内部类
        - 方法应用（简化lambda）
          - 静态方法的引用
            - 类名：：静态方法
      - 常用API（一些已经有的方法）
        - String
          - 代表字符串
          - 支持创建对象封装字符串数据，并提供方法对字符串处理
          - 创建封装字符串
            - //方式1
        String str1 = "abc";
        System.out.println(str1.length());
        //方式2，构造器
        String str2 = new String();
        System.out.println(str2);
        //方式3，构造器
        String str3 = new String("hello");
        System.out.println(str3);
        //方式4，字符数组构造器
        char[] chars = {'a','b','c'};
        String str4 = new String(chars);
        System.out.println(str4);
        //方式5，字节数组构造器
        byte[] bytes = {97,98,99};
        String str5 = new String(bytes);
        System.out.println(str5);
            - 只要是双引号“ ”方式写出的字符串对象，会储存到字符串常量池，且相同内容的字符串只存储一份（节约内存），通过new方式创建字符串对象，每new一次都会产生一个新的对象放在堆内存里
            - 字符串比较不要用==号，==号默认比较地址( 用String提供的equals方法（A.equals（B）)
        - Arraylist（集合容器）
          - 集合是一种容器·，用来装数据，类似于数组容器
            - 和数组类似，但数组会固定长度，每次加减都要更改长度，比较麻烦，这时候可以用集合（数组不适合做这种容量可变的存储）
          - 学什么
            - 1.创建Arraylist对象，代表一个集合容器
              - 要导ArrayList包
              - public class ArrayList<T> {
}
                - T是泛型可以规定存储类型(强制规定类型)
            - 2.调用Arraylist的方法来对数据增删改查
              - 关于 Object 类型的补充说明
为什么需要 Object？
统一类型处理：当需要处理多种类型对象时，Object作为"万能类型"可以接收任何对象
泛型的下限：ArrayList<Object> 可以存储任意类型（但不推荐，会丢失类型安全）
反射支持：通过 getClass() 获取运行时类型信息
              - ArrayList<Integer> list = new ArrayList<>();
                - 这里T是只能存int类型
              - list.add（A）添加元素
              - list.remove（下标）删除某个为该下标的元素
      - GUI编程（图形用户界面）
        - java提供了两套编程包
          - AWT（依赖于操作系统）
            - Swing的组件不要J
          - Swing（不依赖于操作系统）
            - //Swing编程
        //创建一个窗口，有一个登录按钮
        // 给我每一步的注解
        JFrame frame = new JFrame("登录窗口");
        //添加桌布, 可以自适应大小
        JPanel panel = new JPanel();
        frame.add(panel);
//关闭窗口
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);

        //登录按钮
       JButton jB=new JButton("登录");
       jB.setBounds(100,100,100,50);
       //加到桌布上上
       panel.add(jB);
       //显示窗口
        frame.setVisible(true);
        - 主讲Swing
          - JFrame：窗口
          - JPanel：用于组织其它组件的容器
          - JButton：按钮组件
          - JTextField：输入框
          - JTable：表格
        - 布局管理器（控制窗口位置）
          - FlowLayout（水平）
          - BorderLayout（东南西北）
          - GridLayout（*2，3）（2行3列排布）
          - BoxLayout（垂直排布）
        - 事件处理
          - 在GUI编程中，事件的处理是通过事件监听器（Event LIstener）来完成的
            - 点击事件监听器（ActionListiener）
            - 按键事件监听器（KeyListener）
          - 注意焦点问题，让窗口做为焦点事件，不同的焦点，会产生不同的功能
          - 事件的三种写法
            - 提供实现类，用于创建事件监听对象
            - 直接使用匿名内部类的对象，代表事件监听器
            - 自由定义窗口，让窗口对象实现事件接口主题
              - 两个类来实现
  - 项目脚本
    - 黑马人事管理系统
      - step.1：建立一个模块做这个项目。
      - step.2：分析项目的业务需求。
        - 提供一个登录和注册用户的界面
        - 提供一个人事信息管理界面：展示全部员工信息，提供一个根据名称查询某个员工信息展示，添加员工信息，删除员工信息，修改员工信息。
        - 分析项目的角色
          - 登录用户：登录名称，密码
          - 员工信息；ID 姓名 性别 年龄 电话 职位 入职时间 薪水 部门信息
        - 分析系统的界面
          - 登录界面类：创建登录界面
          - 信息管理界面类：创建管理界面
        - 结合AI开始开发
          - 生成登录界面
          - 生成一个信息管理界面
  - 集合框架
    - 认识集合
      - 集合是一种容器，用来装数据，类似数组，但集合的大小可变
      - 集合体系结构
        - Collection（单列集合）
          - 自由每个元素包含两个值主题
          - 常用功能
            - 方法	            说明	               示例
add(E e)	       添加单个元素 	list.add("apple")
addAll(Collection c)	添加另一个集合的所有元素	                                list.addAll(anotherList)
              - java
ArrayList<String> list = new ArrayList<>();
list.add("hello");
list.add("world");
System.out.println(list);  // [hello, world]
2. 删除元素
方法	                说明	          示例
remove(Object o)	删除指定元素（返回是否删除成功）	list.remove("world")
remove(int index)	删除指定索引的元素（List 特有）	list.remove(0)
removeAll(Collection c)	删除指定集合中的所有元素	list.removeAll(toBeRemoved)
clear()	清空集合	list.clear()
          - (都是接口)Collection<E>
            - Set<>
              - Set系列集合：（大部分）添加元素是无序的（打出来和添加顺序不一定一样），不重复的（不能存两个一样的数据，只会保留一个），无索引的
              - HashSet<>
                - 无序，不重复，无索引
                - 哈希值
                  - 就是一个int类型的随机数，JAVA中每个对象都有一个哈希值（类似于地址）
                  - JAVA中所有对象都可以调用Object类的hashCode方法，返回该对象的哈希值
                  - 对象哈希值的特点
                    - 同一个对象多次调用hashCode（）方法返回值相同
                    - 不同对象，它们的哈希值大概率不相等，但也有可能相等（发生哈希碰撞）
                      - 因为int的范围为-21亿到+21亿多
                - 底层原理
                  - 哈希表是数组+链表+红黑树组成（也有数组+链表）
                  - 基于哈希表组成
                    - 以数组+链表组成
                      - 先建立一个长度为16的数组（table）
                      - 使用元素的哈希值对数组的长度做运算计算出应存入的位置（存入位置只与计算后结果有关，和存入次序无关，且当该位置不为Null则调用equals方法比较是否相等，相等则不存，不相等则挂在原有数据下面并形成一个类似链表下面（链表也不是无限长，当总数据量超过长度×默认加载因子0.75=12时则扩容原有容量的两倍））
                      - 判断该位置是否为Null，如果是直接存入
                    - 当链表长度超过8，且数组长度扩容后> =64自动将链表转成红黑树
                      - 二叉树
                        - 二叉查找树
                          - 小的存左边，大的存在右边
                          - 当原有数据有序，则会无限往一边放，查询性能变差
                        - 平衡二叉数
                          - 在满足查找二叉树的大小规则下，利用某种算法，让树尽可能矮小以此来提高性能
                          - 红黑树
                            - 就是可以自平衡的二叉树
                            - 利用红黑色，要求每个路径的某一颜色数量一样
                - 元素的去重复操作
                  - new出的两个对象里面的内容一样，但存在hashSet里的位置不一样，因为在计算哈希值时不同的对象有不同的哈希值，new出来的两个对象哈希值不同，因此java不会自动帮我们删去相同内容的对象
                  - 解决方法
                    - 如果希望Set集合认为两个内容一样的对象重复，就必须重写对象的hashCode（）和equals（）方法
              - TreeSet
                - 原理
                  - 基于红黑树实现排序
                    - 对于数值类型默认按数值本身的大小进行升序排序
                    - 对于字符串类型：默认按照字符编号升序排序
                    - 对于自定义类型如（Student对象），TreeSet默认无法直接排序
                      - //方案一：实现Comparable接口，再重写compare方法自己来制定排序规则
        //方案二：用TreeSet集合，自带比较器（comparator）
                        - @Override
    public int compareTo(Student o) {
        return this.age - o.age;
    }
                        - Set<Student> set = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) { return Double.compare(o1.getAge(), o2.getAge());
            }
        });
                - 排序，无序，不重复
              - LinkHashset
                - 有序，不重复，无索引
                - 底层原理
                  - 有序的原因
                    - 他的每个元素都额外多了一个双链表机制记录他的前后元素位置（从首指针开始读）但更浪费内存
                  - 基于哈希表实现
            - LIst<>
              - 特点：有序可重复，有索引
              - List集合支持索引，可以使用与索引有关的方法，也可以继承Collection的功能
              - 独有功能
                - 1. 在指定索引位置添加元素
list.add(0, "人参");  // 在第0位插入
 2. 获取指定索引的元素
String element = list.get(2);  // 获取第3个元素（索引从0开始）

 3. 修改指定索引的元素（返回被替换的旧元素）
String old = list.set(1, "黑枸杞");

 4. 删除指定索引的元素（返回被删除的元素）
String removed = list.remove(0);

 5. 查找元素首次出现的索引
int index = list.indexOf("枸杞");

6. 查找元素最后出现的索引
int lastIndex = list.lastIndexOf("枸杞");
              - 子类
                - ArrayList<>
                  - 底层基于数组存储元素
                    - 根据索引（和数据长度）查数据快
                    - 增删数据效率低
                - LinkList<>
                  - 底层基于链表存储元素
                    - 查数据比较慢，增删数据比较快，比较占内存
                    - 还基于双链表；导致增删改查数据极快
                    - 对开头和结尾元素操作极快
                  - 应用场景
                    - 可以用来设计队列
                      - 叫号功能应用
                    - 可以设计栈
                      - 手枪弹夹
                    - 对首尾操作的功能实现都可以用LinkList实现
        - Map（双列集合）
          - 认识Map
            - 每个元素包含两个值成对代表一个数据
            - Map系列的特点都由键决定特点
            - Map也叫键值对集合
              - 格式
                - key1=value1，key2=value2
                - 所有的键（key）不允许重复，值（value）可以重复，键和值是一一对应的
          - Map集合体系
            - 存在接口Map<K，V>
              - HashMap<K,V>
                - 无序不重复无索引
                  - 原理和HashList差不多
              - LinkedHashMap<K,V>
                - 有序不重复，无索引
                  - 和LinkedHashList相同的原理
              - TreeMap<k,y>
                - 按大小升序排序，不重复，无索引
                  - 原理同list
          - Map集合的常用方法
            - put(key, value)	 添加/更新键值对
get(key)	                 根据键获取值
remove(key)	         删除指定键的键值对
size()	                 获取键值对数量
isEmpty()	         判断是否为空
clear()	                 清空所有元素
containsKey(key)	 判断是否包含指定键
containsValue(value)	判断是否包含指定值
keySet()	                 获取所有键的 Set 集合
values()	      获取所有值的 Collection 集合
entrySet()	   获取所有键值对的 Set 集合
forEach((k,v) -> ...)	Lambda 遍历（Java 8+）
          - Map集合的遍历方式
            - 键找值
              - 先获取map集合全部的键，再通过遍历键来找值
                - for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
            - 键值对
              - 把键值对看成一个整体进行遍历
                - 调用entrySet方法
                  - entrySet()	   获取所有键值对的 Set 集合
            - Lambda方法
              - 源码map.forEach(new BiConsumer<String, Integer>() {
    @Override
    public void accept(String s, Integer integer) {
        System.out.println(s + " : " + integer);
    }
});
              - map.forEach((key, value) -> System.out.println(key + " : " + value));
    - 遍历方式
      - 用于读写操作数据，文件
      - 增强for循环
        - for（集合类型 集合名称：要循环集合）{System .out.println（集合名称）}
      - 迭代器遍历
        - 先导入Iteractor包
        - Iterator <T> E（迭代器名称）= (a)  要遍历的集合.iterator();
        while(E.hasNext()){
            System.out.println(E.next());
        }
          - 迭代器初始位置在集合第一个元素之前
第一次调用 hasNext() 检查是否有第一个元素 → 返回 true
调用 next() 获取第一个元素 "阿德"，指针移动到第一个元素之后
重复步骤2-3，直到所有元素遍历完毕
当 hasNext() 返回 false 时，循环结束
注意： 这段代码使用了原始类型迭代器（没有泛型），在实际开发中推荐使用泛型 Iterator<String> 以获得更好的类型安全性。
      - forEach方法（重要）
        - // 方式1：匿名内部类
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("匿名内部类: " + s);
            }
        });
        
        // 方式2：Lambda 表达式
        list.forEach(s -> System.out.println(s));
        
        // 方式3：方法引用
        list.forEach(System.out::println);
        
        // 方式4：自定义操作
        list.forEach(s -> {
            if (s.length() > 1) {  // 过滤条件
                System.out.println("长度>1: " + s);
            }
        });
    - 遍历方式的区别
      - 认识并发修改异常问题
        - 遍历集合的同时又存在增删集合元素的行为时可能出现业务异常，这种现象被称为并发修改异常问题
          - //没删干净出现并发修改异常
        //本质原因，在删除一个元素后，后一个元素会补上删除的元素，导致索引直接跨过补上的元素，继续判断下一个元素
          - 解决方案：
            - 集合有索引
              - 1.删除数据后索引--（退一步）
              - 2.倒置遍历也可以解决（）已遍历的往前移
            - 集合无索引
              - 3.使用迭代器自带的删除方法
      - 区别
        - 增强for和forEach方法都无法解决并发修改异常问题
        - Iterator迭代器可以使用自带删除方法解决并发修改异常问题
    - Stream流
      - 认识Stream流
        - 本身是一个接口
          - 但他底层封装了一个stream实现类
        - jdk8新增的API，可以用于操作集合和数组的数据
        - 它就像一条流水线，把数据放到流水线上处理
        - 优势：它结合了Lambda（函数式编程）的语法风格来编程，性能高效（多线程处理），代码简洁，可读性好
      - Stream流的使用步骤
        - 准备数据源
          - 获取数据源的stream流
            - 调取stream流的各种方法对数据源做处理
              - 获取结果到一个新的集合中或者直接遍历结果
      - 如何获取数据源的stream数据流
        - 集合的流
          - 单列集合conllection，都是直接调stream方法
            - Collection<String> list = new ArrayList<>();
        Stream<String> s1 = list.stream();
          - 双列Map
            - 把键和值拆成单列set，再利用collection调stream的方法
              - Map<String,String> map = new HashMap<>();
         Stream<String> stream1 = map.keySet().stream();
         Stream<String> stream2 = map.values().stream();
         Stream<Map.Entry<String, String>> stream3 = map.entrySet().stream();
        - 数组的流
          - String[] string = {"a","b","c"};
        Stream<String> stream4 = Arrays.stream(string);
        Stream<String> stream5 = Stream.of("a","b","c");
            - 直接调API
      - Stream流的常用的中间方法
        - 这个方法的返回值也是stream流，可以继续进行链式编程
        - 方法	                功能说明
filter(Predicate)	过滤流中元素，保留满足条件的元素
map(Function)	将流中元素映射转换为新类型
flatMap(Function)	扁平化映射，将每个元素转换为流并合并
distinct()	去除重复元素（基于equals方法）
sorted() / sorted(Comparator)	自然升序排序或自定义排序
limit(long n)	限制流中元素数量为前n个
skip(long n)	跳过前n个元素
peek(Consumer)	调试用，对每个元素执行操作但不修改流
      - 获取处理结果（终结方法）
        - 终结方法是Stream流操作的最后一步，会触发流的处理并产生最终结果。执行后流将不可再用。
        - 常用终结方法列表
方法	功能说明	返回类型
forEach(Consumer)	遍历处理每个元素	void
count()	统计元素数量	long
collect(Collector)	收集结果到集合	集合/对象
reduce(...)	归约为单个值	Optional/T
findFirst()	返回第一个元素	Optional
findAny()	返回任意一个元素	Optional
anyMatch(Predicate)	是否存在匹配元素	boolean
allMatch(Predicate)	是否全部匹配	boolean
noneMatch(Predicate)	是否都不匹配	boolean
        - Optional<E>
          - 来接比较器的返回结果（）避免溢出
        - 收集Stream流
          - 就是把Stream流操作后的结果转回到集合或者数组中
          - s1.collect（collectors.to（要收集的集合类型））
            - 收集Map集合，要调用faction来区别键和值
          - 只能收集一次
            - 要是收集多次，可以在流几次，或者创建之后到进去之前收集的stream流
  - 存储和读写数据的方案
    - 存储数据的方案
      - 变量，数组，对象，集合（）他们都是在我们的内存中，当程序结束后数据就没了，但有些数据要长久保存的这个时候就要学习File方案
      - File
        - file是java.io包下的类，file类的对象，用于代表当前操作系统的文件    File只能对文件本身进行操作，不能对文件里的数据进行操作  fille的对象代表文件和文件夹，并可以调用其提供的方法对象文件进行操作
        - 创建File类的对象
          - 常用API
            - 构造方法	File(String pathname)	根据路径创建 File 对象
路径获取	getName()	获取文件名/目录名
getPath()	获取相对路径
getAbsolutePath()	获取绝对路径
存在性判断	exists()	判断文件/目录是否存在
类型判断	isFile()	是否为文件
isDirectory()	是否为目录
创建操作	createNewFile()	创建新文件
mkdir()	创建单级目录
mkdirs()	创建多级目录
删除操作	delete()	删除文件/空目录
文件列表	list()	返回目录下文件名字符串数组
listFiles()	返回目录下 File 对象数组
文件信息	length()	获取文件大小（字节）
lastModified()	获取最后修改时间
              - delete（）只能删空文件夹
          - File f1=new File（文件的路径）；创建对象可以代表或者创建一个不存在的文件
            - 文件放到工程下，一般都用相对路径，方便别人读文件
          - 用递归来找文件
      - 方法递归
        - 自己调用自己
        - 递归的算法流程和执行流程
          - 就是以前学的递归方法
        - 应用层面
          - 文件搜索功能
            - 分析
              - 需求：从某一个盘里搜索到某一个文件，直到最后找到
              - 方法
                - 先找出盘下所有的一级文件对象
                - 遍历全部的一级文件
                  - 如果是文件，判断是否是自己想要的
                  - 如果是文件夹，需要继续该进入文件夹，重复上述过程
      - 字符集
        - 常见字符集介绍
          - ASCII存储方法
            - 一个字节存储一个字符
            - 字节首位为0可以存储128个字符
          - GBK（汉字编码字符集）
            - 一个汉字编码成两个字节
            - 汉字的第一个字节第一位一定是1
              - 为了和英文的字节区分
              - 比如区分（我a你）可以在编码上区分英文和中文
          - UNicode（统一码）
            - 容纳所有的字符
            - 四个字节一个字符
              - 占用存储空间，通信效率贬低
          - UTF-8（全球统一）
            - 是Unicode的编码方案
            - 汉字占3字节
            - 采用可变长编码方案
              - 分为1.2.3.4字节区，不同文字存在不同字节区
              - 区分如何存在那个字节区
                - 首位不同，即不同的前缀码来区分不同国家语言
                - 扣出有效编码编译
        - 字符集的编码和解码操作
          - String str = "你好";
byte[] n = str.getBytes("GBK");  // 将字符串按GBK编码转换为字节数组
System.out.println(Arrays.toString(n));  // 打印字节数组的内容
            - 调试数组内容：方便查看数组中的每个元素值
打印数组：直接打印数组引用只会得到内存地址，而 Arrays.toString()
          - 可能会报异常，要throw exception
          - 编码
            - byte[] n=str.getBytes("GBk");
          - 解码
            - String name=new String（“GBk”）
      - IO流
        - 认识IO流
          - 数据通过IO流写入磁盘和从磁盘里读出，IO是水流模型
          - I指的是input，称为输入流负责读数据
          - O指的是output，输出流
          - 在使用后要关闭流调close方法，释放它占用的线和CPU
          - A.getBytes（）把A转为字节
          - 字节流
            - 流的是字节
              - 字节输入流（inputstream）
                - 因此有了实现类
                  - FlieInputStream（File file // String pathname）创建字节输入流通道与源文件接通
                    - InputStream inputStream=new FileInputStream("Charmmy/abcdefg.txt");
                  - read（）每次读取一个字节返回给变量记住后再打印再继续读，如果没有数据就会返回-1
                    - 每次读取一个字节性能较差，读取汉字输出一定会乱码
                  - read（byte[] buffer）每次用一个字节数组读取数据，返回字节数组读取了多少个字节，如果发现没有数据返回-1
                    - InputStream inputStream=new FileInputStream("D:\\java\\javawork\\javaseaiproject\\Day10\\src\\Charmmy");
        byte[] bytes=new byte[2];//每次读多少个字节
        int len;
        //定义变量记住每次读了多少个字节可能不是2的倍数 ，他会把上一次的数组从前往后替换还剩下的，余下没替换的也会打出来  可以避免   while((len=inputStream.read(bytes))!=-1){
           String str=new String(bytes,0,len);
            System.out.println(str);}
                    - 弊端
                      - 但依然无法避免读取汉字乱码的情况，存在截断汉字字节的可能性（如每次len=3，当字母与汉字挨在一起被一起读取，则会被编译为乱码）
                        - 解决方法
                          - 定义一个和文件一样大的字节数组来一次性读取完文件的全部字节
                            - 问题：只适合读取小文件，文件过大内存会发生溢出
                          - byte [] bytes1=inputStream.readAllBytes();
        String str1=new String(bytes1,"UTF-8");
        System.out.println(str1)
              - 字节输出流（outputstream）
                - new FileOutputStream（路径）；建立通道但是是覆盖管道，如果不想覆盖原来的数据可在路径末尾加上true new FileOutputStream（路径，ture）
                - File.write（添加覆盖的内容（int））只能传一个字节，说明只能添加一个字节的内容
                  - write()有很多不同的用法
                    - OutputStream outputStream = new FileOutputStream("D:\\java\\javawork\\javaseaiproject\\Day10\\src\\Charmmy");
        outputStream.write("你好".getBytes("UTF-8"));
        outputStream.write('a');
        outputStream.write('b');
        byte [] byte1={'a','b','c'};
        outputStream.write(byte1);
        outputStream.write(byte1,0,2);
              - 文件复制
                - 先建立方法接收要复制的文件以及复制后文件的路径
                - 再new FileinputStream和new FileOutPutStream建立通道
                - 再建立数组存储每次读取的字节一般是1024大小或者readallBytes（最大只能读2G左右的大小）
                - 再建立变量来代表每次读取的长度
                - 写下循环来writeBytes到目标位置
                - 最后close流
                - public static void main(String[] args) throws Exception {
        copyFile("C:/Users/a'a'a/Desktop/个人信息/08244d0325cc7830070383029c308552.jpg", "C:/Users/a'a'a/Desktop/个人信息/new.jpg");
    }
public static void copyFile(String src, String dst) throws Exception {
        InputStream inputStream = new FileInputStream(src);
        OutputStream outputStream = new FileOutputStream(dst);
        byte[] bytes = new byte[1024];
        int len;
        while ((len = inputStream.read(bytes)) != -1) {
            outputStream.write(bytes, 0, len);
        }
       System.out.println("复制完成");
        outputStream.close();
        inputStream.close();
              - 资源释放的问题
                - 面临问题：直接close不专业
                  - 当流已经链接但close上面得程序出bug导致程序结束没法运行到cloae，则会导致流无法被关闭
                - 解决方法：（try-catch-finally方案）
                  - 导入了finally方法，它会不论程序·有没有跑成功或者有没有return都先跑一遍finally方法，因此他是程序执行后进行资源释放的专业级做法
                    - 也可以简化，直接在try后面接一个（）里面写管道资源，再{}再catch就行了，不用写finally（）减化了代码，他会自己关闭，执行完后自己调自己的close方法
                      - public static void copyFile(String src, String dst) throws Exception {
    try (FileInputStream inputStream = new FileInputStream(src);
         FileOutputStream outputStream = new FileOutputStream(dst)) {
        byte[] bytes = new byte[1024];
        int len;
        while ((len = inputStream.read(bytes)) != -1) {
            outputStream.write(bytes, 0, len);
        }
        System.out.println("复制完成");
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}
}
                  - 资源是实现了Closeable接口的类
                    - 资源都要关闭
          - 字符流
            - 自由适合读文本文件
            - 流的是字符
              - 字符输入流（Reader）
                - 读取中文性能较好
                - FileReader（路径）把磁盘文件以字符的形式读，不是字节形式
                - 还是可以用{int}read（char[] buffer）来存储每次读取多少个字符
                  - 用桶读可以减少内存和磁盘的交互，可以更高效读取（内存和磁盘的速度不一样，内存快很多）避免被拖累
                - try (FileReader fr = new FileReader("D:\\java\\javawork\\javaseaiproject\\Day10\\src\\Charmmy"))
     {
        char[] chars=new char[1024];
        int len;
        while ((len=fr.read(chars))!=-1){
        System.out.println(new String(chars,0,len));
        }
     } catch (IOException ex) {
         throw new RuntimeException(ex);
     }
              - 这2个类都是抽象类
              - 字符输出流（Writer）
                - 写内容更方便
                  - public static void main(String[] args) throws Exception {
        try (FileWriter fw = new FileWriter("D:\\java\\javawork\\javaseaiproject\\Day10\\src\\Charmmy",true)) {
            fw.write("你好");
            fw.write("\n");
            char[] chars = {'b','c','d'};
            fw.write(chars,0,2);
            fw.write(65);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
                - FileWriter（path，boolean）写字符往文件里面
                - 字符输出流之后必须刷新流或者关闭流，才能生效（这样可以避免写一个调一次磁盘进行耦合，导致性能降低）因此他会写在内存缓冲区，等到满了之后一次性写入磁盘，来提高性能
                  - a.flush（）刷新的API
                  - 刷新其实就是让数据全部写出去
                  - close其实就包含刷新
          - 缓冲流
            - 用来提高字符流的性能
              - 理解为一个8kB的桶
            - 缓冲字节流
              - （可以提高字节输入/出流的性能）（多了8kb）的缓冲池，先输入到内存的缓冲池里再在内存中读取缓冲池，再把内存给缓冲池再输出给磁盘，（thus 内存里的读取速度远远高于磁盘）
              - 缓冲字节输入流
                - IntPutStream A=new BufferedInputStream(new FileInputStream(路径))
                  - 其实就是包装一下
              - 缓冲字节输出流
                - OutPutStream A=new BufferedOutputStream(new FileOutputStream(路径))
                  - 也是包装一下低级的输出流
            - 缓冲字符流
              - 缓冲字符输入流
                - BufferedReader（）
                - readLine（）
                  - 按行读file.readerLine()直接读取一行内容
                    - 可以在某些按行读的数据中可以用，按桶读容易发生截断
                  - String line;
            while ((line=br.readLine())!=null){
                System.out.println(line);
            }（目前读取文本最优雅的方案）
              - 缓冲字符输出流
                - Bufferedwriter（）
                  - try (BufferedWriter bW = new BufferedWriter(new FileWriter("D:\\java\\javawork\\javaseaiproject\\Day10\\src\\Charmmy.txt",true));
         ) {
            bW.write("你好");
            bW.newLine();//换行
            bW.write("你好");
            bW.newLine();//换行
    }catch (IOException ex){
         throw new RuntimeException(ex);}
    }
                  - file.newLine（）//换行
          - 原始流，缓冲流的性能分析（重点）
            - 桶加大低级管道性能也会好
            - 高级管道桶变小可能性能比低级管道差一点
            - 一般桶变大管道的性能都会增强
            - 一般用缓冲流加数组桶的形式来做
          - 其他的流
            - 字符输入转换流
              - InputStreamReader
                - 当代码是UTF-8而文件是GBK则会在读取的时候会乱码
                - 字符输入转换流了可以解决这个问题
                - 思路：先提取文件的原始字节流，再将其按正式的字符集编码转成字符输入流，这样就不乱吗了
            - 打印流
              - PrintWriter和PrintStream（OutputStream/File/String）构造器
                - PrintWriter用来写字符
                - PrintStream写字节
              - 可以更方便更高效的打印数据到文件和网络中
              - 他写啥就是啥，不会转成二进制编码被转码成别的字符
              - ry(PrintStream pS=new PrintStream("D:\\java\\javawork\\javaseaiproject\\Day10\\src\\Charmmy")){
            pS.println("你好");
        }catch (Exception e){
            e.printStackTrace();
        }
              - 追加
                - 一般在路径后面加true
                - 高级管道不能追加true，所有一般在高级管道后面包一个低级管道，再加true
            - 特殊数据流
              - 在通信上频繁使用
                - DataInputStream
                  - 接收数据
                  - 当DataOutputStream怎么发他就怎么收
                - DataOutputStream
                  - 允许把数据和类型一并写出去
                  - 功能有
                    - WriterInt/WriterDouble/WriterUTF（中文字符）
                - 也是高级流也要包装一个低级流进去
          - IO框架
            - 什么是框架
              - 就是一个预先写好的代码库，只为简化和加速开发速度
              - IO框架就是如此
              - 全称叫=commons-io-......
  - Java网络编程
    - 可以让设备中的程序与网络上其它设备中的程序进行数据交互技术
    - 基本通信架构
      - CS架构
        - 服务端
          - Java功能来实现
        - 客户端
          - APP
      - BS架构
        - 浏览器
        - 服务端
          - Java来实现
      - 无论CS，BS架构的软件都需要依赖网络编程
        - Java.net.*包提供了网络编程解决方案
    - 网络编程三要素
      - IP
        - 互联网协议地址
          - 分为IPV4和IPV6两种形式
            - IPV4：使用32位二进制记录，转成点分十进制表示
            - IPV6：使用128位二进制地址，采用冒分十六进制（每四个转成十六进制再用冒分号分隔）
        - 一般采用域名通过DNS域名解析器来映射真正的IP
        - 公网ip和内网ip
          - 内网IP的出现是为了节省IP提高效率直接用自己的转换机
          - 本机IP：127..0.0.1：找到本机
            - ipconfig:查看本机IP地址
            - ping IP地址：检查网络是否与该IP用户联通
        - InetAddressz类:代表IP地址
          - //认识InetAdress
        try {
            //获取本地主机的InetAddress
            InetAddress inetAddress = InetAddress.getLocalHost();
            System.out.println(inetAddress.getHostName());
            System.out.println(inetAddress.getHostAddress());
            //获取指定主机的InetAddress
            inetAddress = InetAddress.getByName("www.bilili.com");
            System.out.println(inetAddress.getHostName());
            System.out.println(inetAddress.getHostAddress());
            //判断本机能不能和某一个机器互通
            boolean reachable = inetAddress.isReachable(5000);
            System.out.println(reachable);

        } catch (Exception e) {
            e.printStackTrace();
        }
        - 设备在网络中的地址是设备在网络的唯一标识
          - 通过IP可以找到机器
      - 端口
        - 找到机器里的某一软件
          - 用来标记计算机设备上运行的应用程序，是一个16位2进制.
        - 端口分类
          - 周知端口
            - 被知名网站占用
          - 注册端口
            - 分配给用户进程或某一些应用程序
          - 动态端口
            - 一般不固定分配某种进程，而是动态分配
        - 应用程序在设备中的唯一标识
      - 协议
        - 连接和数据在网络中传输的规则
        - 通信协议
          - 事先规定的连接规则，以及传输数据的规则
  - 多线程
    - 什么是线程
      - 线程是一个程序内部的一条执行流程
    - 多线程
      - 指的是从软硬件上实现的多条执行流程的技术（多线程由CPU负责调度执行）
        - 例如12306后台买票（高并发），信息的接和发
    - 如何在程序中创建线程
      - 1.继承Thread类（Thread类代表线程）定义一个线程类的子类（然后再重写run方法）
        - 注意事项
          - 只有调用Start方法才是启动一个新线程
          - 直接调用RUN方法会当成普通方法执行，此时相当于单线程
        - 缺点
          - 线程类已经继承Thread，无法继承其他类，不利于功能的拓展（受制于只能继承一个类）
        - 优点
          - 编码简单
        - 然后再分配和启动线程对象
          - public class Teat {
    public static void main(String[] args) {
        Thread demo=new Demo();
        demo.start();
    }
}
class Demo extends Thread{
    @Override
    public void run() {
        //线程体，线程要执行的任务
        for(int i=0;i<10;i++){
            System.out.print("子线程"+i);
          - start（）方法来启动线程
          - main方法本身是由一条主线程在跑
          - 所有现在是多线程（每个线程先后顺序是不一定的）
      - 2.实现Runnable接口的类，然后重写run方法，然后可以分配类的实例，在创建Thread时作为参数传递，然后启动
        - 优点
          - 任务类只是实现接口，可以继续继承其他类，实现其它接口，扩展性强。
          - 缺点
            - 需要多个Runable对象
        - //创建线程对象
        //把线程任务类对象作为参数传递给线程对象的构造方法，才可以启动线程
        Thread thread = new Thread(new MyRunnable());
        //启动线程
        thread.start()}
//创建线程任务类
class MyRunnable implements Runnable{
    @Override
    public void run() {
        //线程1在运行
        System.out.println("线程1在运行");
        - 简化写法
          - 直接使用runable的匿名内部类建立
            - Thread thread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        //线程1在运行
                        System.out.println("线程1在运行");
                    }
                });
        //启动线程
        thread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("主线程在运行"+i);
        }
      - 3.实现Callable接口
        - 前两种创建方式存在问题
          - 假如线程执行完成后需要返回结果，他们重写的Run方法不能直接返回结果
        - callable接口和FutureTask类来实现
          - 1.建立任务对象
            - 定义一个类实现Callable接口，重写call方法，封装要做的事情，和要返回的数据
            - 把Callable类型的对象封装成FutureTask（线程任务对象）FuturnTask它本身是一个线程任务对象，他可以交给线程启动
          - 2.把FutureTask线程任务交给Thread对象
          - 3.调用Thread对象的Start方法启动线程
          - 4.线程执行完毕之后，通过FutureTask对象那个的get方法去获取线程任务执行的结果
          - 在get的时候，如果发现第一个线程没有执行完毕，他会调出CPU，等第一个线程跑完才会get（它不会影响别的线程跑）
      - 线程的常用方法
        - run（）线程任务方法
        - start（）启动线程
        - getName（）获取线程的名称，线程名称默认是Thread-索引
        - setName（）为线程创建名字
        - 设置名字一般在线程启动之前
        - Thread m=thread.currentYhread（）获取当前执行的线程对象（那个线程调它，他就定位到那个线程然后再接m.getname）
        - sleep（long ti让当前执行的线程休眠多少毫秒，再继续执行me）
        - 直接调Thread构造器为它设置名字
        - thread.join（）让thread线程先插队执行完毕再执行其它线程
    - 线程安全问题
      - 多个线程，同时操作同一个共享资源的时候，可能会出现业务安全问题
        - eg：当两人在同一银行账户上同取100万，在线程同时执行的时候，账户可能被修改为余额：-100万，发生安全问题
      - 模拟线程安全问题
        - 需求：小明小红是一对夫妻，他们有一个共同账户，余额为100万元，用程序模拟两人同时取100万元
          - 分析
            - 1.设计一个账户类，建立一个账户对象，代表2人的共享账户
            - 2.设计一个线程类，创建并启动两个线程，在线程的run方法中调用账户的取钱方法
    - 认识线程同步
      - 1.让多个线程先后依次访问共享资源，这样就可以避免线程安全问题
    - 线程同步的常见方案
      - 加锁
        - 每次只允许一个线程加锁，加锁后才能进入访问，访问完自动解锁，然后其它线程才能进来加锁
          - 同步代码块
            - 作用：把访问共享资源的核心代码给上锁，以此保证线程安全
            - synchronized（同步锁（必须是唯一的，不能可以出现两个的对象））{访问共享资源核心代码}
              - 弊端：锁的范围太大
              - 用账户来做对象
              - 静态方法用类名.class作为锁对象
            - 原理：每次只允许一个线程加锁后进入，执行完毕后自动解锁，其它线程才可以执行
            - 注意事项：对于当前同时执行的线程来说，同步锁必须是同一把（同一个对象），否则会出bug
          - 同步方法
            - 把共享资源的核心方法上锁
              - 同步方法其实底层也是隐式锁默认帮我上了锁
              - 原理：每次只允许一个线程加锁后进入，执行完毕后自动解锁，其它线程才可以执行
              - 但是同步方法锁了方法，范围太大，可能执行不高效，要先run方法，才能执行到线程，有一点慢
          - lock锁
            - 它可以创建出锁对象进行加锁和解锁，更灵活方便强大
            - Lock是一个接口不能直接实例化，可以用ReentrantLock（）即实现类
            - 先new ReentrantLock（）对象，再调用lock（）上锁和unlock（）解锁记得要放到finally里，确保一定会解锁
    - 线程池
      - 什么是线程池
        - 就是可以复用线程的技术
        - 避免创建太多线程，程序噶
      - 工作原理
        - 每个任务交给线程处理，要是任务太多则他们排队等待线程来处理
        - 具体来讲分为工作线程WorkThread，和任务队列（WorkQueue）任务队列只能放Runable，和Callable任务
      - 如何创建线程池
        - 方法一
          - 线程池接口：ExecutorService（它代表线程池）
          - 实现类：ThreadPoolExecutor（线程池实现类）
            - 里面需要配置7个参数
              - ThreadPoolExecutor executor = new ThreadPoolExecutor(
    int corePoolSize,              // 参数1: 核心线程数
    int maximumPoolSize,     // 参数2: 最大线程数
    long keepAliveTime,         // 参数3: 空闲线程存活时间
    TimeUnit unit,                   // 参数4: 时间单位
    BlockingQueue<Runnable> workQueue,             // 参数5: 任务队列
    ThreadFactory threadFactory,  // 参数6: 线程工厂
    RejectedExecutionHandler handler                      // 参数7: 拒绝策略
);
          - 接Runable任务
            - API
              - pool（线程池名）.execute（new 实现Runable的类）把任务分配给线程
              - pool（线程池）.shutdown（）关闭线程（已经在执行的线程执行完）
              - pool（线程池）.shutdownNow（）关闭线程（已经在执行的线程会被直接关闭）
          - 接Callable任务
            - pool.sumbit（Callable对象）启动线程
            - 再把它给到Future<> 任务对象，再调用future.get（）得到结果
      - 临时线程的创建时机
        - 当线程都在运行，且线程队列容量已经被排满了，这个时候就会自动创建临时线程
        - 当线程大于线程池的上限，就会发生任务拒绝策略
      - 线程拒绝策略
        - AbortPolicy	抛RejectedExecutionException	默认，快速抛出异常失败
        - CallerRunsPolicy	由调用者线程执行任务	重要任务，不能丢弃
        - DiscardPolicy	静默丢弃任务	非重要任务不报错
        - DiscardOldestPolicy	丢弃队列中最老的任务，执行新任务	最新任务优先
      - 通过Executors创建线程池
        - 是一个线程池的工具类，提供了很多静态方法用于返回不同特点的线程池对象
        - Executors提供的创建线程池的api
          - 固定大小池	newFixedThreadPool()	创建固定数量线程的线程池
          - 单线程池	newSingleThreadExecutor()	创建只有一个线程的线程池
          - 缓存池	newCachedThreadPool()	创建可缓存的线程池
          - 定时任务池	newScheduledThreadPool()	创建支持定时任务的线程池
          - 工作窃取池	newWorkStealingPool()	创建工作窃取线程池（Java 8+）
          - 线程工厂	defaultThreadFactory()	获取默认线程工厂
  - 泛型
    - 认识
      - 定义类，接口，方法时，同时声明了一个或者多个类型变量（如：<E>）
        - 这样称为泛型类，泛型接口，泛型方法，他们统称为1泛型
          - 有尖括号<E>
      - 作用
        - 泛型提供了在编译阶段约束所能操作的数据类型，并自动进行检查的能力，这样可以避免强制类型转换，及其可能出现的异常
        - 在集合中广泛使用
    - 自定义泛型
      - 定义泛型类
        - 自己设计一个泛型类
          - 就是用ArrayList换个名字套壳
        - 修饰符 class 类名<类型变量，类型变量......>{}
          - 变量名用大写字母
      - 泛型接口
        - 修饰符 interface 接口名<类型变量，类型变量>{  }
        - 和定义泛型类差不多
      - 泛型方法，通配符，上下限
        - 泛型方法
          - 修饰符<类型变量>方法名{}
          - public static void <T> test（也可以用T，不用强转）{    return T;}
        - 通配符“？“
          - 可以在使用泛型的时候代表一切类型；ETKV是在定义泛型的时候使用
          - 但？代表一切会有范围问题，到底代表什么？（这个时候就引入了上下限）
        - 上下限
          - 用来规范通配符
          - ？ extends A（A是一个父类）？的上限是car类型
      - 泛型支持的类型
        - 泛型不支持基本数据类型，只能支持对象类型（引用数据类型）
          - 不支持<int><double>这些基本数据类型
        - 原因：泛型工作在编译阶段，等编译后泛型就会被擦除，所有类型会恢复成object类型，又因为object只能接对象数据类型，如果支持基本数据类型的话，object接不了，所有不能用
        - 但要接的话，可以把基本数据类型包装成对象就行了 基本数据类型的包装类就是把首字母大写，int 是Integer char是Charater
        - 支持包装类
          - 如何包装
            - 手动包装
              - 将100对象为L
              - Integer L=Integer.valueOf（100）
            - 自动包装
              - Integer L=100；（自动装箱）地址和手动一样
            - 自动拆箱
              - 把包装类型的数据转成基本数据类型
          - 包装类具备的其它功能
            - 可以把基本数据类型变为字符串类型
              - String a=（Integer）X.toString（）
            - 可以把字符串类型转换成数值本身对应的真实值
              - int X=Integer.valueof（str）
              - 调用valueof（）方法可以把String类型转换为数字基本类型
          - Object只能接对象
            - 因此要用包装类把基本数据类型包装为对象
  - 异常（不是人为水平的问题）
    - (代表程序出现的异常)
    - 异常的体系
      - java.lang.Throwable
        - error（系统本身的异常）
        - exceptiopn
          - RuntimeException（运行时异常（程序会死亡））（编译阶段不报错，但run的时候会报错）
          - 编译时异常（如日期解析异常）（起提醒作用）
          - 其它异常
    - 编译异常的基本处理主题
      - 抛出异常（throws）
        - 在方法上使用throws关键字，可以将方法内部出现的异常抛出去给调用者处理（相当于都不管这个异常）
        - 方法 throws 异常1，异常2......（）
      - 捕获异常
        - 直接捕获程序出现的异常
        - try{//监视可能出现异常的代码}catch（异常类型1 变量）{//处理异常}catch（异常类型2 变量 ）{//处理异常//打印异常：变量.printStrackTrace（告诉程序员异常在哪里）}......}throws Exception 再捕获，可以捕获所有异常
        - e.printStackTrace(); 只是打印异常信息的代码，它会捕获并显示"无法向目录写入"的错误
    - 异常的作用
      - 用来定位程序BUG的关键信息
      - 可以作为方法内部的一种特殊的返回值，以便通知上层调用者，方法的执行问题（通知别人方法的执行问题）
    - 自定义异常（表示具体的异常问题）
      - 自定义运行时异常
        - 尽量定义运行时异常，编译式太麻烦了
        - 继承runtimeexception，重写构造器
      - 自定义编译时异常
        - 定义一个异常类Exception 重写Exception的构造器 通过throws new 异常类建立对象并抛出，这样catch的异常就有官方的名字，可以定位bug
    - 异常的处理方案
      - 1.底层异常层层往上抛出，最外层捕获异常，记录下异常信息，并响应适合用户观看的信息进行提示
      - 最外层捕获异常后尝试重新修复
      - 不停地提醒异常，重新修复，提高健壮性
  - 增强循环
    - 代码： for(Student student:students){
作用： 这是一个增强型for循环（也称为for-each循环），用于遍历students数组中的每个元素。
详细解释：

语法结构：for(元素类型 变量名 : 数组或集合) { 循环体 }
Student student：声明一个临时变量student，类型为Student，用于存储每次循环中从数组取出的元素
students：要遍历的数组，这里是students数组
执行过程：

第一次循环：student变量指向students[0]（即"刘宇"的Student对象）
第二次循环：student变量指向students[1]（即"张三"的Student对象）
以此类推，直到遍历完数组中的所有元素
与传统for循环的对比：

传统for循环：for(int i=0; i<students.length; i++) { Student student = students[i]; ... }
增强型for循环：代码更简洁，无需手动管理索引，减少出错的可能性
  - A.equal（B）：表示A和B相等的话……；！A.equal（B）表示A和B不相等的情况
  - 有static修饰的变量叫静态变量，没有的叫实例变量
  - 面向对象编程
    - what is对象？{对象是一种特殊的数据结构，可以用来记住一个事物的数据，从而代替该事物}（有点类似结构体） |万物皆对象|
      - 对象到底是个啥：本质性上是一个特殊的数据结构（一个在堆内存里的开辟的内存区域），类似于一张空白的已经打印好格式的表格
    - 先设计对象的模版，也就是对象的设计图：叫类（新建一个包下的类，在里面定义一个面向对象的类，在另一个类里使用）（类也是对象的模版）
    - 通过new关键字，每new一个类就产生一个新对象（类名 变量名=new 类名）
  - 数组
    - 数据类型[ ] 数组名={元素1，元素2……}int[ ] arr={}       String[ ] arr{}      char arr[ ]也行
    - 数组长度可以表示为arr.length，不用具体算出来
    - 可以根据索引打出对应元素eg：System.out.println（arr[12]=10）
    - 和c语言差不多数，组名也是一种地址
    - 动态数组实现
      - 没赋值的数组里默认为0.0
      - 数据类型[ ] 数组名=new 数据类型[长度]    默认值浮点型0.0 boolean false 整型 0 String null
    - 二维数组
      - 一维数组只有行概念，二维数组有行列概念
      - 数据类型[ ] [ ]  数组名={{},{},{}};
      - 动态初始化：int[ ] [ ] arr=new int[n ] [m ];
      - arr.length会只访问行数       arr[2].length访问第二行列数
  - 数据类型
    - 基本数据类型
      > 四类八种
      > double>float>long>int>short>byte
      > 浮点数之所以比long之类的整数大的原因是因为浮点数采用了科学计数法1.XXXXXX*2^n来表示n有11位来确定所以比全用来表示数字的整形大很多；
      - 整数
        - byte 1字节
        - short 2字节
        - int 4字节
        - long 8字节
          > long类型的定义结果后面要加一个L，要不然会报错
      - 小数
        > 10是整数
        > 10.0是小数类型
        - float 4字节
          > float类型定义结尾也要加一个F
        - doouble 8字节
      - 字符
        - char 2字节
      - 布尔“boolean”
        - boolean 1字节
    - 引用数据类型
  - 运算符
    - 算数运算符
      - + - * /
        > 计算机中小数的计算有可能会不精确，这与小数的存储方法有关（科学计数法）
        > 同类型运算得到同类型important
      - %（取余）
        > 可以用来玩拆数游戏
      - 数字计算
        > 类型不一样不能进行运算
        - 隐式转换（小的转为大的double float long int short byte ）
          - ***byte short char在做运算是都会隐形转换成int，就算是两个byte相加结果也是int类型，eg byte+byte=int
          - byte+double=double
        - 强制转换（由大到小有可能导致精度丢失(发生溢出)）
          - int a，byteB=（byte）a
          - byte a；byte b；byte c=（byte）（a+b）；
      - 字符运算（ASCLL码表）
        - A65a97差32
      - 字符串运算
        - 字符串运算只有+的操作
        - 任意数据+字符串都是拼接的结果（从左到右拼接）
          - eg：123+“aaa”=“123aaa”
          - 10+8+”aaa“=“18aaa”（10+8没有字符串参与所以等于18+“aaa”）
          - 15+“aaa”+1+2=“15aaa12”
    - 自增自减运算符
      - ++和--
        - a++，++a，a---，--a有不同的区别
          - a++是a先利用再加1
          - ++a是a+1后再利用
    - 赋值运算符
      - =
      - -=
      - +=
      - *=
      - /=
      - %=
    - 关系运算符
      - >=,<=
      - ==
      - ！=
      - > <
    - 逻辑关系
      - & | ！^（（异或）相同为false不同为true）             单&与&&的区别：&&为短路判断当左边有一个为false就不再继续执行   ||也为短路判断当左端为true就不再向右端执行了
    - 三元运算符
      - A？B：C（表示：若A成立则取B若A不成立则取C）
  - 键盘录入
    - Scanner
      > 在java.util里
      - （导包）Scanner sc=new Scanner （System.in）先写这句话类似于先声明Scanner这个函数
        - sc.nextDouble();接收一个小数
        - sc.nextInt（）；获取键盘整数
        - sc.next();接收字符字符串
        - sc.nextLine（）接收字符串
        - next()：只读取到空格为止，不会读取空格后面的内容
nextLine()：读取整行内容，包括空格，直到遇到换行符为止
2. 换行符处理
next()：不会消耗换行符，换行符会留在输入流中
nextLine()：会消耗换行符，将其从输入流中移除
  - 字面量
    - 整数
      - 12
    - 小数
      - 1.2
    - 字符串
      - “charmmy”
    - 字符
      - ’男‘
    - 布尔类型
      - false，true
    - 空类型
      - null
  - 变量
    > 变量是存储数据的小空间，不是里面的数据
    > 经常发生改变的量
    - 数据类型  变量名=数据量
    - 变量的注意事项
      - 只能存一个值
      - 变量在使用前一定要赋值
      - 变量名不允许重复定义
      - 一条语句可以连续赋值
    - 成员变量（类里面的变量）
      - 实例变量
      - 静态成员变量
    - 局部变量
  - 可用方法
    - math.random(乱数生产[0~1)范围的数)但不是线程安全，高并发下不推荐
    - math.sqrt()对某一个数开平方
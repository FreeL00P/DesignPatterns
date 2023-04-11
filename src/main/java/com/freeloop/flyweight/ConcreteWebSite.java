package com.freeloop.flyweight;

/**
 * ConcreatWebSite
 *
 * @author fj
 * @since 2023/4/11 21:25
 */
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

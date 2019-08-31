package com.zde.bank;

/**
 * @version v1.0
 * @author: zdefys
 * @date: 2019/8/26 21:19
 */
public class Test {

    private AtmDao atmDao = new AtmDao();

    // 设计一个方法 目的是为了所有业务服务
    public User selectOne(String aname) {
        return atmDao.userBox.get(aname);
    }

    //网络银行的业务
    //设计一个业务方法登录
    public String login(String aname, String apassword) {
        User user = this.selectOne(aname);
        if (user != null && user.getApassword().equals(apassword)) {
            System.out.println("登录成功");
        }
        return "用户名或密码错误";
    }

    //设计一个方法  查询余额
    public Float queryBalance(String aname) {
        User user = this.selectOne(aname);
        return user.getAbalance();

    }

    //设计一个方法 存款
    public void deposit(String aname, Float depositMoney) {
        User user = this.selectOne(aname);
        user.setAbalance(user.getAbalance() + depositMoney);
        atmDao.update(user);
    }

    //设计一个方法 取款
    public void withdraw(String aname, Float withdraw) {
        User user = this.selectOne(aname);
        if (user.getAbalance()< withdraw){
            System.out.println("余额不足");
        } else {
            user.setAbalance(user.getAbalance() - withdraw);
            atmDao.update(user);
        }
    }



    //设计一个方法  转账
    public void transfer(String outName,String inName,Float transferMoney){
        User outUser = this.selectOne(outName);
        User inUser = this.selectOne(inName);
        if (outUser.getAbalance() > transferMoney){
            outUser.setAbalance(outUser.getAbalance() - transferMoney);
            inUser.setAbalance(inUser.getAbalance() + transferMoney);
            atmDao.update(outUser);
            atmDao.update(inUser);
            atmDao.commit();
        }else {
            System.out.println("余额不足");
        }
    }



}

package cn.caixiaobai.study;

import cn.hutool.core.date.DateUtil;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication
@MapperScan(value = {"cn.caixiaobai.study.dao","cn.caixiaobai.study.mapper.*"})
public class StudyApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(StudyApplication.class, args);
        Environment bean = run.getBean(Environment.class);
        System.out.println(
                "===================================┴┬┴┬／￣＼＿／￣＼ \n"+
                        "===================================┬┴┬┴▏　　▏▔▔▔▔▔▔▔＼\n"+
                        "===================================┴┬┴／＼　／　　　　　　＼\n"+
                        "===================================┬┴∕　　　　　　　／　　　）\n"+
                        "===================================┴┬▏加班加班！     　●／▏＼\n"+
                        "===================================┬┴▏　　　　　　　　　　　▔█ \n"+
                        "===================================┴◢██◣　　　　　　／＼＿＿／\n"+
                        "===================================┬█████◣　　　　　　　／　　　\n"+
                        "===================================┴█████████████◣　\n"+
                        "===================================◢██████████████▆▄\n"+
                        "===================================█◤◢██◣◥█████████◤＼　　\n"+
                        "===================================◥◢████　████████◤　　 ＼\n"+
                        "===================================┴█████　██████◤　　　　　 ﹨\n"+
                        "===================================┬│　　　│█████◤　　　　　　　　▏\n"+
                        "===================================┴│　　　│　　　　　　　　　　　　　　▏\n"+
                        "===================================┬∕　　　∕　　　　／▔▔▔＼　　　　 ∕\n"+
                        "===================================*∕＿＿_／﹨　　　∕　　　　　 ＼　　／＼\n"+
                        "===================================┴┬┴┬┴┬┴ ＼＿＿＿＼　　　　 ﹨／▔＼﹨／▔＼\n"+
                        "===================================▲△▲▲╓╥╥╥╥╥╥╥╥＼　　 ∕　 ／▔﹨　／▔\n"+
                        "===================================　＊＊＊╠╬╬╬╬╬╬╬╬＊﹨\n"+
                        "=================================== :: Spring Boot ::        (v2.3.4.RELEASE) \n" +
                        "================================================================================= \n"+
                        "================================================================================= \n"+
                        "================================================================================= \n"+
                        "===================================项目启动成功! \n"+
                        "===================================启动端口号："+bean.getProperty("server.port")+"\n"+
                        "===================================启动时间："+ DateUtil.date(System.currentTimeMillis())+"\n"+
                        "===================================项目访问链接：http://localhost:" +bean.getProperty("server.port")+bean.getProperty("server.servlet.context-path"));
    }

}

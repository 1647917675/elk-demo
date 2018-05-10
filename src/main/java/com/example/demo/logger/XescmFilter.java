package com.example.demo.logger;

import ch.qos.logback.classic.filter.ThresholdFilter;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.spi.FilterReply;
import lombok.Data;

/**
 * 〈功能简述〉<br/>
 * 〈鲜易供应链自定义 filter〉
 *
 * @author lw
 * @date 2018/4/25
 * @since 1.0.0
 */
@Data
public class XescmFilter extends ThresholdFilter{
    private String loggerName;

    @Override
    public FilterReply decide(ILoggingEvent event) {
        if (loggerName == null){
            super.decide(event);
        }
        if (loggerName.trim().equalsIgnoreCase("*")){
            super.decide(event);
        }

        if (event.getLoggerName().startsWith(loggerName)){
            return FilterReply.ACCEPT;
        }else {
            return FilterReply.DENY;
        }
    }

    @Override
    public void start() {
        System.err.println("开始拦截");
        super.start();
    }

    @Override
    public void stop() {
        System.err.println("结束拦截");
        super.stop();
    }
}
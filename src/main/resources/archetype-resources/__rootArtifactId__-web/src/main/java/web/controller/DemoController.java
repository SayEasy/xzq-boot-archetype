#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/*
 * www.xzq.com Inc.
 * Copyright (c) 2018 All Rights Reserved
 */

/*
 * 修订记录:
 * maxupeng@9ffenqigo.com 2018-07-11 14:41 创建
 *
 */
package ${package}.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author maxupeng@9ffenqigo.com
 */
@Controller
public class DemoController {
    @RequestMapping("/hello")
    @ResponseBody
    public String demo() {
        return "hello world";
    }
}

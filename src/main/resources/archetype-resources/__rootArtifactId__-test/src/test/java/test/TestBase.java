#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/*
 * www.xzq.com Inc.
 * Copyright (c) 2018 All Rights Reserved
 */

package ${package}.test;

import com.xzq.boot.core.Apps;
import com.xzq.boot.test.AppWebTestBase;
import org.springframework.boot.test.SpringApplicationConfiguration;
import ${package}.Main;

/**
 * @author maxupeng@9ffenqigo.com
 */
@SpringApplicationConfiguration(classes = Main.class)
public abstract class TestBase extends AppWebTestBase {
	protected static final String PROFILE = "sdev";
	
	static {
		Apps.setProfileIfNotExists(PROFILE);
	}
	
}

/*******************************************************************************
 * Copyright (c) 2010  Your Name <you@example.com>
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * www.eclipse.org—epl-v10.html <http://www.eclipse.org/legal/epl-v10.html>
 * 
 * Contact: http://www.bioclipse.net/    
 ******************************************************************************/
package net.bioclipse.chem.clustering.test;

import org.junit.BeforeClass;

public class JavaScriptClusteringManagerPluginTest
    extends AbstractClusteringManagerPluginTest {

    @BeforeClass public static void setup() {
        clustering = net.bioclipse.chem.clustering.Activator.getDefault()
            .getJavaScriptClusteringManager();
    }

}

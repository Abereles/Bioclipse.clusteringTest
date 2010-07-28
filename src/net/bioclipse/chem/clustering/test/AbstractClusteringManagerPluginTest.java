/*******************************************************************************
 * Copyright (c) 2010  Your Name <you@example.com>
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contact: http://www.bioclipse.net/
 ******************************************************************************/
package net.bioclipse.chem.clustering.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.List;

import net.bioclipse.core.ResourcePathTransformer;
import net.bioclipse.core.business.BioclipseException;
import net.bioclipse.core.domain.IMolecule.Property;
import net.bioclipse.chem.clustering.business.IClusteringManager;
import net.bioclipse.chem.clustering.clusterhandling.*;
import net.bioclipse.cdk.business.CDKManager;
import net.bioclipse.cdk.domain.CDKMolecule;


import org.junit.Assert;
import org.junit.Test;

public abstract class AbstractClusteringManagerPluginTest {

    protected static IClusteringManager clustering;
    
    @Test public void testDoSomething() {
    	final int NUM_CLUSTS = 2;
    	CDKManager cdk = new CDKManager();
    	ClusterList cL = new ClusterList();
    	Cluster c1 = new Cluster();
    	Cluster c2 = new Cluster();
    	Cluster c3 = new Cluster();
    	Cluster c4 = new Cluster();
    	Cluster c5 = new Cluster();
    	try{
    		c1.addElement(cdk.fromSMILES("CCC"));
    		c2.addElement(cdk.fromSMILES("OCO"));
    		c3.addElement(cdk.fromSMILES("CCC"));
    		c4.addElement(cdk.fromSMILES("O"));
    		c5.addElement(cdk.fromSMILES("CCC"));
    		
    	}catch (BioclipseException e) {System.out.println(e.getMessage());}
    	cL.add(c1);
    	cL.add(c2);
    	cL.add(c3);
    	cL.add(c4);
    	cL.add(c5);
        ClusterList results = clustering.doClustering(cL, NUM_CLUSTS);
        Assert.assertEquals(results.getSize(), NUM_CLUSTS);
    	
    }

}

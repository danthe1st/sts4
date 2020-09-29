/*******************************************************************************
 * Copyright (c) 2016 Pivotal, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Pivotal, Inc. - initial API and implementation
 *******************************************************************************/
package org.springframework.ide.eclipse.boot.dash.cf.client;

public interface CFServiceInstance extends CFEntity {

	String getName();
	String getService();
	String getPlan();
	String getDescription();
	String getDocumentationUrl();
	String getDashboardUrl();

	//TODO: last operation info?

}

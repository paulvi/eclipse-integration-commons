/*******************************************************************************
 *  Copyright (c) 2012 VMware, Inc.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *      VMware, Inc. - initial API and implementation
 *******************************************************************************/
package org.springsource.ide.eclipse.commons.frameworks.ui.internal.utils;

import org.eclipse.core.resources.IProject;

/**
 * @author Kris De Volder
 */
public abstract class ProjectFilter {

	public static final ProjectFilter anyProject = new ProjectFilter() {
		@Override
		public String toString() {
			return "AnyProjectFilter";
		}

		@Override
		public boolean isAcceptable(IProject project) {
			return project!=null;
		}
	};

	/**
	 * Returns true if a project should be retained and false if it should be filtered.
	 */
	public abstract boolean isAcceptable(IProject project);

}
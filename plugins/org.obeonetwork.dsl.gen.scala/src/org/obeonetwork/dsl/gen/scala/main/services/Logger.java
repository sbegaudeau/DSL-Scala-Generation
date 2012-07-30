/*******************************************************************************
 * Copyright (c) 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.obeonetwork.dsl.gen.scala.main.services;

import org.eclipse.core.runtime.Status;
import org.obeonetwork.dsl.gen.scala.DSL2ScalaPlugin;


/**
 * The logger.
 * @author sbegaudeau
 */
public class Logger {
	
	/**
	 * The constructor.
	 */
	private Logger() {
		// prevent instantiation
	}
	
	/**
	 * Logs an error in the console.
	 * 
	 * @param message The error message
	 * @return An empty string
	 */
	public static String logError(String message) {
		Status status = new Status(Status.ERROR, DSL2ScalaPlugin.PLUGIN_ID, message, null);
		DSL2ScalaPlugin.log(status);
		return "";
	}
	
	/**
	 * Logs a warning in the console.
	 * 
	 * @param message The warning message
	 * @return An empty string
	 */
	public static String logWarning(String message) {
		Status status = new Status(Status.WARNING, DSL2ScalaPlugin.PLUGIN_ID, message, null);
		DSL2ScalaPlugin.log(status);
		return "";
	}
	
	/**
	 * Logs an information in the console.
	 * 
	 * @param message The information message
	 * @return An empty string
	 */
	public static String logInformation(String message) {
		Status status = new Status(Status.OK, DSL2ScalaPlugin.PLUGIN_ID, message, null);
		DSL2ScalaPlugin.log(status);
		return "";
	}
}

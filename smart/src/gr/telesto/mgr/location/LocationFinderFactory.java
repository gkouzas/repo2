/*
 * Copyleft 2012 - Alessandro Staniscia
 * 
 * This file is part of mixare  and is used in Smart AR app.
 * 
 * This program is free software: you can redistribute it and/or modify it 
 * under the terms of the GNU General Public License as published by 
 * the Free Software Foundation, either version 3 of the License, or 
 * (at your option) any later version. 
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS 
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License 
 * for more details. 
 * 
 * You should have received a copy of the GNU General Public License along with 
 * this program. If not, see <http://www.gnu.org/licenses/>
 */
package gr.telesto.mgr.location;

import gr.telesto.MixContext;

/**
 * Factory Of  LocationFinder
 *
 */
public class LocationFinderFactory {
	
	/**
	 * Hide implementation Of LocationFinder
	 * @param mixContext
	 * @return LocationFinder
	 */
	public static LocationFinder makeLocationFinder(MixContext mixContext){
		return new LocationMgrImpl(mixContext);
	}

}

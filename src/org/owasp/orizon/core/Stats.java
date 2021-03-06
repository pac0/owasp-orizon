/**
 * This file is part of Owasp Orizon.
 * Owasp Orizon is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Owasp Orizon is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 */
package org.owasp.orizon.core;

import java.util.Vector;

import org.apache.log4j.Logger;

public class Stats {
	private Vector<Stat> stats;
	private Stat	aggregate;
	
	public Stats() {
		stats = new Vector<Stat>();
		aggregate = new Stat();
	}
	
	public Stat add(Stat s) {
		stats.add(s);
		aggregate.addLines(s.getLines());
		aggregate.addLineOfCode(s.getLineOfCode());
		aggregate.addLineOfComment(s.getLineOfComment());
		aggregate.addCyclomaticComplexityIndex(s.getCyclomaticComplexityIndex());
		return aggregate;
	}

	public Stat get() {
		return aggregate;
	}
	public String toString() {
		return aggregate.toString();
	}
}

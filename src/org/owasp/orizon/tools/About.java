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
package org.owasp.orizon.tools;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.owasp.orizon.core.Orizon;

/**
 * The very first tool is just a version bump tool.
 * 
 * @author thesp0nge
 * @since 1.31
 */
public class About {
	private static Logger log = Logger.getLogger(About.class);
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Simply don't care about params.
		 */
		PropertyConfigurator.configure(Orizon.getLog4jConf());
		log.info(org.owasp.orizon.core.About.about());
		if (Orizon.isInDebugMode())
			log.info("Orizon is running in debug mode");
		if (Orizon.beVerbose())
			log.info("Orizon is running in verbose mode");
		log.info("log4j configuration stored at: " + Orizon.getLog4jConf());
		log.info("----------------------------------------");
		log.info("How to run a tool: ");
		log.info(" * java -cp orizon-tool-"+
				org.owasp.orizon.core.About.ORIZON_MAJOR+
				"." + org.owasp.orizon.core.About.ORIZON_MINOR+
				".jar -Dlog4jconfname=conf/log4j.conf tools");
		log.info("----------------------------------------");
		log.info("Available tools are:");
		log.info(" * org.owasp.orizon.tools.About: this tool. Lists tools and displays some engine infos.");
		log.info(" * org.owasp.orizon.tools.Detect: given a web application root specified as parameter, it tries to detect the web application kind.");
		log.info(" * org.owasp.orizon.tools.J2EEDump: given a web application root specified as parameter, dumps the information retrieved from config files");
		return ;
	}

}

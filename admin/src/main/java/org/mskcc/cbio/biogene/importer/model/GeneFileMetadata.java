/** Copyright (c) 2013 Memorial Sloan-Kettering Cancer Center.
 **
 ** This library is free software; you can redistribute it and/or modify it
 ** under the terms of the GNU Lesser General Public License as published
 ** by the Free Software Foundation; either version 2.1 of the License, or
 ** any later version.
 **
 ** This library is distributed in the hope that it will be useful, but
 ** WITHOUT ANY WARRANTY, WITHOUT EVEN THE IMPLIED WARRANTY OF
 ** MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE.  The software and
 ** documentation provided hereunder is on an "as is" basis, and
 ** Memorial Sloan-Kettering Cancer Center
 ** has no obligations to provide maintenance, support,
 ** updates, enhancements or modifications.  In no event shall
 ** Memorial Sloan-Kettering Cancer Center
 ** be liable to any party for direct, indirect, special,
 ** incidental or consequential damages, including lost profits, arising
 ** out of the use of this software and its documentation, even if
 ** Memorial Sloan-Kettering Cancer Center
 ** has been advised of the possibility of such damage.  See
 ** the GNU Lesser General Public License for more details.
 **
 ** You should have received a copy of the GNU Lesser General Public License
 ** along with this library; if not, write to the Free Software Foundation,
 ** Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.
 **/
package org.mskcc.cbio.biogene.importer.model;

public class GeneFileMetadata
{

	// bean properties
	private String path;
	private String filename;
	private Boolean fetchFile;
	private Boolean importFile;

    /**
     * Create a CaseIDFilterMetadata instance with properties in given array.
	 * Its assumed order of properties is that from google worksheet.
     *
	 * @param properties String[]
     */
    public GeneFileMetadata(String[] properties)
	{

		if (properties.length < 4) {
            throw new IllegalArgumentException("corrupt properties array passed to constructor");
		}

		this.path = properties[0].trim();
		this.filename = properties[1].trim();
		this.fetchFile = new Boolean(properties[2].trim());
		this.importFile = new Boolean(properties[3].trim());
	}

	public String getPath() { return path; }
	public String getFilename() { return filename; }
	public Boolean fetchFile() { return fetchFile; }
	public Boolean importFile() { return importFile; }
}
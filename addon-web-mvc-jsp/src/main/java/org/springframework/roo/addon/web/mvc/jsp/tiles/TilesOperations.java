package org.springframework.roo.addon.web.mvc.jsp.tiles;

import org.springframework.roo.addon.web.mvc.controller.scaffold.WebScaffoldMetadata;

/**
 * Methods for manipulating Apache Tiles view configuration files.
 *
 * @author Stefan Schmidt
 * @since 1.1
 */
public interface TilesOperations {

	String DEFAULT_TEMPLATE = "default";

	String PUBLIC_TEMPLATE = "public";

	/**
	 * Adds a new view definition to the <code>views.xml</code> Tiles configuration in the given folder
	 *
	 * @param folderName the name of the folder under <code>/WEB-INF/views</code> (specified via the path attribute in {@link WebScaffoldMetadata}
	 * @param tilesViewName The simple name of the view (i.e. 'list', 'show', 'update', etc) or, if views are nested in sub-folders the name should be 'owner/list', 'owner/show', etc
	 * @param tilesTemplateName The template name (i.e. 'admin', 'public')
	 * @param viewLocation The location of the view in the Web application (i.e. "/WEB-INF/views/owner/list.jspx")
	 */
	void addViewDefinition(String folderName, String tilesViewName, String tilesTemplateName, String viewLocation);

	/**
	 * Removes a view definition from the <code>views.xml</code> Tiles configuration in the given folder
	 *
	 * @param name the simple name of the view to remove (i.e. 'list', 'show', 'update', etc)
	 * @param folderName the name of the folder under <code>/WEB-INF/views</code> (should not start with a slash)
	 */
	void removeViewDefinition(String name, String folderName);
}
/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package brix.plugin.gallery.web.tile;

import org.apache.wicket.Component;
import org.apache.wicket.model.IModel;

import org.brixcms.jcr.wrapper.BrixNode;
import org.brixcms.plugin.site.page.tile.Tile;
import org.brixcms.plugin.site.page.tile.admin.TileEditorPanel;

/**
 * @author wickeria at gmail.com
 */
public class GalleryTile implements Tile {
	public String getDisplayName() {
		return "Gallery";
	}

	public String getTypeName() {
		return "brix.plugin.gallery.tile.gallery";
	}

	public TileEditorPanel newEditor(String id, IModel<BrixNode> tileContainerNode) {
		return new GalleryTileEditor(id, tileContainerNode);
	}

	public Component newViewer(String id, IModel<BrixNode> tileNode) {
		return new GalleryPanel(id, tileNode);
	}

	public boolean requiresSSL(IModel<BrixNode> tileNode) {
		return false;
	}

}

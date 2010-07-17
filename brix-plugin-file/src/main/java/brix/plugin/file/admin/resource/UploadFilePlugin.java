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

package brix.plugin.file.admin.resource;

import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.ResourceModel;

import brix.jcr.wrapper.BrixNode;
import brix.plugin.hierarchical.HierarchicalPluginLocator;
import brix.plugin.hierarchical.admin.NodeEditorPlugin;
import brix.plugin.site.SimpleCallback;
import brix.registry.ExtensionPoint;

/**
 * @author wickeria at gmail.com
 */
public class UploadFilePlugin implements NodeEditorPlugin {

	private HierarchicalPluginLocator pluginLocator;

	public UploadFilePlugin(HierarchicalPluginLocator pluginLocator) {
		this.pluginLocator = pluginLocator;
	}

	public static final ExtensionPoint<NodeEditorPlugin> POINT = new ExtensionPoint<NodeEditorPlugin>() {
		public brix.registry.ExtensionPoint.Multiplicity getMultiplicity() {
			return Multiplicity.COLLECTION;
		}

		public String getUuid() {
			return UploadFilePlugin.class.getName();
		}
	};

	@Override
	public String getName() {
		return "files";
	}

	@Override
	public String getNodeType() {
		return "resources";
	}

	@Override
	public IModel<String> newCreateNodeCaptionModel(IModel<BrixNode> parentNode) {
		return new ResourceModel("uploadFiles");
	}

	@Override
	public Panel newCreateNodePanel(String id, IModel<BrixNode> parentNode, SimpleCallback goBack) {
		return new UploadResourcesPanel(id, parentNode, goBack, pluginLocator);
	}

}
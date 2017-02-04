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

package org.brixcms.plugin.hierarchical.nodes;

import javax.jcr.Node;

import org.brixcms.jcr.api.JcrSession;

public class SimpleFolderNode extends TitledNode {

    public static final String JCR_PRIMARY_TYPE = "nt:folder";

    public SimpleFolderNode(Node delegate, JcrSession session) {
        super(delegate, session);
    }

}

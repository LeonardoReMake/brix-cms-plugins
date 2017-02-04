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

package org.brixcms.plugin.hierarchical;

import javax.jcr.NamespaceRegistry;
import javax.jcr.RepositoryException;
import javax.jcr.Session;
import javax.jcr.Workspace;

import org.brixcms.Brix;
import org.brixcms.BrixRepositoryInitializer;
import org.brixcms.jcr.RepositoryInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This simply initializes the repository with the namespace needed for this
 * plugin.
 * 
 * @author Jeremy Thomerson
 */
public class HierarchicalRepoInitializer implements RepositoryInitializer {
    private static final Logger logger = LoggerFactory.getLogger(BrixRepositoryInitializer.class);

    public void initializeRepository(Brix brix, Session session) throws RepositoryException {
        final Workspace w = session.getWorkspace();
        NamespaceRegistry nr = w.getNamespaceRegistry();

        try {
            logger.info("Registering HierarchicalNodePlugin JCR Namespace: {}", HierarchicalNodePlugin.NAMESPACE);
            nr.registerNamespace(HierarchicalNodePlugin.NAMESPACE, "http://brix-cms-plugins.googlecode.com");
        } catch (Exception ignore) {
            // log.warn("Error registering brix namespace, may already be
            // registered",
            // ignore);
        }
    }

}

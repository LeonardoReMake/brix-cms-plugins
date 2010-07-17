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

package brix.plugin.file.web;

import org.apache.wicket.ajax.calldecorator.AjaxCallDecorator;

/**
 * @author wickeria at gmail.com
 */
public class ConfirmAjaxCallDecorator extends AjaxCallDecorator {

	private static final long serialVersionUID = 1L;

	@Override
	public CharSequence decorateScript(CharSequence script) {
		return "var b = confirm('Are you sure?'); if (!b) return false; " + script;
	}
}

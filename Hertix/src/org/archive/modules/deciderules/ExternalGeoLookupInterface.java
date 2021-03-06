/*
 *  This file is part of the Heritrix web crawler (crawler.archive.org).
 *
 *  Licensed to the Internet Archive (IA) by one or more individual 
 *  contributors. 
 *
 *  The IA licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.archive.modules.deciderules;

import java.io.Serializable;
import java.net.InetAddress;

/**
 * Interface used by {@link ExternalImplDecideRule}.
 * @author stack
 * @version $Date: 2011-09-12 02:12:44 +0000 (Mon, 12 Sep 2011) $, $Revision: 7240 $
 * @see ExternalImplDecideRule
 */
public interface ExternalGeoLookupInterface extends Serializable {
    /**
     * @param obj Object to evaluate
     * @return String of a country code that the object belongs to.
     */
    public String lookup (InetAddress obj);
}

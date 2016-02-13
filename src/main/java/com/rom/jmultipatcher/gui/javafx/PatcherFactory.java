/* JMultiPatcher - yet another rompatcher utility
 Copyright © 2014 Josef Andersson <josef.andersson@fripost.org>

 This file is part of JMultiPatcher.

 JMultiPatcher is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 any later version.

 JMultiPatcher is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with JMultiPatcher.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.rom.jmultipatcher.gui.javafx;

import com.rom.jmultipatcher.patchformat.IPatcher;
import com.rom.jmultipatcher.patchformat.IpsPatcher;
import com.rom.jmultipatcher.patchformat.UpsPatcher;

public enum PatcherFactory {
    
    INSTANCE;
    
    public IPatcher buildPatcher(final PatchType patchtype) {
        IPatcher patcher = null;
        switch (patchtype) {
            case IPS:
                patcher = new IpsPatcher();
                break;

            case UPS:
                patcher = new UpsPatcher();
                break;
            default:
                // throw some exception
                break;
        }
        return patcher;
    }

}

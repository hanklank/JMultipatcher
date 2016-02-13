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

public enum PatchType {

    IPS("ips"),
    UPS("ups");

    private final String patchType; //NOPMD

    private PatchType(final String patchType) {
        this.patchType = patchType;
    }
    
    public String getPatchType(){
        return patchType;
    }

}

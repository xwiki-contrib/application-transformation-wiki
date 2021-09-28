/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.xwiki.contrib.transformation.wiki.internal.pattern.expression;

import org.xwiki.rendering.block.SpecialSymbolBlock;

/**
 * Pattern block for a {@link SpecialSymbolBlock}.
 *
 * @version $Id$
 * @since 1.0
 */
public class SpecialSymbolPatternBlock implements PatternBlock<SpecialSymbolBlock>
{
    private char symbol;

    /**
     * Create a new {@link SpecialSymbolPatternBlock} bound to no particular symbol.
     */
    public SpecialSymbolPatternBlock()
    {

    }

    /**
     * Create a new {@link SpecialSymbolPatternBlock}, binding it to a specific symbol.
     *
     * @param symbol the symbol to match
     */
    public SpecialSymbolPatternBlock(char symbol)
    {
        this.symbol = symbol;
    }

    @Override
    public Class<SpecialSymbolBlock> getBlockClass()
    {
        return SpecialSymbolBlock.class;
    }

    @Override
    public boolean matches(SpecialSymbolBlock block)
    {
        return symbol == '\u0000' || symbol == block.getSymbol();
    }
}
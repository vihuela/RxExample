/*
 * Mr.Mantou - On the importance of taste
 * Copyright (C) 2015  XiNGRZ <xxx@oxo.ooo>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package ooo.oxo.mr.widget;

import android.content.Context;
import android.support.v4.widget.SwipeRefreshLayout;
import android.util.AttributeSet;
import android.util.TypedValue;

import ooo.oxo.mr.R;

public class OhSwipeRefreshLayout extends SwipeRefreshLayout {

    public OhSwipeRefreshLayout(Context context) {
        this(context, null);
    }

    public OhSwipeRefreshLayout(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypedValue colorAccent = new TypedValue();
        getContext().getTheme().resolveAttribute(R.attr.colorAccent, colorAccent, true);
        setColorSchemeResources(colorAccent.resourceId);
    }

}

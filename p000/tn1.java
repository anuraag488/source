package p000;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.chromium.net.C0995R;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class tn1 extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ArrayList f31256a;

    /* JADX INFO: renamed from: b */
    public ArrayList f31257b;

    /* JADX INFO: renamed from: c */
    public View.OnApplyWindowInsetsListener f31258c;

    /* JADX INFO: renamed from: d */
    public boolean f31259d;

    /* JADX INFO: renamed from: a */
    public final void m11069a(View view) {
        if (this.f31257b.contains(view)) {
            this.f31256a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Object tag = view.getTag(C0995R.id.fragment_container_view_tag);
        if ((tag instanceof pn1 ? (pn1) tag : null) != null) {
            super.addView(view, i, layoutParams);
        } else {
            nm0.m8796h("Views added to a FragmentContainerView must be associated with a Fragment. View ", view, " is not associated with a Fragment.");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        w05 w05VarM12042c;
        w05 w05VarM12042c2 = w05.m12042c(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f31258c;
        if (onApplyWindowInsetsListener != null) {
            w05VarM12042c = w05.m12042c(null, onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets));
        } else {
            int i = cy4.f16619a;
            WindowInsets windowInsetsM12043b = w05VarM12042c2.m12043b();
            if (windowInsetsM12043b != null && !windowInsetsM12043b.equals(windowInsetsM12043b)) {
                w05VarM12042c2 = w05.m12042c(this, windowInsetsM12043b);
            }
            w05VarM12042c = w05VarM12042c2;
        }
        if (!w05VarM12042c.f33012a.mo8172s()) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                int i3 = cy4.f16619a;
                WindowInsets windowInsetsM12043b2 = w05VarM12042c.m12043b();
                if (windowInsetsM12043b2 != null) {
                    WindowInsets windowInsetsM3760a = by4.m3760a(childAt, windowInsetsM12043b2);
                    if (!windowInsetsM3760a.equals(windowInsetsM12043b2)) {
                        w05.m12042c(childAt, windowInsetsM3760a);
                    }
                }
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.f31259d) {
            ArrayList arrayList = this.f31256a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                super.drawChild(canvas, (View) obj, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        ArrayList arrayList = this.f31256a;
        if (this.f31259d && !arrayList.isEmpty() && arrayList.contains(view)) {
            return false;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        this.f31257b.remove(view);
        if (this.f31256a.remove(view)) {
            this.f31259d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends pn1> F getFragment() {
        pn1 pn1Var;
        sn1 sn1Var;
        eo1 eo1VarM9577e;
        View view = this;
        while (true) {
            if (view == null) {
                pn1Var = null;
                break;
            }
            Object tag = view.getTag(C0995R.id.fragment_container_view_tag);
            pn1Var = tag instanceof pn1 ? (pn1) tag : null;
            if (pn1Var != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (pn1Var == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    sn1Var = null;
                    break;
                }
                if (context instanceof sn1) {
                    sn1Var = (sn1) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (sn1Var == null) {
                wb1.m12192k("View ", this, " is not within a subclass of FragmentActivity.");
                return null;
            }
            eo1VarM9577e = ((rn1) sn1Var.f30402v.f22555a).f29433x;
        } else {
            if (pn1Var.f27798u == null || !pn1Var.f27788k) {
                throw new IllegalStateException("The Fragment " + pn1Var + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            eo1VarM9577e = pn1Var.m9577e();
        }
        return (F) eo1VarM9577e.m5219C(getId());
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            }
            m11069a(getChildAt(childCount));
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        m11069a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        m11069a(getChildAt(i));
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        m11069a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            m11069a(getChildAt(i4));
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            m11069a(getChildAt(i4));
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.f31259d = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f31258c = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        if (view.getParent() == this) {
            this.f31257b.add(view);
        }
        super.startViewTransition(view);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }
}

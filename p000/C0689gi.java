package p000;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;

/* JADX INFO: renamed from: gi */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0689gi extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public HashMap f19797a;

    /* JADX INFO: renamed from: b */
    public HashMap f19798b;

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<AbstractC0492bi, wf2> getHolderToLayoutNode() {
        return this.f19797a;
    }

    public final HashMap<wf2, AbstractC0492bi> getLayoutNodeToHolder() {
        return this.f19798b;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (AbstractC0492bi abstractC0492bi : this.f19797a.keySet()) {
            abstractC0492bi.layout(abstractC0492bi.getLeft(), abstractC0492bi.getTop(), abstractC0492bi.getRight(), abstractC0492bi.getBottom());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (!(View.MeasureSpec.getMode(i) == 1073741824)) {
            q32.m9719a("widthMeasureSpec should be EXACTLY");
        }
        if (!(View.MeasureSpec.getMode(i2) == 1073741824)) {
            q32.m9719a("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        for (AbstractC0492bi abstractC0492bi : this.f19797a.keySet()) {
            int i4 = abstractC0492bi.f15305v;
            if (i4 != Integer.MIN_VALUE && (i3 = abstractC0492bi.f15306w) != Integer.MIN_VALUE) {
                abstractC0492bi.measure(i4, i3);
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            wf2 wf2Var = (wf2) this.f19797a.get(childAt);
            if (childAt.isLayoutRequested() && wf2Var != null) {
                wf2.m12245X(wf2Var, false, 7);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
    }
}

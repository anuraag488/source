package p000;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class wk1 {

    /* JADX INFO: renamed from: a */
    public static final int[] f33443a = new int[2];

    /* JADX INFO: renamed from: b */
    public static final Rect f33444b = new Rect();

    /* JADX INFO: renamed from: a */
    public static final jl3 m12314a(View view, View view2) {
        int[] iArr = f33443a;
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        view2.getLocationInWindow(iArr);
        int i3 = iArr[0];
        float f = i2 - iArr[1];
        Rect rect = f33444b;
        view.getFocusedRect(rect);
        float f2 = (i - i3) + rect.left;
        return new jl3(f2, rect.top + f, rect.width() + f2, f + rect.top + rect.height());
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m12315b(View view, Integer num, Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !viewGroup.hasFocus()) {
            return viewGroup.requestFocus(num.intValue(), rect);
        }
        if (view instanceof ViewTreeObserverOnGlobalLayoutListenerC1140sc) {
            return ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) view).requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return viewFindNextFocusFromRect != null ? viewFindNextFocusFromRect.requestFocus(num.intValue(), rect) : viewGroup.requestFocus(num.intValue(), rect);
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, viewGroup.hasFocus() ? viewGroup.findFocus() : null, num.intValue());
        return viewFindNextFocus != null ? viewFindNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }

    /* JADX INFO: renamed from: c */
    public static final Integer m12316c(int i) {
        if (i == 5) {
            return 33;
        }
        if (i == 6) {
            return 130;
        }
        if (i == 3) {
            return 17;
        }
        if (i == 4) {
            return 66;
        }
        if (i == 1) {
            return 2;
        }
        return i == 2 ? 1 : null;
    }

    /* JADX INFO: renamed from: d */
    public static final mk1 m12317d(int i) {
        if (i == 1) {
            return mk1.m8337a(2);
        }
        if (i == 2) {
            return mk1.m8337a(1);
        }
        if (i == 17) {
            return mk1.m8337a(3);
        }
        if (i == 33) {
            return mk1.m8337a(5);
        }
        if (i == 66) {
            return mk1.m8337a(4);
        }
        if (i != 130) {
            return null;
        }
        return mk1.m8337a(6);
    }
}

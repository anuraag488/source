package p000;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class c05 extends WindowInsetsAnimation.Callback {

    /* JADX INFO: renamed from: a */
    public b05 f15741a;

    /* JADX INFO: renamed from: b */
    public List f15742b;

    /* JADX INFO: renamed from: c */
    public ArrayList f15743c;

    /* JADX INFO: renamed from: d */
    public HashMap f15744d;

    /* JADX INFO: renamed from: a */
    public final d05 m3788a(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap map = this.f15744d;
        d05 d05Var = (d05) map.get(windowInsetsAnimation);
        if (d05Var != null) {
            return d05Var;
        }
        d05 d05Var2 = new d05();
        new WindowInsetsAnimation(0, null, 0L);
        wd3 wd3Var = new wd3((byte) 23);
        wd3Var.f33259b = windowInsetsAnimation;
        VarHandle.storeStoreFence();
        d05Var2.f16688a = wd3Var;
        map.put(windowInsetsAnimation, d05Var2);
        return d05Var2;
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.f15741a.mo3390a(m3788a(windowInsetsAnimation));
        this.f15744d.remove(windowInsetsAnimation);
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.f15741a.mo3391c(m3788a(windowInsetsAnimation));
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f15743c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f15743c = arrayList2;
            this.f15742b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) list.get(size);
            d05 d05VarM3788a = m3788a(windowInsetsAnimation);
            ((WindowInsetsAnimation) d05VarM3788a.f16688a.f33259b).setFraction(windowInsetsAnimation.getFraction());
            this.f15743c.add(d05VarM3788a);
        }
        return this.f15741a.mo3392d(w05.m12042c(null, windowInsets), this.f15742b).m12043b();
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        b05 b05Var = this.f15741a;
        d05 d05VarM3788a = m3788a(windowInsetsAnimation);
        yg3 yg3Var = new yg3((byte) 8);
        yg3Var.f35215b = g42.m5899b(bounds.getLowerBound());
        yg3Var.f35216c = g42.m5899b(bounds.getUpperBound());
        VarHandle.storeStoreFence();
        yg3 yg3VarMo3393e = b05Var.mo3393e(d05VarM3788a, yg3Var);
        yg3VarMo3393e.getClass();
        return new WindowInsetsAnimation.Bounds(((g42) yg3VarMo3393e.f35215b).m5900c(), ((g42) yg3VarMo3393e.f35216c).m5900c());
    }
}

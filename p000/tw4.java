package p000;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class tw4 extends vw4 implements Iterable, cc2 {

    /* JADX INFO: renamed from: a */
    public String f31492a;

    /* JADX INFO: renamed from: b */
    public float f31493b;

    /* JADX INFO: renamed from: c */
    public float f31494c;

    /* JADX INFO: renamed from: d */
    public float f31495d;

    /* JADX INFO: renamed from: e */
    public float f31496e;

    /* JADX INFO: renamed from: f */
    public float f31497f;

    /* JADX INFO: renamed from: g */
    public float f31498g;

    /* JADX INFO: renamed from: h */
    public float f31499h;

    /* JADX INFO: renamed from: i */
    public List f31500i;

    /* JADX INFO: renamed from: j */
    public ArrayList f31501j;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof tw4)) {
            return false;
        }
        tw4 tw4Var = (tw4) obj;
        return z62.m13387o(this.f31492a, tw4Var.f31492a) && this.f31493b == tw4Var.f31493b && this.f31494c == tw4Var.f31494c && this.f31495d == tw4Var.f31495d && this.f31496e == tw4Var.f31496e && this.f31497f == tw4Var.f31497f && this.f31498g == tw4Var.f31498g && this.f31499h == tw4Var.f31499h && z62.m13387o(this.f31500i, tw4Var.f31500i) && this.f31501j.equals(tw4Var.f31501j);
    }

    public final int hashCode() {
        return this.f31501j.hashCode() + ((this.f31500i.hashCode() + c75.m3874f(this.f31499h, c75.m3874f(this.f31498g, c75.m3874f(this.f31497f, c75.m3874f(this.f31496e, c75.m3874f(this.f31495d, c75.m3874f(this.f31494c, c75.m3874f(this.f31493b, this.f31492a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ma3 ma3Var = new ma3((byte) 1);
        ma3Var.f24786b = this.f31501j.iterator();
        VarHandle.storeStoreFence();
        return ma3Var;
    }
}

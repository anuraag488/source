package p000;

import java.lang.invoke.VarHandle;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ue0 implements Iterator {

    /* JADX INFO: renamed from: a */
    public int f31796a;

    /* JADX INFO: renamed from: b */
    public int f31797b;

    /* JADX INFO: renamed from: c */
    public int f31798c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ye0 f31799d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ byte f31800e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ye0 f31801f;

    public ue0(ye0 ye0Var, byte b) {
        this.f31800e = b;
        this.f31801f = ye0Var;
        this.f31799d = ye0Var;
        this.f31796a = ye0Var.f35154e;
        this.f31797b = ye0Var.isEmpty() ? -1 : 0;
        this.f31798c = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f31797b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj;
        ye0 ye0Var = this.f31799d;
        if (ye0Var.f35154e != this.f31796a) {
            C1077qn.m9983c();
            return null;
        }
        if (!hasNext()) {
            xy4.m12795x();
            return null;
        }
        int i = this.f31797b;
        this.f31798c = i;
        byte b = this.f31800e;
        ye0 ye0Var2 = this.f31801f;
        switch (b) {
            case 0:
                obj = ye0Var2.m13106j()[i];
                break;
            case 1:
                we0 we0Var = new we0();
                we0Var.f33267c = ye0Var2;
                Object obj2 = ye0.f35149j;
                we0Var.f33265a = ye0Var2.m13106j()[i];
                we0Var.f33266b = i;
                VarHandle.storeStoreFence();
                obj = we0Var;
                break;
            default:
                obj = ye0Var2.m13107k()[i];
                break;
        }
        int i2 = this.f31797b + 1;
        if (i2 >= ye0Var.f35155f) {
            i2 = -1;
        }
        this.f31797b = i2;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        ye0 ye0Var = this.f31799d;
        if (ye0Var.f35154e != this.f31796a) {
            C1077qn.m9983c();
            return;
        }
        dt0.m4722x("no calls to next() since the last call to remove()", this.f31798c >= 0);
        this.f31796a += 32;
        int i = this.f31798c;
        Object obj = ye0.f35149j;
        ye0Var.remove(ye0Var.m13106j()[i]);
        this.f31797b--;
        this.f31798c = -1;
    }
}

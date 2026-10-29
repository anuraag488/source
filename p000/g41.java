package p000;

import java.lang.invoke.VarHandle;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class g41 implements a24, h41 {

    /* JADX INFO: renamed from: a */
    public final a24 f19603a;

    /* JADX INFO: renamed from: b */
    public final int f19604b;

    public g41(a24 a24Var, int i) {
        this.f19603a = a24Var;
        this.f19604b = i;
        if (i >= 0) {
            return;
        }
        C1077qn.m9984h(i, "count must be non-negative, but was ", 46);
        throw null;
    }

    @Override // p000.h41
    /* JADX INFO: renamed from: a */
    public final a24 mo127a(int i) {
        int i2 = this.f19604b + i;
        return i2 < 0 ? new g41(this, i) : new g41(this.f19603a, i2);
    }

    @Override // p000.a24
    public final Iterator iterator() {
        f41 f41Var = new f41((byte) 0);
        f41Var.f18743b = this.f19603a.iterator();
        f41Var.f18744c = this.f19604b;
        VarHandle.storeStoreFence();
        return f41Var;
    }
}

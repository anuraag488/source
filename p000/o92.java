package p000;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class o92 extends ba2 implements Iterable {

    /* JADX INFO: renamed from: a */
    public ArrayList f26491a = new ArrayList();

    @Override // p000.ba2
    /* JADX INFO: renamed from: a */
    public final ba2 mo3522a() {
        ArrayList arrayList = this.f26491a;
        if (arrayList.isEmpty()) {
            return new o92();
        }
        int size = arrayList.size();
        o92 o92Var = new o92();
        o92Var.f26491a = new ArrayList(size);
        VarHandle.storeStoreFence();
        int size2 = arrayList.size();
        int i = 0;
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            o92Var.m9006t(((ba2) obj).mo3522a());
        }
        return o92Var;
    }

    @Override // p000.ba2
    /* JADX INFO: renamed from: b */
    public final boolean mo3523b() {
        return m9008v().mo3523b();
    }

    @Override // p000.ba2
    /* JADX INFO: renamed from: c */
    public final double mo3524c() {
        return m9008v().mo3524c();
    }

    @Override // p000.ba2
    /* JADX INFO: renamed from: d */
    public final float mo3525d() {
        return m9008v().mo3525d();
    }

    @Override // p000.ba2
    /* JADX INFO: renamed from: e */
    public final int mo3526e() {
        return m9008v().mo3526e();
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof o92) && ((o92) obj).f26491a.equals(this.f26491a);
        }
        return true;
    }

    public final int hashCode() {
        return this.f26491a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f26491a.iterator();
    }

    @Override // p000.ba2
    /* JADX INFO: renamed from: q */
    public final long mo3530q() {
        return m9008v().mo3530q();
    }

    @Override // p000.ba2
    /* JADX INFO: renamed from: r */
    public final Number mo3531r() {
        return m9008v().mo3531r();
    }

    @Override // p000.ba2
    /* JADX INFO: renamed from: s */
    public final String mo3532s() {
        return m9008v().mo3532s();
    }

    public final int size() {
        return this.f26491a.size();
    }

    /* JADX INFO: renamed from: t */
    public final void m9006t(ba2 ba2Var) {
        if (ba2Var == null) {
            ba2Var = sa2.f30035a;
        }
        this.f26491a.add(ba2Var);
    }

    /* JADX INFO: renamed from: u */
    public final void m9007u(String str) {
        ba2 ba2Var;
        ArrayList arrayList = this.f26491a;
        if (str == null) {
            ba2Var = sa2.f30035a;
        } else {
            gb2 gb2Var = new gb2();
            gb2Var.f19705a = str;
            VarHandle.storeStoreFence();
            ba2Var = gb2Var;
        }
        arrayList.add(ba2Var);
    }

    /* JADX INFO: renamed from: v */
    public final ba2 m9008v() {
        ArrayList arrayList = this.f26491a;
        int size = arrayList.size();
        if (size == 1) {
            return (ba2) arrayList.get(0);
        }
        C1077qn.m9989o(c75.m3877i(size, "Array must have size 1, but has size "));
        return null;
    }
}

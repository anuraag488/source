package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class db4 implements ag1 {

    /* JADX INFO: renamed from: a */
    public final float f16904a;

    /* JADX INFO: renamed from: b */
    public final float f16905b;

    /* JADX INFO: renamed from: c */
    public final Object f16906c;

    public db4(float f, float f2, Object obj) {
        this.f16904a = f;
        this.f16905b = f2;
        this.f16906c = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof db4) {
            db4 db4Var = (db4) obj;
            if (db4Var.f16904a == this.f16904a && db4Var.f16905b == this.f16905b && z62.m13387o(db4Var.f16906c, this.f16906c)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.InterfaceC1407zj
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final w42 mo4410a(sq4 sq4Var) {
        InterfaceC0691gk interfaceC0691gk;
        Object obj = this.f16906c;
        AbstractC0654fk abstractC0654fk = obj == null ? null : (AbstractC0654fk) sq4Var.f30508a.invoke(obj);
        int[] iArr = zw4.f36432a;
        boolean z = false;
        float f = this.f16904a;
        float f2 = this.f16905b;
        if (abstractC0654fk == null && f == 1.0f && f2 == 1500.0f) {
            interfaceC0691gk = yw0.f35559a;
        } else if (abstractC0654fk != null) {
            wd3 wd3Var = new wd3((byte) 17);
            int iMo4034b = abstractC0654fk.mo4034b();
            mi1[] mi1VarArr = new mi1[iMo4034b];
            for (int i = 0; i < iMo4034b; i++) {
                mi1VarArr[i] = new mi1(f, f2, abstractC0654fk.mo3608a(i));
            }
            wd3Var.f33259b = mi1VarArr;
            VarHandle.storeStoreFence();
            interfaceC0691gk = wd3Var;
        } else {
            w42 w42Var = new w42((byte) 19, z);
            w42Var.f33090b = new mi1(f, f2);
            VarHandle.storeStoreFence();
            interfaceC0691gk = w42Var;
        }
        w42 w42Var2 = new w42((byte) 20, z);
        w42Var2.f33090b = new C1283w7(interfaceC0691gk);
        VarHandle.storeStoreFence();
        return w42Var2;
    }

    public final int hashCode() {
        Object obj = this.f16906c;
        return Float.hashCode(this.f16905b) + c75.m3874f(this.f16904a, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }

    public /* synthetic */ db4(Object obj) {
        this(1.0f, 1500.0f, obj);
    }
}
